package io.lh.bitcoinexplorer_01.controller;

import com.alibaba.fastjson.JSONObject;
import io.lh.bitcoinexplorer_01.api.BitcoinJsonRpcApi;
import io.lh.bitcoinexplorer_01.api.BitcoinRestApi;
import io.lh.bitcoinexplorer_01.dto.BlockGetDTO;
import io.lh.bitcoinexplorer_01.dto.BlockListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getrEecentBlocks() throws Throwable {
        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();

        JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
        Integer blockHeight = blockChainInfo.getInteger("blocks");
        Integer blockHeightFromHeight = blockHeight - 5;

        String blockhash = bitcoinJsonRpcApi.getBlockhashByHeight(blockHeightFromHeight);
        //todo up
        List<JSONObject> blockHeaders = bitcoinRestApi.getBlockHeaders(5, blockhash);

        for(Object blockHeader : blockHeaders){
            JSONObject jsonObject = (JSONObject) blockHeader;
            BlockListDTO blockListDTO = new BlockListDTO();
            blockListDTO.setBlockhash(jsonObject.getString("hash"));
            blockListDTO.setHeight(jsonObject.getInteger("height"));
            Long time = jsonObject.getLong("time");
            blockListDTO.setTime(new Date(1000*time).getTime());
            blockListDTO.setTxsize(jsonObject.getShort("nTx"));
            //todo
            blockListDTO.setSize(null);
            blockListDTOS.add(blockListDTO);
        }


        return blockListDTOS;
    }
//    @GetMapping("/getByBlockhash")
//    public BlockGetDTO getByBlockhash(@RequestParam String blockhash){
//        BlockGetDTO blockGetDTO = new BlockGetDTO();
//
//        return blockGetDTO;
//    }
//
//    @GetMapping("/getByHeight")
//    public BlockGetDTO getByHeight(@RequestParam Integer height) {
//        BlockGetDTO blockGetDTO = new BlockGetDTO();
//
//        return blockGetDTO;
//    }
}
