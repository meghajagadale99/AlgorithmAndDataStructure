package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;

public class Calendar {
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the Month:");
        int month=Utility.inputInteger();
        System.out.println("Enter the Year:");
        int year=Utility.inputInteger();
        Utility.Calendar(month, year);
    }

}
