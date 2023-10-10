package com.prowings.basics.Array;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {
	
	public static void main(String[] args) {
		
		int[] nums = {5,2,5,3,6,5,7,3};
		
    System.out.println("Original Array : " + Arrays.toString(nums));
    
    int[] uniqElements = removeDuplicates(nums);
    
    System.out.println("Unique Elements : " + Arrays.toString(uniqElements));
    
}

	public static int[] removeDuplicates(int[] nums) {
		
		int n = nums.length;
		
		for(int i =0; i < n; i++) {
			
		 for(int j = i + 1; j < n; j++) {
			 // If any two elements are found equal
			 
			 if(nums[i] == nums[j]) {
				 //Replace duplicate element with last unique element
				 
				 nums[j] = nums[n-1];
				 
				 n--;
				 
				 j--;
			 }
		 }
	}
	System.out.println("nums before copying to new array : "+Arrays.toString(nums));
	
	int[] result = Arrays.copyOf(nums, n);
		
		return result;
	}

}
