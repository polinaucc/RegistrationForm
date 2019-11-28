package com.company;

import com.company.View.View;
import com.company.controller.Controller;
import com.company.model.Model;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller = new Controller(new View(), new Model());
        controller.process();
    }
}
