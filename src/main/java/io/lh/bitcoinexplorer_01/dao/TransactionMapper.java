package io.lh.bitcoinexplorer_01.dao;

import io.lh.bitcoinexplorer_01.dto.TransactionListDTO;
import io.lh.bitcoinexplorer_01.po.Transaction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransactionMapper {
    int deleteByPrimaryKey(String txhash);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    Transaction selectByPrimaryKey(String txhash);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);

//    custom
    List<Transaction> getRecentTransactionList();


    Transaction getTransactionByHash(String txHash);
}
