package com.bridgelabz.datastructure;
import java.io.FileReader;
import com.bridgelabz.datastructure.base.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer> nw = new HashMap<Integer>();
        try {
            @SuppressWarnings("resource")
            FileReader file = new FileReader("src/main/resources/OrderedFIle.txt");
            int i =0;
            String sb = "";
            while((i=file.read())!=-1) {
                sb = sb+(char) i ;
            }
            System.out.println(sb);
            String arrr[] = sb.split(" ");
            int arr[] = new int[arrr.length];
            for(int j = 0 ; j<arrr.length;j++) {
                arr[j] = Integer.parseInt(arrr[j]);
            }
            for(int k : arr) {
                nw.add(k);
            }
            nw.display();
        }catch(Exception e) {
            System.out.println(e);
        }

    }
}
