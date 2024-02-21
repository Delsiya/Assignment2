package com.sgic.java.util;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class assignment2 {

    public static String checkValidEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9_+]+@(yahoo\\.com|gmail\\.com)$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            return "Email is invalid";
        } else {
            return "Email is valid";
        }
    }

    private static void checkString(String name) {
        if (name != null && !name.isEmpty()) {
            System.out.println("The name entered is: " + name);
        } else {
            System.out.println("Name is null or empty");
        }
    }

    public static Date convertStringToDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static <T extends Number> T addNumbers(T num1, T num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Input numbers cannot be null");
        }

        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        } else if (num1 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Short) {
            return (T) Short.valueOf((short) (num1.shortValue() + num2.shortValue()));
        } else if (num1 instanceof Byte) {
            return (T) Byte.valueOf((byte) (num1.byteValue() + num2.byteValue()));
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public static class MainClass {

        public static void main(String[] args) {
            // Create a single Scanner object for all inputs
            Scanner scanner = new Scanner(System.in);

            // Email validation
            System.out.println("Enter your Email:");
            String email = scanner.nextLine();
            String emailResult = checkValidEmail(email);
            System.out.println(emailResult);

            // Name checking
            System.out.print("Enter a name: ");
            String enteredName = scanner.nextLine();
            checkString(enteredName);

            // Date conversion
            System.out.print("Enter a date in the format dd-MM-yyyy: ");
            String dateInput = scanner.nextLine();
            Date convertDateFormat = convertStringToDate(dateInput);
            if (convertDateFormat != null) {
                System.out.println("Converted Date: " + convertDateFormat);
            } else {
                System.out.println("Error converting the date. Please enter a valid date in the specified format.");
            }

            // Close the scanner to avoid resource leak
            scanner.close();
            Integer resultInt = addNumbers(5, 10);
            System.out.println("Sum of integers: " + resultInt);

            // Example usage with doubles
            Double resultDouble = addNumbers(3.5, 2.5);
            System.out.println("Sum of doubles: " + resultDouble);

            // Example usage with longs
            Long resultLong = addNumbers(100L, 200L);
            System.out.println("Sum of longs: " + resultLong);
        }
    }
        }
