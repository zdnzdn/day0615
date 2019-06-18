package com.baidu.day0615.dao;

import com.baidu.day0615.dto.BlockListDto;
import com.baidu.day0615.po.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);

    List<BlockListDto> selectRecentBlocks();
}