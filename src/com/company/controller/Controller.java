package com.company.controller;

import com.company.RegexContainer;
import com.company.view.TextConstants;
import com.company.view.View;
import com.company.model.*;

import java.util.Scanner;

public class Controller {
    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void process() {
        AddAccount accountBook = new AddAccount(view);
        Account account = accountBook.inputForm();
        tryToAddAccount(accountBook, account);
    }

    private void tryToAddAccount(AddAccount accountBook, Account account) {
        while (true) {
            try {
                model.setAccount(account);
                break;
            } catch (LoginExistException exc) {
                view.printMessage(TextConstants.INCORRECT_LOGIN);
                account = accountBook.enterNewLogin(account);
            }
        }
    }


}
