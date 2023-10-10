package com.prowings.basics.Array;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray2 {

	public static void main(String[] args) {

		int[] nums = { 5, 2, 5, 3};

		System.out.println("Original Array : " + Arrays.toString(nums));

		int[] uniqElements = removeDuplicates(nums);

		System.out.println("Unique Elements : " + Arrays.toString(uniqElements));

	}

	public static int[] removeDuplicates(int[] nums) {
		
        // Check for null or empty arrays
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int n = nums.length;

        // Sort the array to bring duplicates together
        Arrays.sort(nums);

        // Count the number of unique elements
        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array to store unique elements
        int[] uniqueArr = new int[uniqueCount];
        uniqueArr[0] = nums[0];
        int currentIndex = 1;

        // Fill the unique array with unique elements
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                uniqueArr[currentIndex] = nums[i];
                currentIndex++;
            }
        }

        return uniqueArr;
		
	}

}
