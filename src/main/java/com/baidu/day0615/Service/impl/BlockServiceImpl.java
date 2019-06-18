package com.baidu.day0615.Service.impl;

import com.baidu.day0615.Service.BlockService;
import com.baidu.day0615.dao.BlockMapper;
import com.baidu.day0615.dto.BlockListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<BlockListDto> getRecentBlocks() {
        List<BlockListDto> blockListDtos = blockMapper.selectRecentBlocks();
        return blockListDtos;
    }
}
