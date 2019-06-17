package com.baidu.day0615.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface BitcoinJsonRpcApi {

    JSONObject getBlockchainInfo() throws Throwable;

    JSONObject getBlockMempoolInfo() throws Throwable;

    JSONObject getBlockTxHash(String txhash) throws Throwable;

    JSONObject getBlockHash(String blockhash) throws Throwable;

    JSONObject getBlockNotxdetails(String blockhash) throws Throwable;

    JSONArray getHeaders(Integer count, String blockhash) throws Throwable;

    String getBlockHashByHeight(double height) throws Throwable;

    JSONObject getGetutxos(String checkmempool) throws Throwable;

}
