package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {

    	ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        System.out.println("ArrayList: " + arrayList);
        
        arrayList.remove("Banana");
        System.out.println("ArrayList after removal: " + arrayList);


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");
        
        System.out.println("LinkedList: " + linkedList);
        
        linkedList.removeFirst();
        System.out.println("LinkedList after removal: " + linkedList);
    }
}
