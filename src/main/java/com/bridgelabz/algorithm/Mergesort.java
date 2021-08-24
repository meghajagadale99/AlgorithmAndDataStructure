package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Mergesort {
    public static void main(String[] args) {

        int arr[] = {3, 4, 4, 24, 235, 2, 34, 23, 4, 34};
        Utility.sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
