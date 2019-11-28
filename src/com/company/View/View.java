package com.company.View;

public class View {


    public void printMessage(String message){
        System.out.println(TextConstants.ENTER + message);
    }

    public void printWrongDataMessage(){
        System.out.println(TextConstants.WRONG_DATA);
    }

    public void printInvitationMessage(){
        System.out.println(TextConstants.INVITATION);
    }

    public void printEndText()
    {
        System.out.println(TextConstants.END);
    }

    public void printData(String name, String value){
        System.out.println(name + ": " + value);
    }
}
