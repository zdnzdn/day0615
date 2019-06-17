package com.baidu.day0615.api.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baidu.day0615.api.BitcoinJsonRpcApi;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.HashMap;

@Component
public class BitcoinJsonRpcApiImpl implements BitcoinJsonRpcApi{

    private JsonRpcHttpClient jsonRpcHttpClient;

    public BitcoinJsonRpcApiImpl(@Value("${bitcoin.jsonrpc.username}") String username,
                                 @Value("${bitcoin.jsonrpc.password}") String password,
                                 @Value("${bitcoin.jsonrpc.url}") String url) throws MalformedURLException {
        HashMap<String, String> headers = new HashMap<>();
        String authStrOrig = String.format("%s:%s",username,password);
        String authStr = Base64.getEncoder().encodeToString(authStrOrig.getBytes());
        String authStrResult = String.format("Basic %s",authStr);
        headers.put("Authorization",authStrResult);
        jsonRpcHttpClient = new JsonRpcHttpClient(new URL(url),headers);
    }

    @Override
    public JSONObject getBlockchainInfo() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getBlockchainInfo",new Object[]{},JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getBlockMempoolInfo() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getBlockMempoolInfo",new Object[]{},JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getBlockTxHash(String txhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getBlockTxHash",new Object[]{},JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getBlockHash(String blockhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getBlockHash",new Object[]{},JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getBlockNotxdetails(String blockhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getBlockNotxdetails",new Object[]{},JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONArray getHeaders(Integer count, String blockhash) throws Throwable {
        JSONArray jsonObject = jsonRpcHttpClient.invoke("getHeaders",new Object[]{},JSONArray.class);
        return jsonObject;
    }

    @Override
    public String getBlockHashByHeight(double height) throws Throwable {
        String jsonObject = jsonRpcHttpClient.invoke("getBlockHashByHeight",new Object[]{},String.class);
        return jsonObject;
    }

    @Override
    public JSONObject getGetutxos(String checkmempool) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getGetutxos",new Object[]{},JSONObject.class);
        return jsonObject;
    }
}
