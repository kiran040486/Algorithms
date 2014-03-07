package com.java.sorting;

/**
 * 
 * @author Kiran Kumar Kamisetty
 * Implementation of Selection Sort
 * Running time of this algorithm is O(n2)
 *
 */

public class SelectionSort {

	public static int[] sort(int [] input){
		
		
		for(int i=0; i< input.length ; i++){
			int minIndex=i;
			for(int j =i+1; j< input.length ; j++){
				if(input[j] < input[minIndex]){
					minIndex = j;
				}
			}
			int minElement = input[minIndex];
			input[minIndex] = input[i];
			input[i] = minElement;
			
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
