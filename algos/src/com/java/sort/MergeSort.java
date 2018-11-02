package com.java.sort;

import java.util.Arrays;
//归并排序 时间
public class MergeSort {
	int[] theArray = { 0,1, 2, 3, 44, 754,0 ,132, 15,0, 2, 4, 5, 4, 5, 6, 8, 1, 2 };
	public void sort() {
		int[] arr = new int[theArray.length];
		mergeSort(arr, 0, theArray.length-1);
		System.out.println(Arrays.toString(theArray));
	}
	public void mergeSort(int[] arr, int lowerBound, int upperBound) {
		
		if (lowerBound == upperBound)
			return;
		else {
			int mid = lowerBound + (upperBound - lowerBound) / 2;
			mergeSort(arr, lowerBound, mid);
			mergeSort(arr, mid + 1, upperBound);
			merge(arr, lowerBound, mid + 1, upperBound);
		}

	}

	private void merge(int[] arr, int lowPtr, int highPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;
		while (lowPtr <= mid && highPtr <= upperBound) {
			if (theArray[lowPtr] <= theArray[highPtr]) {
				arr[j++] = theArray[lowPtr++];
			} else {
				arr[j++] = theArray[highPtr++];
			}
		}
		while (lowPtr <= mid)
			arr[j++] = theArray[lowPtr++];

		while (highPtr <= upperBound)
			arr[j++] = theArray[highPtr++];

		for (j = 0; j < n; j++) {
			theArray[lowerBound + j] = arr[j];
		}
	}
}
