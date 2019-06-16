package com.baidu.day0615.controller;

import com.baidu.day0615.dto.BlockGetDto;
import com.baidu.day0615.dto.BlockListDto;
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

    @GetMapping("/getRecentBlocks")
    public List<BlockListDto> getRecentBlocks(){
        ArrayList<BlockListDto> blockListDtos = new ArrayList<>();

        BlockListDto blockListDTO = new BlockListDto();
        blockListDTO.setBlockhash("00000000000000000013461ef0c1e4434e207a0d86fd168f58c2fc8f1ac4fcd0");
        blockListDTO.setHeight(580774 );
        blockListDTO.setTime(new Date());
        blockListDTO.setTxSize((short) 2390);
        blockListDTO.setSize(1257767);
        blockListDtos.add(blockListDTO);

        BlockListDto blockListDTO2 = new BlockListDto();
        blockListDTO2.setBlockhash("000000000000000000123ea17cda832d4800c075a41899375d47a5b033a42266");
        blockListDTO2.setHeight(580602);
        blockListDTO2.setTime(new Date());
        blockListDTO2.setTxSize((short) 2702);
        blockListDTO2.setSize(113874);
        blockListDtos.add(blockListDTO2);

        return blockListDtos;
    }

    @GetMapping("/getByBlockhash")
    public BlockGetDto getByBlockhash(@RequestParam String blockhash){
        BlockGetDto blockGetDto = new BlockGetDto();

        blockGetDto.setBlockhash("00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b");
        blockGetDto.setHeight(580643);
        blockGetDto.setPrevHash("00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDto.setNextHash("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockGetDto.setTime(new Date().getTime());
        blockGetDto.setTxsize((short) 2702);
        blockGetDto.setSize(1322496);
        blockGetDto.setNumberTransaction(123456);
        blockGetDto.setWeight((float) 256321);
        blockGetDto.setOutputTotal("4545ds");
        blockGetDto.setTransactions(263.78);
        blockGetDto.setDifficulty(7409399249090.25);

        return blockGetDto;
    }

    @GetMapping("/getByHeight")
    public BlockGetDto getByHeight(@RequestParam Integer height){

        BlockGetDto blockGetDTO = new BlockGetDto();

        blockGetDTO.setBlockhash("00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b");
        blockGetDTO.setHeight(580643);
        blockGetDTO.setPrevHash("00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setNextHash("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockGetDTO.setTime(new Date().getTime());
        blockGetDTO.setTxsize((short) 2702);
        blockGetDTO.setSize(1322496);
        blockGetDTO.setTransactions(263.78);
        blockGetDTO.setDifficulty(7409399249090.25);

        return blockGetDTO;
    }

    @GetMapping("/getByHeight1")
    public BlockGetDto getByHeight1(@RequestParam Integer height){
        return null;
    }
}
