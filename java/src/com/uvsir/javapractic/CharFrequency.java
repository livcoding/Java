package com.uvsir.javapractic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
//	public static void main(String[] args) {
//	    // TODO Auto-generated method stub
//		String str = "Ajiti"; 
//        characterCount(str); 
//	}
	static void characterCount(String inputString) 
    {
		Map<Character,Integer> m = new HashMap<Character, Integer>();
		char[] arr = inputString.toCharArray();
		for(char c:arr) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}
		
		m.forEach((k,v)->System.out.println(k+""+v));
        Map<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
        char[] strArray = inputString.toCharArray(); 
        for (char c : strArray) { 
            if (charCountMap.containsKey(c)) {  
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
                charCountMap.put(c, 1); 
            } 
        } 
        charCountMap.forEach((key,value) -> System.out.println(key+" :"+value));
        // Printing the charCountMap 
        //for (Map.Entry entry : charCountMap.entrySet()) { 
         //   System.out.println(entry.getKey() + " " + entry.getValue()); 
        //} 
    } 
	
	
	//------------------------ second ---------------------
	
	public static void main(String[] args) {
		try {	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter any string: ");
			String s = br.readLine();
			s = s.toLowerCase(); // converting the string into lowercase
			int l = s.length(); // finding the length of the string
			char ch;
			System.out.println("Output:");
			System.out.println("=========================="); // this is just for styling the look of the output
			System.out.println("Alphabet\tFrequency");
			System.out.println("=======================");
	
//		        /* Counting frequency of alphabets begins below */
			int count = 0;
			for (char i = 'a'; i <= 'z'; i++) {
				count = 0;
				for (int j = 0; j < l; j++) {
					ch = s.charAt(j); // extracting characters of the string one by one
					if (ch == i) // first checking the whole string for 'a', then 'b' and so on
						count++; // increasing count of those aplhabets which are present in the string
				}
				if (count != 0)// printing only those alphabets whose count is not '0'
				{
					System.out.print(i + "" + count);
				}				
				
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
	}
}