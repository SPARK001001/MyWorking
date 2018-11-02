package com.java.sort;

/**
 * 冒泡排序比较相邻两个数，大的在后面，若大的在前，则交换之。每一次外循环找到最大的一个数到数组最后。
 * 采用加flag的改进的冒泡排序，最好情况有序数组时间复杂度为O(n);倒序时间复杂度O(n²)；空间复杂度开辟一个temp，O(1);
 * 
 * @author pjr
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int length = arr.length;
		if (arr == null || length == 0)
			System.out.println("array is null");
		;
		// 外循环只要循环length-1次。
		for (int i = 0; i < length - 1; i++) {
			// 内循环最大次数每次减一；
			System.out.println("i ==== " + i);
			boolean flag = false;
			for (int j = 0; j < length - 1 - i; j++) {
				System.out.print("j = " + j);
				// 用flag来判断是不是中间已经排好序了，排好序就不要再循环下去了
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
				System.out.println();
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}

	}
}
