package com.uvsir.javapractic;

public class Test {

	public static void main(String[] args) {
	try {
		int a= 5/0;
	}catch (Exception e) {
		System.out.println(e);
		System.exit(0);
	}finally {
		System.out.println("java");
	}

	}

}
