package com.array.algos.arrayrotation;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d 
 * 
 * https://www.geeksforgeeks.org/array-rotation/
 * 
 * @author Mohneesh
 *
 */
public class ArrayRotation {

	public static void rotateArray(int arr[],int d,int lengthOfArray){
		
		int j, temp ;
		//Loop for d times
		for(int i = 0; i< d;i++){
			//Store the first element in temp variable
			temp = arr[0];
			
			//Move the elements
			for(j=0; j < lengthOfArray -1 ; j++)
				arr[j] = arr[j+1];
			
			arr[j]=temp;
			
			printArray(arr);
		}
		
	}

	private static void printArray(int arr[]) {

		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	
}
