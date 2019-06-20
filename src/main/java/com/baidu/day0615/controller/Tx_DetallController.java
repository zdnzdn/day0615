package com.baidu.day0615.controller;

import com.baidu.day0615.dao.Tx_DetallMapper;
import com.baidu.day0615.po.Tx_Detall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detall")
public class Tx_DetallController {
    @Autowired
    private Tx_DetallMapper tx_detallMapper;

    @RequestMapping("/getTx_DetallByHash")
        public Tx_Detall getTx_DetallByHash(@RequestParam String hash){
            Tx_Detall tx_detall = tx_detallMapper.selectByPrimaryKey(hash);
            tx_detall.setAdress("1GPvNB8q5Da3ddzfjrheoLs8ifLtWZwwYUS");
            tx_detall.setAmount(0.74834387808);
            tx_detall.setTx_DetallId(1545346643);
            tx_detall.setTx_DetallId("fkdsalfj");
            return tx_detall;
    }
}
