package com.example.dmorin.mybank;

/**
 * Created by DMorin on 1/3/2016.
 */
public class SavingsAccount extends BankAccount {
    SavingsAccount() {
        super();
    }

    @Override
    public String getmType() {
        return "SAVINGS";
    }

    @Override
    public void withdraw(double amount) {
        if(this.numberOfWithdrawls() >= 3) {
            return;
        }
        super.withdraw(amount);
    }
}
