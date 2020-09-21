package com.uvsir.javapractic;

public class FactorialExample {

	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}
	
	static int factorial1(int nu) {
		if(nu ==1) {
			return 1;
		}
		else {
			return (nu * factorial1(nu -1));
		}
	}

	public static void main(String args[]) {
		//int  fact = 1;
		int number = 4;// It is the number to calculate factorial
		int fact = factorial(number);
		int n = factorial1(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
