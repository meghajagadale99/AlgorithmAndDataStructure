package com.bridgelabz.utility;

import com.bridgelabz.datastructure.base.Queue;
import com.bridgelabz.datastructure.base.Stack;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class Utility<T extends Comparable<? super T>> {
    // reusable static object for scanner class
    public static Scanner scan = new Scanner(System.in);
    // reusable static Object for PrintWriter class
    public static PrintWriter pw = new PrintWriter(System.out);


    public static int scanInt() {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static String ScanString() {
        try {
            return scan.nextLine();
        } catch (Exception e) {
            System.out.println();
        }
        return null;
    }

     public static String inputString() {
        try {
            return scan.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }


    public static String inputStringLine() {
        try {
            return scan.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

    public static int inputInteger() {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static double inputDouble() {
        try {
            return scan.nextDouble();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0.0;
    }

     public static boolean inputBoolean() {
        try {
            return scan.nextBoolean();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);

            sort(arr, m + 1, r);

            mergesort(arr, l, m, r);
        }
    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }


    public static void mergesort(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public void insertionSort1(T[] a) {
        int n = a.length;
        T value = null;
        for (int i = 1; i <= n - 1; i++) {
            value = a[i];
            int index = i;
            while (index > 0 && a[index - 1].compareTo(value) > 0) {
                a[index] = a[index - 1];
                index = index - 1;
            }
            a[index] = value;
        }
    }

     public static void selectionSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int m = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[m]) {
                    m = j;
                }
                int temp = arr[m];
                arr[m] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static int[] insertionSort(int[] a) {
        int n = a.length, value = 0, hole = 0;
        for (int i = 0; i <= n - 1; i++) {
            value = a[i];
            hole = i;
            while (hole > 0 && a[hole - 1] > value) {
                a[hole] = a[hole - 1];
                hole = hole - 1;
            }
            a[hole] = value;
        }
        return a;
    }


    public void bubbleSort(T[] a) {
        T temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

     public static void bubbleSort(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }


    public static void PrintArr(int a[][]) {
        for (int b[] : a) {
            for (int c : b) {

                pw.print(c + " ");
                pw.flush();
            }
            System.out.println();
        }
    }
     public static void PrintArr(double a[][]) {
        for (double b[] : a) {
            for (double c : b) {
                pw.print(c + " ");
                pw.flush();
            }
            System.out.println();
        }
    }

    public static void PrintArr(boolean a[][]) {
        for (boolean b[] : a) {
            for (boolean c : b) {
                if (c == true) {
                    pw.print("1 ");
                    pw.flush();
                } else {
                    pw.print("0 ");
                    pw.flush();
                }
            }
            System.out.println();
        }
    }

    public static int search(int low,int high) {
        if(low>high)
        {
            return -1;
        }
        else if(low==high)
        {
            return low;
        }
        int mid=(low+high)/2;
        System.out.println("Is you number between "+low+ " and "+mid);
        boolean flag=true;
        if(flag != Utility.inputBoolean() )
        {
            low=mid+1;
        }
        else
        {
            high=mid;
        }
        return search(low,high);
    }
    public static int[] count(String s) {
        s = s.toLowerCase();
        int[] c = new int[25];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 97]++;
        }
        return c;
    }
    public static int[] count(int n) {
        int[] count = new int[10];
        int temp = n;
        while (temp != 0) {
            int r = temp % 10;
            count[r]++;
            temp = temp / 10;
        }
        return count;
    }
    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] s1count = count(s1);
        int[] s2count = count(s2);
        for (int i = 0; i < s2count.length; i++) {
            if (s2count[i] != s1count[i]) {
                return false;
            }
        }
        return true;
    }
    public static void primePalindrome() {
        System.out.println();
        boolean b;
        for (int j = 2; j <= 1000; j++) {
            b = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b && isPalindrome(j))
                System.out.print(j + " ");
        }
    }

    public static void primeAnagrams() {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        System.out.println();
        boolean b;
        for (int j = 2; j <= 1000; j++) {
            b = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                ar.add(j);
        }
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if (anagram(ar.get(i), ar.get(j))) {
                    System.out.println(ar.get(i) + "  " + ar.get(j));
                }
            }
        }
    }


    public static boolean anagram(int n1, int n2) {
        int[] n1count = count(n1);
        int[] n2count = count(n2);
        for (int i = 0; i < n2count.length; i++) {
            if (n1count[i] != n2count[i]) {
                return false;
            }
        }
        return true;
    }
    public static void prime() {
        boolean b;
        for (int j = 2; j <= 1000; j++) {
            b = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.print(j + " ");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

    public static int binary(int[] arr, int n) {
        int high = arr.length - 1, low = 0, mid;
        Arrays.sort(arr);
        while (low <= high) {
            mid = (high + low) / 2;
            if (n == arr[mid]) {
                return mid;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int binary(String[] arr, String s) {
        int high = arr.length - 1, low = 0, mid;
        Arrays.sort(arr);

        while (low <= high) {
            mid = (high + low) / 2;
            if (s.equalsIgnoreCase(arr[mid])) {
                return mid;
            } else if (arr[mid].compareToIgnoreCase(s) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int[] toBinary(int d) {

        String bin = "";
        while (d != 0) {
            bin = (d % 2) + bin;
            d /= 2;
        }
        while (bin.length() % 4 != 0) {
            bin = 0 + bin;
        }
        return stringToIntArray(bin);
    }
    static int[] stringToIntArray(String bin) {
        int[] binary = new int[bin.length()];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = bin.charAt(i) - 48;
        }
        return binary;
    }

    public void sort(T[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            mergesort(arr, l, m, r);
        }
    }

    @SuppressWarnings("unchecked")
    public void mergesort(T[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];
        for (int i = 0; i < L.length; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < R.length; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    public static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public static void Calendar(int month, int year)
    {

        String[] months = {"January", "February", "March","April", "May", "June",
                "July", "August", "September","October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((month == 2) && (isLeap(year)))
        {
            days[month] = 29;
        }

        System.out.println("   " + months[month-1] + " " + year);
        System.out.println(" S  M Tu  W Th  F  St");
        int d = dayOfWeek(month, 1, year);

        for (int i = 0; i < d; i++)
        {
            System.out.print("   ");
        }

        for (int i = 1; i <= days[month-1]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month-1]))
                System.out.println();
        }
    }
    public static void CalendarQueue(int month,int year)
    {
        Queue weekday=new Queue();
        String[] months = {"January", "February", "March","April", "May", "June",
                "July", "August", "September","October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((month == 2) && (isLeap(year)))
        {
            days[month] = 29;
        }
        System.out.println("\t\t\t" + months[month-1] + " " + year);
        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
        int d = dayOfWeek(month, 1, year);
        for(int i=0;i<d;i++)
        {
            weekday.addFront("\t");
        }
        for (int i = 1; i <= days[month-1]; i++)
        {
            //System.out.printf("%2d ", i);
            weekday.addFront("\t"+i);
            if (((i + d) % 7 == 0) || (i == days[month-1]))
                weekday.addFront("\n");
        }
        weekday.disp();
    }
    public static void regularExpression(String firstname, String lastname, String mobile)
    {
        String message="Hello <<name>>, We have your full name as <<full name>> in our system.\n" +
                "Your contact number is 91-XXXXXXXXXX. Please,let us know in case of any\n" +
                "clarification.\nThank you BridgeLabz XX/XX/XXXX .";
        Date d=new Date();
        String date=new SimpleDateFormat().format(d);
        String name=firstname+" "+lastname;
        message=message.replace("<<name>>", firstname);
        message=message.replace("<<full name>>", name);
        message=message.replace("XXXXXXXXXX", mobile);
        message=message.replace("XX/XX/XXXX", date);
        System.out.println(message);
    }

    public static int numberOfBinarySearchTree(double totalNodes) {
        double n = factorial(2 * totalNodes);
        double d = (factorial(totalNodes + 1)) * (factorial(totalNodes));
        double differentTree = n / d;
        return (int) differentTree;

    }

    public static int factorial(double i) {
        int fact = 1;
        while (i > 0) {
            fact = (int) (fact * i);
            i--;
        }
        return fact;
    }
}