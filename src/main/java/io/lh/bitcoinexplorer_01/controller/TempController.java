package io.lh.bitcoinexplorer_01.controller;

import com.alibaba.fastjson.JSONObject;
import io.lh.bitcoinexplorer_01.api.BitcoinJsonRpcApi;
import io.lh.bitcoinexplorer_01.api.BitcoinRestApi;
import io.lh.bitcoinexplorer_01.dao.BlockMapper;
import io.lh.bitcoinexplorer_01.service.BitcoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
public class TempController {
    @Autowired
    private BitcoinRestApi bitcoinRestApi;
    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @Autowired
    private BlockMapper blockMapper;

    @Autowired
    private BitcoinService bitcoinService;

    @GetMapping("/test")
    public String test() throws Throwable {
        //JSONObject mempoolInfo = bitcoinRestApi.getMempoolInfo();
        //JSONObject mempoolInfo = bitcoinRestApi.getBlockNoDetails("000000000000011814d4acab99e4ee03267caa4193523fc2a894e0bf8d9b627d");
//        List<Object> mempoolInfo = bitcoinRestApi.getBlockHeaders(5,"000000000000011814d4acab99e4ee03267caa4193523fc2a894e0bf8d9b627d");
//        return JSONObject.toJSONString(mempoolInfo);

        //JSONObject mempoolInfo = bitcoinRestApi.getBlockNoDetails("000000000000011814d4acab99e4ee03267caa4193523fc2a894e0bf8d9b627d");
        //JSONObject blockchainInfo = bitcoinJsonRpcApi.getBlockchainInfo();
//        JSONObject block = bitcoinRestApi.getBlock("000000000933ea01ad0ee984209779baaec3ced90fa3f408719526f8d77f4943");
//        while (block){
        String tempBlockhash = "00000000000003d54baf5438615636d5ea94cc04068e9f06d2ade4128dde1688";
        bitcoinService.syncBlockchainFromHash(tempBlockhash);
        return null;
       }
}
