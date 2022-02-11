package com.techelevator;

import java.math.BigDecimal;

public class Customer {

    private BigDecimal balance= new BigDecimal("0.00");


    public Customer(){

        }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal depositMoney(BigDecimal amountToDeposit) {
        balance = balance.add(amountToDeposit);
            return balance;



    }
}
