package com.baidu.day0615.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BitcoinRestApi",url = "http://localhost:18332")
public interface BitcoinRestApi {

    @GetMapping("/rest/chaininfo.json")
    JSONObject getBlockChainInfo();

    @GetMapping("/rest/mempool/info.json")
    JSONObject getBlockMempoolInfo();

    @GetMapping("/rest/tx/{txhash}.json")
    JSONObject getBlockTxHash(@PathVariable("txhash") String txhash);

    @GetMapping("/rest/block{blockhash}.json")
    JSONObject getBlockHash(@PathVariable("blockhash") String blockhash);

    @GetMapping("/rest/notxdetails{blockhash}.json")
    JSONObject getBlockNotxdetails(@PathVariable("blockhash") String blockhash);

    @GetMapping("/rest/headers{count}.json")
    JSONObject getHeaders(@PathVariable("count") Integer count);

    @GetMapping("/rest/blockhashbyheight{height}.json")
    JSONObject getBlockHashByHeight(@PathVariable("height") double height);

    @GetMapping("/rest/getutxos{checkmempool}.json")
    JSONObject getGetutxos(@PathVariable("checkmempool") String checkmempool);
}
