package com.company;

import java.util.regex.Pattern;

public interface RegexContainer {

    Pattern UkrSurnamePattern = Pattern.compile("^[А-ЩЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$");
    Pattern LatinSurnamePattern = Pattern.compile("^[A-Z][a-z]{2,}");
    Pattern UkrNamePattern = Pattern.compile("^[А-ЩЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$");
    Pattern LatinNamePattern = Pattern.compile("^[A-Z][a-z]{2,}");
    Pattern UkrSecondNamePattern = Pattern.compile("(^[А-ЩЇЮЯІ][а-щїюяіь']{2,})(ович$|івна$|ївна$)");
    Pattern LatinSecondNamePattern = Pattern.compile("");
    Pattern loginPattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{1,20}$");
    Pattern groupPattern = Pattern.compile("Group A|Group B");
    Pattern mobilePhonePattern = Pattern.compile("[+][0-9]+[(]?[0-9]{3}[)]?[0-9]{3}[-]?[0-9]{3}");
    Pattern emailPattern = Pattern.compile("(\\w{6,})@(\\w+\\.)([a-z]{2,4})");
    Pattern skypePattern = Pattern.compile("^[\\w]{5,31}$");
    Pattern indexPattern = Pattern.compile("[0-9]{5}");
    Pattern cityNamePattern = Pattern.compile("([A-Z][a-z]+)|([А-ЩЇЮЯІ][а-щїюяіь']+)");
    Pattern houseNumberPattern = Pattern.compile("[0-9]+[а-е]?");
    Pattern roomNumberPattern = Pattern.compile("[0-9]+");
    Pattern datePattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d");
}
