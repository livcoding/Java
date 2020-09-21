package com.uvsir.javapractic;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {
public static void main(String [] args) {
	Employee e = new Employee(100,"nazar");
	Employee e2 = new Employee(100,"nazar");
	Set<Employee> s = new HashSet<Employee>();
//	e.setId(100);
//	e2.setId(100);
	s.add(e);
	s.add(e2);
	
	s.forEach(System.out::println);
	
	
}
	
	
}
