package io.lh.bitcoinexplorer_01.service;

import io.lh.bitcoinexplorer_01.dto.BlockListDTO;

import java.util.List;

public interface BlockService {
    List<BlockListDTO> getRecentBlocks();
}
