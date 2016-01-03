package com.example.dmorin.mybank.accounts;

import com.example.dmorin.mybank.accounts.BankAccount;

/**
 * Created by DMorin on 1/3/2016.
 */
public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
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
