package com.baidu.day0615.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BitcoinScheduler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(fixedDelay = 3000)
    public void synData(){
        logger.info("begin to sync bitcoin data");
    }
}