package com.example.dmorin.mybank;

import java.util.ArrayList;

/**
 * Created by DMorin on 1/1/2016.
 */
public abstract class BankAccount {
    public enum Type{CHECKING, SAVINGS;}
    private double mBalance = 0;
    private ArrayList<Double> mTransactions;
    public static final double OVERDRAFT_FEE = 30;
    private Type mType;

    BankAccount(){
        mTransactions = new ArrayList<Double>();
    }

    public String getmType(){
        return "error";
    }

    public double getmBalance() {
        double total = 0;
        for (int i=0;i < mTransactions.size(); i++){
            total += mTransactions.get(i);
        }
        return total;
    }

    public int numberOfWithdrawls(){
        int count = 0;
        for (int i = 0; i < mTransactions.size(); i++) {
            if (mTransactions.get(i) < 0 ){
                count++;
            }
        }
        return count;
    }

    public void withdraw (double amount){
        mTransactions.add(-amount);

        if (getmBalance() < 0){
            mTransactions.add(-OVERDRAFT_FEE);
        }
    }

    public void deposit (double amount){
        mTransactions.add(amount);
    }

}
