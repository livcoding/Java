package com.uvsir.javapractic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChar {
	 public static void main(String[] args) {
	        String aa = "nazar mohd";
	        String[] stringarray = aa.split("");        

	    Map<String , Long> map =  Arrays.stream(stringarray)
	        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	        map.forEach( (k, v) -> System.out.println(k + " : "+ v));
	    //System.out.println(map);
	        
	     
	    }
 
}
