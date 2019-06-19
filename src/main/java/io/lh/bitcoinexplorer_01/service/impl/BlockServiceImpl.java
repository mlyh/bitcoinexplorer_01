package io.lh.bitcoinexplorer_01.service.impl;

import io.lh.bitcoinexplorer_01.dao.BlockMapper;
import io.lh.bitcoinexplorer_01.dto.BlockListDTO;
import io.lh.bitcoinexplorer_01.po.Block;
import io.lh.bitcoinexplorer_01.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BlockServiceImpl implements BlockService {
    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<BlockListDTO> getRecentBlocks() {
        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();

        List<Block> blocks = blockMapper.selectRecentBlocks();

        for (Block block : blocks) {
            BlockListDTO blockListDTO = new BlockListDTO();
            blockListDTO.setBlockhash(block.getBlockhash());
            blockListDTO.setHeight(block.getHeight());
            blockListDTO.setTime(block.getTime().getTime());
            blockListDTO.setTxsize(block.getTxsize());
            blockListDTO.setSize(block.getSize());
            blockListDTOS.add(blockListDTO);
        }

        return blockListDTOS;
    }
}
