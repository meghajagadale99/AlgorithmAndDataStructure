package com.bridgelabz.algorithm;

import java.io.PrintWriter;

import com.bridgelabz.utility.Utility;

public class PrintPrime {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        System.out.println("enter number in 0- 1000");
        int n = Utility.scan.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                pw.print(i + " ");
                pw.flush();
            }
        }
        Utility.scan.close();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
