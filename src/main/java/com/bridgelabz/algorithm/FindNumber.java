package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class FindNumber {


  public  static void main(String[] args) {
        new Utility();
        System.out.println("Enter the Nth value:");
        int n = Utility.inputInteger();
        int limit = (int) (Math.pow(2, n - 1));
        System.out.println("Think of a number between 0-" + (limit));
        int value = Utility.search(0, limit);
        if (value != -1) {
            System.out.println(n);
        } else {
            System.out.println("invalid");
        }

    }
}