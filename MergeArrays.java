package com.prowings.basics.Array;

import java.util.Arrays;

public class MergeArrays{

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6,4,5,7};

		System.out.println("Array1 :" +Arrays.toString(array1));
		System.out.println("Array2 :" +Arrays.toString(array2));

		int[] mergedArray1 = mergeArrays(array1, array2);

		int[] mergedArray2 = mergeArraysUsingForLoops(array1, array2);

		System.out.println("Merged Array Using System class method : "+Arrays.toString(mergedArray1));
		System.out.println("Merged Array Using for loop : "+Arrays.toString(mergedArray2));

	}

	public static int[] mergeArrays(int[] array1, int[] array2) {

		int totalLength = array1.length + array2.length;

		int[] mergedArray = new int[totalLength];

		
//		System -> arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
		
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);

		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		return mergedArray;

	}

	public static int[] mergeArraysUsingForLoops(int[] array1, int[] array2) {
		
		int totalLength = array1.length + array2.length;
		
		int[] mergedArray = new int[totalLength];
		

		for(int i=0; i<array1.length; i++)
		{
			mergedArray[i] = array1[i];
		}
		
		int counter =0;
		for(int i= array1.length; i<mergedArray.length; i++)
		{
			mergedArray[i] = array2[counter];
			counter++;
		}
		
		return mergedArray;
		
	}

}