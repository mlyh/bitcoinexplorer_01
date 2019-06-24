package io.lh.bitcoinexplorer_01.service;

import io.lh.bitcoinexplorer_01.dto.TransactionListDTO;
import io.lh.bitcoinexplorer_01.po.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {

    List<TransactionListDTO> getRecentranscationList();

    Transaction getTransactionByHash(String txHash);

}
