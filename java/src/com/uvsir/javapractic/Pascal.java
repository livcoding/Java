package com.uvsir.javapractic;

import java.util.Scanner;

public class Pascal {
	public static void main(String [] args) {
		
	
//	Scanner s = new Scanner(System.in);
//	System.out.print("enter no of row");
//	int row = s.nextInt();
//	for(int i=0;i<row;i++) {
//		for(int j=0;j<row-i;j++) {
//			System.out.print(" ");
//		}
//		int number=1;
//		for(int k=0;k<=i;k++) {
//			System.out.print(number+" ");
//			number=number*(i-k)/(k+1);
//		}
//		System.out.println();
//	}
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of row ");
		int row = s.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			int number=1;
			for(int k=0;k<=i;k++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
}
}
