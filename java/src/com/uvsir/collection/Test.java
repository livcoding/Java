package com.uvsir.collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {

	List<String> l=new ArrayList<>();
	l.add("C");
	l.add("Java");
	l.add("HTML");
	l.add("CSS");
	l.add("JS");
	
	//dublicate allowed
	l.add("Java");
	
	//insertion order preserved
	System.out.println(l);
	
	//To Know how many elements in ArrayList
	System.out.println("The size of my List is "+l.size());
	
	 //Getting element of specific index 
    System.out.println(l.get(3));
	
    //Replacing the element at index 3 with "SASS"
    l.set(3, "SASS");
    
	//To check weather empty or not
	System.out.println(l.isEmpty());
	
	//To check particular element present or not
	System.out.println(l.contains("Mava") );
	
	//Getting the index of first occurrence of "JAVA"
    System.out.println(l.indexOf("Java"));     

    //Getting the index of last occurrence of "JAVA"
    System.out.println(l.lastIndexOf("Java"));   
    
    // converting list to Array
    Object[] arr=l.toArray();
    for(Object array : arr) {
    	System.out.println(array);
    	
    }

}
}
