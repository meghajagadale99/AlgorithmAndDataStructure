package com.bridgelabz.datastructure.base;

public class HashMap<T> {

    Node<T>[] array = new Node[11];

    Node<T> next;

    public HashMap() {

    }


    public void add(T data) {
        Node<T> node = new Node<T>(data);
        int da = (int) data;
        int index = da % 11;
        if (array[index] == null) {
            array[index] = node;
        } else {
            Node<T> temp = array[index];

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        System.out.println("Remainder " + " values:-");
        for (int i = 0; i < array.length; i++) {
            Node<T> temp = array[i];
            boolean flag = true;
            if (temp != null) {
                flag = false;
                System.out.print(" [" + i + "]     ");
                while (temp != null) {
                    System.out.print(temp.data + "  ");
                    temp = temp.next;
                }
            } else {
                flag = true;
            }

            if (flag) {
                System.out.println(" [" + i + "]");
            } else {
                System.out.println();
            }
        }
    }
}