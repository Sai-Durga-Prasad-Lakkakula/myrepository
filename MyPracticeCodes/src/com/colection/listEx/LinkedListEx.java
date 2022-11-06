//Fetch and add the values in linked list
package com.colection.listEx;

import java.util.LinkedList;

public class LinkedListEx {
    private LinkedList<Integer> list = new LinkedList<Integer>();

    public LinkedList<Integer> saveEvenNumbers(int N) {
        list = new LinkedList<Integer>();

        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) list.add(i);
        }

        return list;
    }

    public LinkedList<Integer> printEvenNumbers() {
        LinkedList<Integer> newList = new LinkedList<Integer>();

        for (int item : list) {
            newList.add(item);
            System.out.println(item);
        }

        return newList;
    }

    public static void main(String[] args) {
        LinkedListEx lnk = new LinkedListEx();
        lnk.saveEvenNumbers(10);
        lnk.printEvenNumbers();


    }
}
