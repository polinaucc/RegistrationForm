package com.company.View;

public class View {
    public static final String WRONG_DATA = "Wrong data! Try again and enter data using pattern";
    public static final String INVITATION = "Let's fill in the registration form";
    public static final String ENTER = "Please, enter ";
    public static final String END = "Congratulations! You filled in all fields!";

    public void printMessage(String message){
        System.out.println(ENTER + message);
    }

    public void printWrongDataMessage(){
        System.out.println(WRONG_DATA);
    }

    public void printInvitationMessage(){
        System.out.println(INVITATION);
    }

    public void printEndText()
    {
        System.out.println(END);
    }

    public void printData(String name, String value){
        System.out.println(name + ": " + value);
    }
}
