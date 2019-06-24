package io.lh.bitcoinexplorer_01.service.impl;

import io.lh.bitcoinexplorer_01.api.BitcoinJsonRpcApi;
import io.lh.bitcoinexplorer_01.api.BitcoinRestApi;
import io.lh.bitcoinexplorer_01.dao.BlockMapper;
import io.lh.bitcoinexplorer_01.dao.TransactionDetailMapper;
import io.lh.bitcoinexplorer_01.dao.TransactionMapper;
import io.lh.bitcoinexplorer_01.dto.TransactionListDTO;
import io.lh.bitcoinexplorer_01.po.Transaction;
import io.lh.bitcoinexplorer_01.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @Autowired
    private BlockMapper blockMapper;

    @Autowired
    private TransactionMapper transactionMapper;

    @Autowired
    private TransactionDetailMapper transactionDetailMapper;


    @Override
    public List<TransactionListDTO> getRecentranscationList() {

        List<Transaction> recentTransactionList = transactionMapper.getRecentTransactionList();

        List<TransactionListDTO> transactionListDTOS = new ArrayList<>();
        for (Transaction transaction : recentTransactionList) {
            TransactionListDTO transactionListDTO = new TransactionListDTO();
            transactionListDTO.setAmount(transaction.getAmount());
            transactionListDTO.setTxDetailId(transaction.getTxhash());
            transactionListDTOS.add(transactionListDTO);
        }
        return transactionListDTOS;
    }

    @Override
    public Transaction getTransactionByHash(String txHash) {
        Transaction transaction = transactionMapper.getTransactionByHash(txHash);
        return transaction;
    }
}
