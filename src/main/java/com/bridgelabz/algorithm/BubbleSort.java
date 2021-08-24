package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 6, 3, 1};
        int sorted[] = Utility.bubbleSort(arr);

        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }
}
