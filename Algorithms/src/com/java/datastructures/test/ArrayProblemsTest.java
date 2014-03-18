package com.java.datastructures.test;

import com.java.datastructures.ArrayProblems;

public class ArrayProblemsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayProblems ap = new ArrayProblems();
		int[] input = {2,1,4,6,5,9,3};
		
		System.out.println("Max element is :"+ ap.findMax(input));
		System.out.println("Second Max element is :"+ ap.findSecondMax(input));
		
		int[] input1 ={0,1,2,4,3,6,5};
		System.out.println("Repeated Number is :"+ ap.findRepeatedNumber(input1));
		
		String in = "Kiran";
		if(ap.isPalindrome(in)){
			System.out.println("Given string is palindrome");
		}else{
			System.out.println("Is not palindrome");
		}
		
		input1 = ap.insertionSort(input1);
		
		for(int i=0; i< input1.length; i++){
			
			System.out.println(input1[i]);
		}
		System.out.println("Reverse of the string is :"+ ap.reverse(in));
		if(ap.checkPrimeNumber(1009)){
			System.out.println("Its prime number");
		}else{
			System.out.println("Its not a prime");
		}
		//ap.printPrimeNumbers(50);
		ap.reverseNumber(4149);
		ap.permute("ABCD");
	}

}
