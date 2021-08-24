package com.bridgelabz.datastructure.base;

public class Stack<T extends Comparable<T>>{
    Node<T> head ;

    public  Stack() {
        head = null;
    }

    public void push(T item) {
        Node<T> node =new Node<T>(item);
        node.next =head;
        head = node;
    }


    public T pop() {
        T data = null;
        if(head == null) {
            System.out.println("stack is empty");
            return null;
        }
        else {
            data = (T) head.data;
            head = head.next;
        }
        return data;
    }


    public  T peek() {
        T data =  null;
        if( head  ==  null) {
            System.out.println(" stack is empty");
            return null;
        }
        else {
            data = (T) head.data;
        }
        return data;
    }

    public boolean isEmpty() {
        return head==null?true:false;
    }

    public int size() {
        Node<T> temp = head;
        int count= 0 ;
        while(temp.next!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void disp() {
        Node<T> temp = head;
        int count = 0  ;
        while(temp!=null) {
            if(count%2 == 0 ) {
                System.out.println();
            }
            System.out.print(temp.data+" ");
            temp = temp.next;
            count++;
        }
    }
}
