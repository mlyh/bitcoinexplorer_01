package io.lh.bitcoinexplorer_01.controller;

import io.lh.bitcoinexplorer_01.dao.TransactionDetailMapper;
import io.lh.bitcoinexplorer_01.po.TransactionDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private TransactionDetailMapper transactionDetailMapper;

    @GetMapping("/getBalance")
    public Double getBalance(@RequestParam String address){
        Double balance = transactionDetailMapper.getBalance(address);
        return balance;
    }
}
