package com.example;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
    	
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");

        System.out.println("Original List: " + list);


        HashSet<String> uniqueElements = new HashSet<>(list);
        
        System.out.println("List after removing duplicates: " + uniqueElements);
    }
}

