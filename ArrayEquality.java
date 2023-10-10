package com.prowings.basics.Array;

public class ArrayEquality {

static boolean checkquality(int[] number, int[] number1) {
		
		boolean isEqual = false;
		
		if(number.length == number1.length) {
			 for(int i=0; i<number.length; i++) {
				 if(number[i] == number1[i]) {
					 isEqual = true;
				 }
				 else {
					    isEqual = false;
					    return isEqual;
				 }
			 }
		}
		return isEqual;
}
	public static void main(String[] args) {
		 int[]  number = {1,2,4};
		 int[] number1 = {1,2,3};
		 
		 if(checkquality(number, number1))
			 System.out.println("Equal");
		 else
			 System.out.println("Not Equal");
	}
}

			 
