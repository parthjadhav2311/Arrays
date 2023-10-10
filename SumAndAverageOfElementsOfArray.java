package com.prowings.basics.Array;

public class SumAndAverageOfElementsOfArray {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		int[] nums = {1,2,3};
		
		CalculateSumandAverage(nums);
				
				System.out.println("main method ended");
			}
			
			public static void CalculateSumandAverage(int[] nums)
			{
				int sum = 0;
				
				for(int n : nums)
				{
					sum += n;
				}
				System.out.println("Sum of all elements is : "+ sum);
				
				int average = sum/nums.length;
				
				System.out.println("Average of all elements is : "+ average);
				
			}

		}
		
	

