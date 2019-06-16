package com.baidu.day0615.dto;

public class BlockGetDto {
    private String blockhash;
    private Integer height;
    private long time;
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
        this.blockhash = blockhash;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
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
        this.outputTotal = outputTotal;
    }

    public String getNextHash() {
        return nextHash;
    }

    public void setNextHash(String nextHash) {
        this.nextHash = nextHash;
    }

    public String getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash;
    }
}
