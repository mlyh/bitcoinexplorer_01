package io.lh.bitcoinexplorer_01.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public interface BitcoinService {

    void syncBlockchainFromHash(String blockhash) throws Throwable;

    String syncBlock(String blockhash) throws Throwable;

    void syncTx(JSONObject txJson, String blockhash, Date time, Integer confirmations) throws Throwable;

    void syncTxDetail(JSONObject txJson, String txid) throws Throwable;

    void syncTxDetailVout(JSONArray vouts,String txid);

    void syncTxDetailVin(JSONArray vins, String txid) throws Throwable;
}
