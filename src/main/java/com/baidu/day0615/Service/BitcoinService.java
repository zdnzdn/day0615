package com.baidu.day0615.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baidu.day0615.dto.BlockListDto;

import java.util.Date;
import java.util.List;

public interface BitcoinService {

    void synBlock(String blockhash);

    void syncTx(JSONObject jsonObject, String blockHash, Date time);

    void syncTxDetail(JSONObject jsonObject);

    void syncDetailvout(JSONArray vouts);

    void synDetailvin(JSONArray vins);
}
