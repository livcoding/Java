package com.uvsir.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LoopTest {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
//System.out.println("Enter Number: ");
//int number=s.nextInt();
/**	
   if(number>0) {System.out.println("the number "+number+" is positive");}
	else {System.out.println("the number "+number+" is not positive");}
*/
	//String str =(n>0)? "Positive":"negative or zero";
	//System.out.println("The number is "+str);
	
	Set<String> hs=new HashSet<>(); 
	hs.add("Java");
	hs.add("HTML");
	hs.add("CSS");
	System.out.println("hello "+hs); //insertion order not maintain
	Iterator<String> itr=hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("Enter Day Number: ");	
	int dayNumber=s.nextInt();
	String dayName;
	switch(dayNumber) {
	case 1:
		dayName = "Sunday";
		break;
	case 2:
		dayName = "Monday";
		break;
	case 3:
		dayName = "Tuesday";
		break;
	case 4:
		dayName = "Tuesday";
		break;
	case 5:
		dayName = "Wednesday";
		break;
	case 6:
		dayName = "Thursday";
		break;
	case 7:
		dayName = "Friday";
		break;
		default:
			dayName = "Invalid";
			break;
	}
	System.out.println("The day is: "+dayName);
	//calculator using switch
for(int i=0; i<=7; i++) {
	if(i==2) {
		continue;
	}
System.out.println(i+"");
}	
}
}