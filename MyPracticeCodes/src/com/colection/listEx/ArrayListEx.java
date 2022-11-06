package com.colection.listEx;

import com.employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("sai");
        name.add("ravi");
        name.add("satya");
        name.add(null);
        //[sai,ravi,satya]

//        for(int i=0;i<name.size();i++){
//            System.out.println(name.get(i));
//        }
        Iterator<String> it =name.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
    }
}
