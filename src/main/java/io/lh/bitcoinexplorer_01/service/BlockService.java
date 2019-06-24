package io.lh.bitcoinexplorer_01.service;

import io.lh.bitcoinexplorer_01.dto.BlockListDTO;
import io.lh.bitcoinexplorer_01.po.Block;

import java.util.List;

public interface BlockService {
    List<BlockListDTO> getRecentBlocks();

    Block getBlockByHeight(Integer height);
}
