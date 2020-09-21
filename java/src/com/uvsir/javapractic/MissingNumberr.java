package com.uvsir.javapractic;

public class MissingNumberr {
	
	//********************* find missing no (input array in order)
//public static void main(String [] args) {
//	int [] ar = {1,2,5,9};	
//	for (int i = 0; i < (ar.length - 1); i++) {
//        int next = ar[i + 1];
//        int current = ar[i];
//        if ((next - current) > 1) {
//            for (int ind = 1; ind < next - current; ind++)
//                System.out.println("Missing Value : " + (current + ind));
//        }
//    }
//}
	
	public static void main(String args[]) {

        // Given input Array from 1 to n 
        int [] input = { 0, 2, 2, 3, 5, 5, 7, 9, 9, 99 };
        // Calculate the max value in given Array
        int max = calculateArrayMaxValue(input);
        //Create another Array of same size 
        //By default all values initialize to 0
        // default value of int 
        int[] copyArray = new int[max+1];        
        //Iterate thorugh the input array
        //Mark all present numbers in copyArray
        for(int i : input) {
            copyArray[i] = 1;
        }       
        
        // Print the missing numbers
        System.out.print("Missing numbers in an array are : "); 
        
        for(int i=0 ;i < max; i++){
            if(copyArray[i]==0)
                System.out.print(i + " ");
        }
    }
    
    public static int calculateArrayMaxValue(int [] input) {    
        // Initialize maximum element 
        int max = input[0];         
        // Iterating array elements from second and 
        // compare every element with current max   
        for (int i = 1; i < input.length; i++) 
            if (input[i] > max) 
                max = input[i];         
        return max; 
        
    }
}
