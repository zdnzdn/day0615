package com.baidu.day0615.dto;

import java.util.Date;

public class BlockListDto {
    private String blockhash;
    private Integer height;
    private Date time;
    private Integer size;
    private Short txSize;

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Short getTxSize() {
        return txSize;
    }

    public void setTxSize(Short txSize) {
        this.txSize = txSize;
    }
}
