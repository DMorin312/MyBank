package com.example.dmorin.mybank;

/**
 * Created by DMorin on 1/1/2016.
 */
public class BankAccount {
    private double mBalance = 0;

    public double getmBalance() {
        return mBalance;
    }

    public void withdraw (double amount){
        if (this.mBalance < amount){
            this.mBalance -= 30;
        }
        this.mBalance -= amount;
    }
    public void deposit (double amount){
        this.mBalance += amount;
    }

}
