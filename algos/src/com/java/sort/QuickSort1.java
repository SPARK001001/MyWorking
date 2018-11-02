package com.java.sort;
//用数组最右边一个作为哨兵
public class QuickSort1 {
	private int[] arr;
	public QuickSort1(int[] arr) {
		this.arr= arr;
	}
	public void quickSort() {
		int n = arr.length-1;
	
		recQuickSort(0,n);
	}

	private void recQuickSort(int left, int right) {
		if(left>=right)
			return;
		else {
			long pivot = arr[right];
			int mid = partition(left,right,pivot);
			recQuickSort(left, mid-1);
			recQuickSort(mid+1, right);
		}
		
	}

	private int partition(int left, int right, long pivot) {
		int leftPtr = left-1;
		int rightPtr = right;
			
		while(true) {
			while(arr[++leftPtr]<pivot);//因为pivot为最右边一个数，故不需要判断leftPtr<ringt
			while(rightPtr>left&&arr[--rightPtr]>pivot);
			if(leftPtr>=rightPtr) 
				break;
			swap(leftPtr,rightPtr);
		}
		swap(leftPtr,right);
			
		return leftPtr;
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
