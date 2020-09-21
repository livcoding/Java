package com.uvsir.javapractic;

import java.util.HashMap;

public class ZeroSumSubarray {
	public static void main(String arg[]) {
		int array[] = { 3, 5, 6, 9,11, 14, 8, 2, 12, 7, 7 };
		findSubArray(array, 14);
	}

//	private static void findSubArray(int[] array, int requiredSum) {
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			sum = array[i];
//			for (int j = i + 1; j < array.length; j++) {
//				sum = sum + array[j];
//				if (sum == requiredSum) {
//					for (int k = i; k <= j; k++) {
//						System.out.print(array[k] + " ");
//					}
//					System.out.println();
//				} else if (sum < requiredSum) {
//					continue;
//				}
//
//				// if 'sum' is greater than 'inputNumber', then break the loop
//
//				else if (sum > requiredSum) {
//					break;
//				}
//			}
//		}
//	}
	
	static void findSubArr(int [] arr,int num) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				sum =sum+arr[j];
				if(sum == num) {
					for(int k=i;k<j;k++) {
						System.out.println();
					}
				} else if(sum< num) {
					continue;
				}else if(sum > num) {
					break;
				}
			}
		}
	}
	
	static void findSubArray(int[] inputArray, int inputNumber)
    {     
        int sum = 0; 
        for (int i = 0; i < inputArray.length; i++)
        {
            sum = inputArray[i]; 
            for (int j = i+1; j < inputArray.length; j++)
            {
                sum = sum + inputArray[j]; 
                if(sum == inputNumber)
                { 
                    for (int k = i; k <= j; k++)
                    {
                        System.out.print(inputArray[k]+" ");
                    }
 
                    System.out.println();
                    sum=0;
                } 
                else if (sum < inputNumber)
                {
                    continue;
                } 
                else if (sum > inputNumber)
                {
                    break;
                }
            }
        }

    }
	}
