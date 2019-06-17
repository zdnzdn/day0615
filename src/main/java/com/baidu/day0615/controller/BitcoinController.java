package com.baidu.day0615.controller;

import com.alibaba.fastjson.JSONObject;
import com.baidu.day0615.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/block")
public class BitcoinController {
    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @GetMapping("/getBlock")
    public String getBlock(){
        JSONObject block = bitcoinRestApi.getBlockChainInfo();
        return block.toJSONString();
    }

    @GetMapping("/getBlockMempoolInfo")
    public String getBlockMempoolInfo(){
        JSONObject block = bitcoinRestApi.getBlockMempoolInfo();
        return block.toJSONString();
    }

    @GetMapping("/getBlockTxHash")
    public String getBlockTxHash(){
        JSONObject block = bitcoinRestApi.getBlockTxHash("59c9885dbb8e7c5315b09d41a78f598aaa69bb1596b7cd73fcecf520c35f78d7");
        return block.toJSONString();
    }

    @GetMapping("/getBlockHash")
    public String getBlockHash(){
        JSONObject block = bitcoinRestApi.getBlockHash("000000000000022129a0ae0289e59452a7368797cd5c46f1fd02acede6a061f2");
        return block.toJSONString();
    }

    @GetMapping("/getBlockNotxdetails")
    public String getBlockNotxdetails(){
        JSONObject block = bitcoinRestApi.getBlockNotxdetails("000000000000022129a0ae0289e59452a7368797cd5c46f1fd02acede6a061f2");
        return block.toJSONString();
    }

    @GetMapping("/getHeaders")
    public String getHeaders(){
        JSONObject block = bitcoinRestApi.getHeaders(4,"000000000000022129a0ae0289e59452a7368797cd5c46f1fd02acede6a061f2");
        return block.toJSONString();
    }

    @GetMapping("/getBlockHashByHeight")
    public String getBlockHashByHeight(){
        JSONObject block = bitcoinRestApi.getBlockHashByHeight(1544087);
        return block.toJSONString();
    }

    @GetMapping("/getGetutxos")
    public String getGetutxos(){
        JSONObject block = bitcoinRestApi.getGetutxos( "20c00000");
        return block.toJSONString();
    }
}
