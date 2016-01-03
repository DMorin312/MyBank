package com.example.dmorin.mybank.accounts;

import com.example.dmorin.mybank.accounts.BankAccount;

/**
 * Created by DMorin on 1/3/2016.
 */
public class CheckingAccount extends BankAccount {

    protected CheckingAccount() {
        super();
    }

    @Override
    public String getmType() {
        return "CHECKING";
    }
}
