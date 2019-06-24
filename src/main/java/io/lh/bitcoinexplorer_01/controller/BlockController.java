package io.lh.bitcoinexplorer_01.controller;

import com.alibaba.fastjson.JSONObject;
import io.lh.bitcoinexplorer_01.api.BitcoinJsonRpcApi;
import io.lh.bitcoinexplorer_01.api.BitcoinRestApi;
import io.lh.bitcoinexplorer_01.dto.BlockGetDTO;
import io.lh.bitcoinexplorer_01.dto.BlockListDTO;
import io.lh.bitcoinexplorer_01.po.Block;
import io.lh.bitcoinexplorer_01.service.BitcoinService;
import io.lh.bitcoinexplorer_01.service.BlockService;
import io.lh.bitcoinexplorer_01.service.impl.BitcoinServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/block")
public class BlockController {

    @Autowired
    private BlockService blockService;

    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getrEecentBlocks(){
        //String tempBlockhash = "00000000000021ce8803fad6ca2d56a2ebbf6e77e9821cf5e7fc0830e39c52d6";
        List<BlockListDTO> recentBlocks = blockService.getRecentBlocks();
        return recentBlocks;
    }

    @GetMapping("/getByHeight")
    public Block getByHeight(Integer height) {
        Block block = blockService.getBlockByHeight(height);
        return block;
    }

}
