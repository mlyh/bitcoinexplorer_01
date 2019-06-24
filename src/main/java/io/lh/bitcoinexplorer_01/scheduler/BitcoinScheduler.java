package io.lh.bitcoinexplorer_01.scheduler;

import io.lh.bitcoinexplorer_01.service.BitcoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BitcoinScheduler {

    @Autowired
    private BitcoinService bitcoinService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(fixedRate = 10*60*1000)//10分钟执行一次
    public void syncData() throws Throwable {
        logger.info("begin to sync bitcoin data");
//        String tempBlockhash = "00000000000003d54baf5438615636d5ea94cc04068e9f06d2ade4128dde1688";
//        bitcoinService.syncBlockchainFromHash(tempBlockhash);
    }
}
