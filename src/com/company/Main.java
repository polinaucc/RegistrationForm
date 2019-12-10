package com.company;

import com.company.model.Model;
import com.company.view.View;
import com.company.controller.Controller;
import com.company.model.Account;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller = new Controller(new View(), new Model());
        controller.process();
    }
}
