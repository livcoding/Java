package com.uvsir.javapractic;

import java.math.BigDecimal;

public class check {
//	public static int caluMaxValue(int arr[]) {
//		int max = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		return max;
//	}
//	
	public static void main(String args[]) {
//		int arr[] = {1,3,8,5,9};
//		int max = caluMaxValue(arr);
//		
//		int newarr[]=new int[max+1];
//		for(int i:arr) {
//			newarr[i]=1;
//		}
//		  System.out.println("Missing numbers in an array are : "); 
//		  for(int i=0 ;i < max; i++){
//	            if(newarr[i]==0)
//	                System.out.print(i + " ");
//	        }
//		
//		
//		System.out.println(max);
		
		 BigDecimal bg1, bg2;

	      bg1 = new BigDecimal("30");
	      bg2 = new BigDecimal("20");

	      //create int object
	      int res;

	      res = bg2.compareTo(bg1); // compare bg1 with bg2
	      System.out.println( res );
	}
	   
	
	
   
}
