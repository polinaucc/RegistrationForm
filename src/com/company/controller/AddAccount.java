package com.company.controller;

import com.company.RegexContainer;
import com.company.model.Account;
import com.company.view.TextConstants;
import com.company.view.View;

public class AddAccount {
    View view;
    Account account;
    UtilController utilController;
    String lang;

    public AddAccount(View view) {
        this.view = view;
        this.utilController = new UtilController(view);
        this.account = new Account();
        this.lang = (String.valueOf(view.bundle.getLocale()).equals("ua"))?"ukr":"eng";

    }

    Account inputForm(){
        enterName();
        enterSecondName();
        enterSurname();
        enterLogin();
        enterGroup();
        enterMobilePhone();
        enterEmail();
        enterSkype();
        enterIndex();
        return account;
    }

    private void enterName(){
        account.setFirstName(utilController.inputData(TextConstants.firstName, (lang=="ukr")? RegexContainer.UkrNamePattern: RegexContainer.LatinNamePattern));
    }

    private void enterSecondName(){
        account.setSecondName(utilController.inputData(TextConstants.secondName, (lang=="ukr")? RegexContainer.UkrSecondNamePattern: RegexContainer.LatinSecondNamePattern));
    }

    private void enterSurname(){
        account.setSurname(utilController.inputData(TextConstants.surname, (lang=="ukr")? RegexContainer.UkrSurnamePattern: RegexContainer.LatinSurnamePattern));
    }

    Account enterNewLogin(Account account){
        account.setLogin(getEnteredLogin());
        return account;
    }

    private String getEnteredLogin(){
        return utilController.inputData(TextConstants.login, RegexContainer.loginPattern);
    }

    private void enterLogin(){
        account.setLogin(utilController.inputData(TextConstants.login, RegexContainer.loginPattern));
    }


    private void enterGroup(){
        account.setGroup(utilController.inputData(TextConstants.group, RegexContainer.groupPattern));
    }

    private void enterMobilePhone(){
        account.setMobilePhone(utilController.inputData(TextConstants.mobilePhone, RegexContainer.mobilePhonePattern));
    }

    private void enterEmail(){
        account.setEmail(utilController.inputData(TextConstants.email, RegexContainer.emailPattern));
    }

    private void enterSkype(){
        account.setSkype(utilController.inputData(TextConstants.skype, RegexContainer.skypePattern));
    }

    private void enterIndex(){
        account.setIndex(utilController.inputData(TextConstants.index, RegexContainer.indexPattern));
    }


}
