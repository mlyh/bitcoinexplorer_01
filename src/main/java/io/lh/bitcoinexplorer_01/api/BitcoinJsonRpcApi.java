package io.lh.bitcoinexplorer_01.api;

import com.alibaba.fastjson.JSONObject;

public interface BitcoinJsonRpcApi {
    JSONObject getBlockchainInfo() throws Throwable;

    JSONObject getBlockByHash(String blockhash) throws Throwable;

    JSONObject getTransactionById(String txid) throws Throwable;

    String getBlockhashByHeight(Integer height) throws Throwable;
}
