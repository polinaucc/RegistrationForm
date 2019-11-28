package com.company.controller;

import com.company.RegexContainer;
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

        view.printMessage("first name");
        model.setFirstName(inputData(scanner, RegexContainer.UkrNamePattern));

        view.printMessage("second name");
        model.setSecondName(inputData(scanner, RegexContainer.secondNamePattern));

        view.printMessage("surname");
        model.setSurname(inputData(scanner, RegexContainer.surnamePattern));

        view.printMessage("login");
        model.setLogin(inputData(scanner, RegexContainer.loginPattern));

        view.printMessage("mobile phone");
        model.setMobilePhone(inputData(scanner, RegexContainer.mobilePhonePattern));

        view.printMessage("skype");
        model.setSkype(inputData(scanner, RegexContainer.skypePattern));

        view.printMessage("index");
        model.setIndex(inputData(scanner, RegexContainer.indexPattern));

        view.printEndText();

        view.printData("first name", model.getFirstName());
        view.printData("second name", model.getFirstName());
        view.printData("surname", model.getFirstName());
        view.printData("login", model.getFirstName());
        view.printData("mobile phone", model.getFirstName());
        view.printData("skype", model.getFirstName());
        view.printData("index", model.getFirstName());
    }


    public String inputData(Scanner scanner, Pattern pattern) {
        String inputSrt = scanner.next();
        while (!pattern.matcher(inputSrt).matches()) {
            view.printWrongDataMessage();
            inputSrt = scanner.next();
        }
        return inputSrt;
    }

}
