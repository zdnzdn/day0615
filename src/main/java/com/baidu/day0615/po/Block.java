package com.baidu.day0615.po;

import java.util.Date;

public class Block {
    private String blockhash;

    private Integer height;

    private Date time;

    private Integer size;

    private Short txsize;

    private Double transactions;

    private Integer numberTransaction;

    private Double difficulty;

    private Float weight;

    private String outputTotal;

    private String nextHash;

    private String prevHash;

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash == null ? null : blockhash.trim();
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

    public Short getTxsize() {
        return txsize;
    }

    public void setTxsize(Short txsize) {
        this.txsize = txsize;
    }

    public Double getTransactions() {
        return transactions;
    }

    public void setTransactions(Double transactions) {
        this.transactions = transactions;
    }

    public Integer getNumberTransaction() {
        return numberTransaction;
    }

    public void setNumberTransaction(Integer numberTransaction) {
        this.numberTransaction = numberTransaction;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getOutputTotal() {
        return outputTotal;
    }

    public void setOutputTotal(String outputTotal) {
        this.outputTotal = outputTotal == null ? null : outputTotal.trim();
    }

    public String getNextHash() {
        return nextHash;
    }

    public void setNextHash(String nextHash) {
        this.nextHash = nextHash == null ? null : nextHash.trim();
    }

    public String getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash == null ? null : prevHash.trim();
    }
}