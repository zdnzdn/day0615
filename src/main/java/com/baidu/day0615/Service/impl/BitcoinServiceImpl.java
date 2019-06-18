package com.baidu.day0615.Service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baidu.day0615.Service.BitcoinService;
import com.baidu.day0615.api.BitcoinRestApi;
import com.baidu.day0615.dao.BlockMapper;
import com.baidu.day0615.dao.TransacationMapper;
import com.baidu.day0615.po.Block;
import com.baidu.day0615.po.Transacation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedHashMap;

@Service
public class BitcoinServiceImpl implements BitcoinService{

    @Autowired
    private BitcoinRestApi bitcoinRestApi;
    @Autowired
    private BlockMapper blockMapper;
    @Autowired
    private TransacationMapper transacationMapper;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void synBlock(String blockhash) {
        logger.info("begin to sync block from {}", blockhash);
        String tempBlockhash = blockhash;
        while(tempBlockhash!=null && !tempBlockhash.isEmpty()){
            JSONObject blockByHash = bitcoinRestApi.getBlockHash(tempBlockhash);
            Block block = new Block();
            block.setBlockhash(blockByHash.getString("hash"));
            block.setHeight(blockByHash.getInteger("height"));
            Long timestamp = blockByHash.getLong("time");
            Date time = new Date(timestamp * 1000);
            block.setTime(time);
            block.setSize(blockByHash.getInteger("size"));
            block.setDifficulty(blockByHash.getDouble("difficulty"));
            block.setWeight(blockByHash.getFloat("weight"));
            block.setNextHash(blockByHash.getString("nextblockhash"));
            block.setPrevHash(blockByHash.getString("previousblockhash"));
            block.setTransactions(blockByHash.getDouble("nTx"));
            Integer confirmations = blockByHash.getInteger("confirmations");
            blockMapper.insertSelective(block);
            
            JSONArray tx = blockByHash.getJSONArray("tx");
            for (Object o : tx) {
                JSONObject jsonObject = new JSONObject((LinkedHashMap) o);
                syncTx(jsonObject, tempBlockhash, time);
            }
            tempBlockhash = block.getNextHash();
        }
        logger.info("end sync block ");
    }

    @Override
    public void syncTx(JSONObject jsonObject, String blockHash, Date time) {

            Transacation transacation = new Transacation();
            transacation.setTxhash(jsonObject.getString("txid"));
            transacation.setTime(time);
            transacation.setBlockhash(blockHash);
            transacation.setSize(jsonObject.getInteger("size"));
            transacation.setWeight(jsonObject.getDouble("weight"));
            transacationMapper.insertSelective(transacation);

            syncTxDetail(jsonObject);
    }

    @Override
    public void syncTxDetail(JSONObject jsonObject) {

        JSONArray vout = jsonObject.getJSONArray("vout");
        syncDetailvout(vout);
        JSONArray vin = jsonObject.getJSONArray("vin");
        synDetailvin(vin);
    }

    @Override
    public void syncDetailvout(JSONArray vouts) {

        for (Object vout : vouts) {
            JSONObject jsonObject = new JSONObject((LinkedHashMap) vout);
        }
    }

    @Override
    public void synDetailvin(JSONArray vins) {

    }
}
