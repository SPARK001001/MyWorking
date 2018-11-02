package com.java.sort;

public class QuicksSort2 {
	private int[] arr;

	public QuicksSort2(int[] arr) {
		this.arr = arr;
	}

	public void quickSort() {
		int len = arr.length;
		recQuickSort(0, len - 1);
	}

	private void recQuickSort(int left, int right) {
		int size = right - left + 1;
		if (size <= 3) {//也可以对小划分使用插入排序
			manualSort(left, right);//inserSort(left,right)
		} else {
			int pivot = medianOf3(left, right);
			int partition = partition(left, right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}

	private void manualSort(int left, int right) {
		int size = right - left + 1;
		if (size <=1) {
			return;
		} 
		if (size == 2) {
			if (arr[left] > arr[right])
				swap(left, right);
			return;
		} else {
			if (arr[left] > arr[right - 1])
				swap(left, right - 1);
			if (arr[left] > arr[right])
				swap(left, right);

			if (arr[right - 1] > arr[right])
				swap(right - 1, right);

		}
	}

	private int partition(int left, int right, int pivot) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while (true) {
			while (arr[++leftPtr] < pivot)
				;
			while (arr[--rightPtr] > pivot)
				;
			if (leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right - 1);

		return leftPtr;
	}

	private int medianOf3(int left, int right) {
		int mid = (right + left) / 2;
		if (arr[left] > arr[mid])
			swap(left, mid);
		if (arr[left] > arr[right])
			swap(left, right);
		if (arr[mid] > arr[right])
			swap(mid, right);
		swap(mid, right - 1);
		return arr[right - 1];
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
