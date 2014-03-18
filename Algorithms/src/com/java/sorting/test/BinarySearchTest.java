package com.java.sorting.test;

import com.java.sorting.BinarySearch;
import com.java.sorting.InsertionSort;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = { 2, 5, 8, 4, 7, 6, 1 };
		
		input = InsertionSort.sort(input);
		
		InsertionSort.printResult(input);
		
		BinarySearch bs = new BinarySearch();
		
		System.out.println("Element found at :"+bs.search(input, 0, input.length-1, 6));

	}

}
