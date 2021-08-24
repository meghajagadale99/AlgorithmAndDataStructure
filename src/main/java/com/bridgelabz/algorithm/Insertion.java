package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 6, 3, 2, 4};
        int sorted[] = Utility.insertionSort(arr);
        for (int k : sorted) {
            System.out.println(k);
        }
    }
}
