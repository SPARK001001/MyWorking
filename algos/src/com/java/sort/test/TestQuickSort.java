package com.java.sort.test;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.java.sort.QuicksSort2;

class TestQuickSort {

	@Test
	void testQuickSort1() {
		int[] arr = {1,2,4,6,8,22,44,66,33,5,89,3,567,876,323,879,2,56,79,23,0,2,6,77,332}; 
		System.out.println(Arrays.toString(arr));
		QuicksSort2 sort1 = new QuicksSort2(arr);
		sort1.quickSort();
		System.out.println(Arrays.toString(arr));
	}

}
