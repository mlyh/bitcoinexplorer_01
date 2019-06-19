package io.lh.bitcoinexplorer_01.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BitcoinScheduler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(fixedRate = 10*60*1000)//10分钟执行一次
    public void syncData(){
        logger.info("begin to sync bitcoin data");
    }
}
