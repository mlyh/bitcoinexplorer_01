package io.lh.bitcoinexplorer_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
@EnableAsync
@MapperScan("io.lh.bitcoinexplorer_01.dao")
public class Bitcoinexplorer01Application {

    public static void main(String[] args) {
        SpringApplication.run(Bitcoinexplorer01Application.class, args);
    }

}
