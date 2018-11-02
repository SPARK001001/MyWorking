package com.java.sort.test;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.java.sort.BubbleSort;
import com.java.sort.InsertSort2;
import com.java.sort.MergeSort;
import com.java.sort.SelectSort;
import com.java.sort.ShellSort;

class SortTest {

	@Test
	void bubbleSortTest() {
		/**
		 * 冒泡排序： 基本功能测试 
		 * 边界值测试 1.输入为null或者为空数组 
		 * 性能测试
		 */
		BubbleSort bs = new BubbleSort();

		int[] arr = { 1, 2, 3, 44, 754, 132, 15 };
		bs.bubbleSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	@Test
	void selectSortTest() {
		/**
		 * 选择排序
		 */
		SelectSort ss = new SelectSort();
		int[] arr1 = { 1, 2, 3, 44, 754, 132, 15, 2, 4, 5, 4, 5, 6, 8, 1, 2 };
		// int[] arr1 = {};
		ss.selectSort(arr1);

		System.out.println(Arrays.toString(arr1));
	}

	
	@Test
	void insertSortTest() {
		/**
		 * 插入排序
		 */
		InsertSort2 is = new InsertSort2();
		int[] isarr = { 0,1, 2, 3, 44, 754,0 ,132, 15,0, 2, 4, 5, 4, 5, 6, 8, 1, 2 };
		// int[] arr1 = {};
		is.insertSort(isarr);

		System.out.println(Arrays.toString(isarr));
	}
	
	@Test
	void shellSortTest() {
		int[] shellArr = { 0,1, 2, 3, 44, 754,0 ,132, 15,0, 2, 4, 5, 4, 5, 6, 8, 1, 2 };
		System.out.println("shellsort0"+Arrays.toString(shellArr));
		ShellSort.shellSort(shellArr);
		System.out.println("shellsort1"+Arrays.toString(shellArr));
	}
	
	@Test
	void mergeSort() {

		MergeSort sort = new MergeSort();
		sort.sort();
		
	}
}
