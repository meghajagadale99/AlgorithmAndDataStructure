package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Prime {
    public static void main(String[] args) {
        System.out.println("prime between 0 to 1000");
        Utility.prime();
        System.out.println("prime no between 0 to 1000 also palindrome");
        Utility.primePalindrome();
        System.out.println("prime and anagrams");
        Utility.primeAnagrams();
    }
}
