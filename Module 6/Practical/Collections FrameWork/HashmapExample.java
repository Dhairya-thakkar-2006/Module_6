package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class HashmapExample {
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
        
        // Creating a HashMap to store key-value pairs
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        
        System.out.println("HashMap contents: " + hashMap);
        

        int key = 2;
        System.out.println("Value for key " + key + ": " + hashMap.get(key));
    }
}
