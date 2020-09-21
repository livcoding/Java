package com.uvsir.javapractic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new  Employee(101, "nazar"));
		emp.add(new  Employee(103, "AAA"));
		emp.add(new  Employee(102, "AAA"));
		emp.add(new  Employee(104, "developer"));
		
		List<Employee> result = emp.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		//List<Employee> r = emp.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee :: getId)).collect(Collectors.toList());
		
		List<Employee> res =emp.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList());
		

	}

}
