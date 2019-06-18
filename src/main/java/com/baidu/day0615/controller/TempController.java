package com.baidu.day0615.controller;

import com.alibaba.fastjson.JSONObject;
import com.baidu.day0615.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
public class TempController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @GetMapping("/test")
    public String test(){
        JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
        return  blockChainInfo.toJSONString();

    }

}
