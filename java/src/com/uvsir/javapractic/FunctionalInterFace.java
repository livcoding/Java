package com.uvsir.javapractic;

@FunctionalInterface
public interface FunctionalInterFace {
	
	abstract void myFirst();
	
	default void test() {
		System.out.println("nazar");
	}
	
	static void test1() {
		
	}
}
