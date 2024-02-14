package com.sgic.java.util;

public class StringValidation {
    public static void main(String[] args) {
        checkString("");
    }

    private static void checkString(String name) {
        if (name != null && !name.isEmpty()) {
            System.out.println("The name entered is: " + name);
        } else {
            System.out.println("Name is null or empty");
        }
    }
}
