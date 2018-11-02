package com.java.sort;

/**
 * 希尔排序算法：高级插入排序算法，n-增量排序
 * 
 * @author pjr
 *
 */
public class ShellSort {
	public static void shellSort(int[] arr) {
		int n = 1;
		while (n < arr.length / 3) {
			n = n * 3 + 1;
			//该间隔序列由knuth提出，常用
		}
		while (n > 0) {
			for (int i = n; i < arr.length; i ++) {
				// int ii = i;
				// for (int j = i+n; j<arr.length; j++) {//这样写就不是插入排序了
				// if (arr[j] < arr[ii]) {
				// int temp = arr[j];
				// arr[j] = arr[ii];
				// arr[ii] = temp;
				// }
				// ii++;
				//
				// }
				int temp = arr[i];
				int j = i;
				while (j > n - 1 && arr[j - n] > temp) {
					arr[j] = arr[j - n];
					j -= n;
				}
				arr[j] = temp;
			}
			n = (n - 1) / 3;
		}
	}

}
