package com.uvsir.javapractic;

public class SubSet {

	public static void main(String[] args) {
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 15};

		int n = arr1.length;
		int m = arr2.length;

		if (isSubset(arr1, arr2))
			System.out.print("arr2[] is " + "subset of arr1[] ");
		else
			System.out.print("arr2[] is " + "not a subset of arr1[]");
	}

//	static boolean isSubset(int arr1[], int arr2[]) {
//		int i = 0;
//		int j = 0;
//		for (i = 0; i < arr2.length; i++) {
//			for (j = 0; j < arr1.length; j++)
//				if (arr2[i] == arr1[j])
//					break;
//			/*
//			 * If the above inner loop was not broken at all then arr2[i] is not present in
//			 * arr1[]
//			 */
//			if (j == arr2.length)
//				return false;
//		}

		/*
		 * If we reach here then all elements of arr2[] are present in arr1[]
		 */
		//return true;
	//}
		
//	int [] arr1 = {15,5,8,9}	;
//	int [] arr2 = {5,9};
//	
//	System.out.println(subSet( arr1 ,arr2));
//	
//		
//}
//	
	static boolean isSubset(int [] arr1, int [] arr2) {
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i] == arr2[i]) {
					break;
				}
				
				if(j== arr2.length) {
					return false;
				}
			}
		}
		
		return true;
	}
}
