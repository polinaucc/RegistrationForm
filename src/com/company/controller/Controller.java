package com.company.controller;

import com.company.RegexContainer;
import com.company.View.TextConstants;
import com.company.View.View;
import com.company.model.Model;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {
    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        view.printInvitationMessage();

        view.printMessage(TextConstants.firstName);
        model.setFirstName(inputData(scanner, RegexContainer.UkrNamePattern));

        view.printMessage(TextConstants.secondName);
        model.setSecondName(inputData(scanner, RegexContainer.secondNamePattern));

        view.printMessage(TextConstants.surname);
        model.setSurname(inputData(scanner, RegexContainer.surnamePattern));

        view.printMessage(TextConstants.login);
        model.setLogin(inputData(scanner, RegexContainer.loginPattern));

        view.printMessage(TextConstants.group);
        model.setGroup(inputData(scanner, RegexContainer.groupPattern));

        view.printMessage(TextConstants.mobilePhone);
        model.setMobilePhone(inputData(scanner, RegexContainer.mobilePhonePattern));

        view.printMessage(TextConstants.email);
        model.setEmail(inputData(scanner, RegexContainer.emailPattern));

        view.printMessage(TextConstants.skype);
        model.setSkype(inputData(scanner, RegexContainer.skypePattern));

        view.printMessage(TextConstants.index);
        model.setIndex(inputData(scanner, RegexContainer.indexPattern));

        view.printEndText();

        view.printData(TextConstants.firstName, model.getFirstName());
        view.printData(TextConstants.secondName, model.getSecondName());
        view.printData(TextConstants.surname, model.getSurname());
        view.printData(TextConstants.login, model.getLogin());
        view.printData(TextConstants.group, model.getGroup());
        view.printData(TextConstants.mobilePhone, model.getMobilePhone());
        view.printData(TextConstants.email, model.getEmail());
        view.printData(TextConstants.skype, model.getSkype());
        view.printData(TextConstants.index, model.getIndex());
    }


    public String inputData(Scanner scanner, Pattern pattern) {
        String inputSrt = scanner.nextLine();
        while (!pattern.matcher(inputSrt).matches()) {
            view.printWrongDataMessage();
            inputSrt = scanner.nextLine();
        }
        return inputSrt;
    }

}
