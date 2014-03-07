package com.java.sorting;

/**
 * 
 * Implementation of Insertion Sort
 * Running Time of this algorithm is O(n2)
 * @author kirankumarkamisetty
 *
 */
public class InsertionSort {
	
	public static int[] sort(int [] input){
		
		for(int i=1;i< input.length;i++){
			int temp = input[i];
			int j;
			for(j=i-1 ; j >= 0 && temp < input[j]; j--){
				input[j+1] = input[j];
				input[j] = temp;
			}
			
		}
		
		return input;
	}
	
	public static void printResult(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = { 2, 5, 8, 4, 7, 6, 1 };
		input = sort(input);
		printResult(input);

	}

}
