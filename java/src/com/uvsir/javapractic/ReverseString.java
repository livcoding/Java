package com.uvsir.javapractic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string");
		String str = sc.nextLine();
		String temp = "";
		String reverse = "";
		String strreverse = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != 32)
			 temp =temp+str.charAt(i);
			if(str.charAt(i) == 32 || i == str.length()-1) {
				for(int j=temp.length()-1;j>=0;j--) {
					reverse = reverse+temp.charAt(j);
					if(j == 0 && i != str.length()-1) {
						reverse +=" ";
					}
				}
				temp="";
			}
			
		}
		System.out.println(reverse);
//		String[] arr = str.split(" ");
//		for (int j = 0; j < arr.length; j++) {
//			String re = arr[j];
//			reverse = "";
//			for (int i = re.length() - 1; i >= 0; i--) {
//				reverse = reverse + re.charAt(i);
//			}
//			strreverse = strreverse + reverse + " ";
//		}
//		System.out.println(strreverse);
	}
}
