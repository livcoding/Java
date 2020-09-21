package com.uvsir.javapractic;

import java.util.Arrays;

public class MultiplicationArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		// out put {6,8,15,24,30}
		//{2*3,2*4,
		int arr1=arr[0];		
		int [] out= new int[arr.length];
		for(int i=0;i<arr.length;i++) {	
				
				if(i != arr.length-1) {
					out[i]  = arr1 * arr[i+1];
					arr1  = arr[i+1]-1;
					
				}else {
					out[i]  = arr1 * arr[i];
				}
					
		}
		System.out.println(Arrays.toString(out));

	}

}
