package com.java.sorting;

/**
 * 
 * Implementation of Quick Sort
 * Running of this algorithm is O(nlogn)
 * Worst case running time is O(n2)
 * @author kirankumarkamisetty
 *
 */

public class QuickSort {

	int[] numbers;
	int number;

	public void sort(int[] values) {

		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		number = this.numbers.length;
		quicksort(0, number - 1);

	}

	public void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + ((high - low) / 2)];

		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}

		}

		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public void printResult(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickSort qs = new QuickSort();
		int[] input = { 2, 5, 8, 4, 7, 6, 1 };
		qs.sort(input);
		qs.printResult(input);

	}

}