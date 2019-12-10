package com.company.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String MESSAGES_BUNDLE_NAME = "textConstants";
    public static final ResourceBundle bundle =
           //ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua"));
             ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public void printMessage(String message){
        System.out.println(bundle.getString(TextConstants.ENTER)+ bundle.getString(message));
    }

    public void printWrongDataMessage(){
        System.out.println(bundle.getString(TextConstants.WRONG_DATA));
    }

    public void printInvitationMessage(){
        System.out.println(bundle.getString(TextConstants.INVITATION));
    }

    public void printEndText()
    {
        System.out.println(bundle.getString(TextConstants.END));
    }

    public void printData(String name, String value){
        System.out.println(name + ": " + value);
    }
}
