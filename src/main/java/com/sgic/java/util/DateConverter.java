package com.sgic.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    public static void main(String[] args) {
        String dateString = "14-02-2024";
        try {
            String convertedDateString = convertDateString(dateString);
            System.out.println("Converted Date String: " + convertedDateString);
        } catch (ParseException e) {
            System.out.println("Error converting date: " + e.getMessage());
        }
    }

    public static String convertDateString(String dateString) throws ParseException {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Parse the input string into a Date object
        Date date = inputDateFormat.parse(dateString);

        // Format the Date object into a new string with the desired format
        return outputDateFormat.format(date);
    }
}
