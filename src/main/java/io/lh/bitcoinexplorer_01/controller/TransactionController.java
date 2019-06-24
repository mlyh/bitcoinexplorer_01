package io.lh.bitcoinexplorer_01.controller;

import io.lh.bitcoinexplorer_01.dao.TransactionMapper;
import io.lh.bitcoinexplorer_01.dto.TransactionListDTO;
import io.lh.bitcoinexplorer_01.po.Transaction;
import io.lh.bitcoinexplorer_01.service.TransactionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/getRecentranscation")
    public List<TransactionListDTO> getRecentranscation(){
        List<TransactionListDTO> recentranscationList = transactionService.getRecentranscationList();

        return recentranscationList;
    }

    @GetMapping("/getTransactionBytxHash")
    public Transaction getTransactionBytxHash(@RequestParam String txHash){
        Transaction transactionByHash = transactionService.getTransactionByHash(txHash);
        return transactionByHash;
    }
}
