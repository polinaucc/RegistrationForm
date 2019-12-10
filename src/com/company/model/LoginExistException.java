package com.company.model;

public class LoginExistException extends Exception {
    private Account account;

    public LoginExistException(Account account) {
        this.account = account;
    }

    public Account getAccount(){
        return account;
    }
}
