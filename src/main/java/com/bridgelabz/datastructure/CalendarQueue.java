package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;

public class CalendarQueue {

    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the month:");
        int month = Utility.inputInteger();
        System.out.println("Enter the year:");
        int year = Utility.inputInteger();
        Utility.CalendarQueue(month, year);
    }
}