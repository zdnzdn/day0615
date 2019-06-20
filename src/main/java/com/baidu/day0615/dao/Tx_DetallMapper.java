package com.baidu.day0615.dao;

import com.baidu.day0615.po.Tx_Detall;

public interface Tx_DetallMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tx_Detall record);

    int insertSelective(Tx_Detall record);

    Tx_Detall selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tx_Detall record);

    int updateByPrimaryKey(Tx_Detall record);
}