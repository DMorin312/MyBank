package com.example.dmorin.mybank;

/**
 * Created by DMorin on 1/3/2016.
 */
public class CheckingAccount extends BankAccount{

    CheckingAccount() {
        super();
    }

    @Override
    public String getmType() {
        return "CHECKING";
    }
}
