package com.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Serialization_And_Deserialization 
{
	 public static void main(String[] args) 
	    {
	        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
	        
	        Set<Integer> set = new HashSet<>(list);
	        
	        List<Integer> uniqueList = new ArrayList<>(set);
	        
	        System.out.println("List after removing duplicates: " + uniqueList);
	    }
}

