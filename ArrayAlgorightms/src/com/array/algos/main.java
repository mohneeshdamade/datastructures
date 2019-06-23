package com.array.algos;

import com.array.algos.arrayrotation.ArrayRotation;

public class main {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7};
		
		//System.out.println("Original Array : " + arr1.toString());
		//arr1 -> System.out.println(i);
		ArrayRotation.rotateArray(arr1, 2, arr1.length);

	}

}
