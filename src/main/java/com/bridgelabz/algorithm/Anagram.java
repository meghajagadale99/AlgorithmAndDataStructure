package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Anagram {
    public static void main(String[] args) {
        try {
            System.out.println("enter first String......:");
            String str1 = Utility.scan.next();
            System.out.println("enter second String.....:");
            String str2 = Utility.scan.next();
            boolean result = Utility.anagram(str1, str2);
            if (result) {
                System.out.println("strings are anagram......");
            } else {
                System.out.println("Not anagram...........");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
