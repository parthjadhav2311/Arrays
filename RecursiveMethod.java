package com.prowings.basics.Array;

public class RecursiveMethod {
	
	public static void main(String[] args) {
		
		
		int i = 1;
		int n =10;
		
		int factorial = factorial(3);
		
		System.out.println("Factorial is : "+ factorial);
	}

	
	public static int factorial(int n) // recursive method
	{
		 if (n == 0) {
	            return 1;
	        } else {
	            // Recursive case: factorial(n) = n * factorial(n-1)
	            return n * factorial(n - 1);
	        }
	}

	
	
	
}