package com.baidu.day0615.dto;

import java.util.Date;

public class TransacationDto {
    private String transacationHash;
    private Date time;
    private double amount;

    public String getTransacationHash() {
        return transacationHash;
    }

    public void setTransacationHash(String transacationHash) {
        this.transacationHash = transacationHash;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
