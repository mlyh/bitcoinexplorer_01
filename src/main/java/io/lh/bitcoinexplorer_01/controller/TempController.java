package io.lh.bitcoinexplorer_01.controller;

import com.alibaba.fastjson.JSONObject;
import io.lh.bitcoinexplorer_01.api.BitcoinJsonRpcApi;
import io.lh.bitcoinexplorer_01.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {
    @Autowired
    private BitcoinRestApi bitcoinRestApi;
    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @GetMapping("/test")
    public String test() throws Throwable {
        //JSONObject mempoolInfo = bitcoinRestApi.getMempoolInfo();
        //JSONObject mempoolInfo = bitcoinRestApi.getBlockNoDetails("000000000000011814d4acab99e4ee03267caa4193523fc2a894e0bf8d9b627d");
//        List<Object> mempoolInfo = bitcoinRestApi.getBlockHeaders(5,"000000000000011814d4acab99e4ee03267caa4193523fc2a894e0bf8d9b627d");
//        return JSONObject.toJSONString(mempoolInfo);

        //JSONObject mempoolInfo = bitcoinRestApi.getBlockNoDetails("000000000000011814d4acab99e4ee03267caa4193523fc2a894e0bf8d9b627d");
        JSONObject blockchainInfo = bitcoinJsonRpcApi.getBlockchainInfo();
        return null;
    }
}
