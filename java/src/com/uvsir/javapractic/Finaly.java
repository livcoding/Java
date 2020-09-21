package com.uvsir.javapractic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Finaly {
	public static void main(String[] args) {
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 99 };
		int[] register = new int[input.length];
		for (int i : input)
		{ register[i] = 1;
		}

		System.out.println("missing numbers in given array"); 
		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) { 
				System.out.println(i); 
				} }

		
	
	}
}