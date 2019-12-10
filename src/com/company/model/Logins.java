package com.company.model;

public enum Logins {
    USER1("user1234"),
    USER2("camel151camel"),
    USER3("user_3");

    private final String login;

    Logins(String login){
        this.login=login;
    }

    public String getLogin() {
        return login;
    }
}
