package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class BinarySearchTree {
    public static void main(String[] args) {

        System.out.println("Enter the total number");
        double number=Utility.inputDouble();//taking user input

        while(number>0)
        {
            double totalNodes=Utility.inputDouble();//taking user input
            int totalTree=Utility.numberOfBinarySearchTree(totalNodes);//calling the method
            System.out.println(totalTree);
            number--;
        }
        //System.out.println("Invalid Character");//when condition false
    }

}
