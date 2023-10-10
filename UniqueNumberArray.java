package com.prowings.basics.Array;

import java.util.Arrays;

public class UniqueNumberArray {
	public static void main(String[] args) {

		int[] number = { 2, 3, 3, 2, 1 };

		int[] result = uniqueNumeber(number);
		System.out.println("elements in array are: " + Arrays.toString(number));

		System.out.println("unique elements of array are: " + Arrays.toString(result));

	}

	public  static int[] uniqueNumeber(int[] nums) {

		int n = nums.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					nums[j] = nums[n - 1];
					n--;
					j--;

				}

			}

		}
//		System.out.println(Arrays.toString(nums));
		int[] result = Arrays.copyOf(nums, n);
		return result;
	}
}
