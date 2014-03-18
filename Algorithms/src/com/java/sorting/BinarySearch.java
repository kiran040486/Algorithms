package com.java.sorting;
/**
 * Binary Search Implementation
 * @author Kiran Kumar Kamisetty
 *
 */
public class BinarySearch {
	
	public int search(int [] data, int start, int end, int elem){
		
		int mid = (start+end)/2;
		
		int[] input = data;
		if(elem == input[mid]){
			return mid;
		}else if(elem > input[mid]){
			search(input,mid+1,end,elem);
		}else if(elem < input[mid]){
			search(input,start,mid,elem);
		}
		
		
		return 0;
	}

}
