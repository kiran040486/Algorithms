package com.java.datastructures;

public class ArrayProblems {

	public int findMax(int[] input) {
		int max = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i] > max)
				max = input[i];
		}

		return max;

	}

	public int findSecondMax(int[] input) {
		int max = input[0];
		int smax = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				smax = max;
				max = input[i];
			}

		}

		return smax;

	}

	public int findRepeatedNumber(int[] input) {
		int length = input.length;
		int expectedSum = ((length - 1) * (length - 2)) / 2;
		int actualSum = 0;
		for (int i = 0; i < length; i++) {
			actualSum += input[i];
		}

		return Math.abs(expectedSum - actualSum);

	}

	public boolean isPalindrome(String input) {
		input = input.toLowerCase();
		int length = input.length();

		boolean result = false;

		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) == input.charAt(length - 1 - i))
				result = true;
			else
				result = false;

		}
		return result;
	}

	public String reverse(String data) {

		if (data.length() == 1)
			return data.charAt(0) + "";

		return data.charAt(data.length() - 1)
				+ reverse(data.substring(0, data.length() - 1));

	}

	public int[] selectionSort(int[] input) {
		int min = 0;

		for (int i = 0; i < input.length; i++) {
			min = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[min]) {
					min = j;
				}

				if (min != i) {

					int temp = input[min];
					input[min] = input[i];
					input[i] = temp;

				}

			}

		}

		return input;

	}

	public int[] insertionSort(int[] input) {

		for (int i = 1; i < input.length; i++) {
			int temp = input[i];
			int j;
			for (j = i - 1; j >= 0 && temp < input[j]; j--) {
				input[j + 1] = input[j];
				input[j] = temp;
			}

		}

		return input;

	}

	public boolean checkPrimeNumber(int number) {
		boolean result = false;
		int num = (int) Math.sqrt(number);

		for (int i = 2; i <= num; i++) {
			if (number % i == 0) {
				result = false;
				return result;
			} else {
				result = true;
			}

		}

		return result;
	}

	public void printPrimeNumbers(int number) {
		System.out.println("Prime Numbers less than " + number + "are");
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		for (int i = 4; i < number; i++) {
			if (checkPrimeNumber(i)) {
				System.out.println(i);
			}
		}

	}
	
	public int reverseNumber(int number)
	{
	StringBuilder sb = new StringBuilder();
	int remainder =0;
	
	while(number > 0){
		remainder = number%10;
		number = number/10;
		sb.append(remainder);
		
	}
	System.out.println("Reversed number is :" + Integer.parseInt(sb.toString()));
	return Integer.parseInt(sb.toString());
	}
	
	public void permute( String input)
	{
	  int inputLength = input.length();
	  boolean[ ] used = new boolean[ inputLength ];
	  StringBuffer outputString = new StringBuffer();
	  char[ ] in = input.toCharArray( );
	  
	  doPermute ( in, outputString, used, inputLength, 0 );

	}

	public void doPermute ( char[ ] in, StringBuffer outputString, 
	                    boolean[ ] used, int inputlength, int level)
	  {
	     if( level == inputlength) {
	     System.out.println ( outputString.toString()); 
	     return;
	     }

	    for( int i = 0; i < inputlength; ++i )
	    {       

	       if( used[i] ) continue;

	       outputString.append( in[i] );      
	       used[i] = true;       
	       doPermute( in,   outputString, used, inputlength, level + 1 );       
	       used[i] = false;       
	         outputString.setLength(   outputString.length() - 1 );   
	    }
	 }


}
