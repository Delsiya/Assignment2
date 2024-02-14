package com.sgic.java.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAnEmail {

    public static void main(String[] args) {
        String email = "sgh5gc@gmail.com";
        System.out.println(valEmail(email));
    }

    public static String valEmail(String input) {
        String emailRegex =  "^[a-zA-Z0-9_+@]+@gmail\\.com$";
        Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input);

        if (matcher.matches()) {
            return "Email is Valid";
        } else {
            return "Email is Invalid";
        }
    }
}
