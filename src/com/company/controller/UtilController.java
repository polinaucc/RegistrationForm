package com.company.controller;

import com.company.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UtilController {
    private View view;
    private Scanner scanner;

    public UtilController(View view) {
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public String inputData(String message, Pattern pattern) {
        view.printMessage(message);
        String inputSrt = scanner.nextLine();
        while (!pattern.matcher(inputSrt).matches()) {
            view.printWrongDataMessage();
            inputSrt = scanner.nextLine();
        }
        return inputSrt;
    }
}
