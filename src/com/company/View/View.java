package com.company.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String MESSAGES_BUNDLE_NAME = "textConstants";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));
            //ResourceBundle.getBundle("LabelsBundle", new Locale("en"));

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
