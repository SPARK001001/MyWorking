package com.java.sort;

/**
 * 选择排序：每一次从剩余元素序列中找到最小的一个元素,最后与剩余序列的起始位交换；
 * 时间复杂度是O(n²)
 * @author pjr
 *
 */
public class SelectSort {
	public static void selectSort(int[] arr) {
		int length = arr.length;
		if (arr == null || length == 0)
			System.out.println("The Aarray is null");
		// 外循环为元素次数
		for (int i = 0; i < length - 1; i++) {
			int min = i;

			// 内循环从第i+1个开始
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min]) {
					min = j;// 找出最小的那个下标就行
				}
			}

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
	}
}
