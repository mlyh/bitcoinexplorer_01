package io.lh.bitcoinexplorer_01.dao;

import io.lh.bitcoinexplorer_01.po.TransactionDetail;
import org.apache.ibatis.annotations.Param;

public interface TransactionDetailMapper {
    int deleteByPrimaryKey(Long txDetailId);

    int insert(TransactionDetail record);

    int insertSelective(TransactionDetail record);

    TransactionDetail selectByPrimaryKey(Long txDetailId);

    int updateByPrimaryKeySelective(TransactionDetail record);

    int updateByPrimaryKey(TransactionDetail record);
    //    custom
    Double getBalance(@Param("address")String address);
}