package com.bridgelabz.algorithm;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class Searchword {

    public static String[] fileRead(File f) throws IOException {
        String word = "";
        ArrayList<String> s1 = new ArrayList<String>();
        FileReader fr = new FileReader(f);
        int c;
        while ((c = fr.read()) != -1) {
            if (c == 32) {
                s1.add(word);
                word = "";
            } else {
                word = word + String.valueOf((char) c);
            }
        }
        fr.close();
        String[] s = new String[s1.size()];
        s1.toArray(s);
        return s;
    }

    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/search.txt");
            String str[] = fileRead(file);
            for (String s : str) {
                System.out.println(s);
            }
            System.out.println("enter word to search");
            String s = Utility.scan.nextLine();
            int n = Utility.binary(str, s);
            if (n > 0) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
            Utility.scan.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
