package com.company.model;

public class Model {
    private Account account;

    public void setAccount(Account account)throws LoginExistException{
        checkLogin(account);
        this.account=account;
    }

    public void checkLogin(Account account) throws LoginExistException{
        for(Logins l: Logins.values()){
            if(l.getLogin().equals(account.login)) throw new LoginExistException(account);
        }
    }
}
