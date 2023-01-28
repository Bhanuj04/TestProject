package com.simple.Project4;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Linkedd2 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // add 4 at the end .
        System.out.println(list);

        list.add(1, 50); 
        System.out.println(list);

        List<Integer> newList = new ArrayList(); 
        newList.add(150);
        newList.add(160);

        list.addAll(newList); 
        System.out.println(list);

        System.out.println(list.get(1));
        
    }
}

    