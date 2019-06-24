package io.lh.bitcoinexplorer_01.dao;

import io.lh.bitcoinexplorer_01.po.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);

    List<Block> selectRecentBlocks();

    Block getBlockByHeight(Integer height);
}