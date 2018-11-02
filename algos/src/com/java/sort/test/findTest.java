package com.java.sort.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.find.BinarySearch;

class findTest {

	@Test
	void binarySortTest() {
		int[] arr = {1,2,3,4,5,5,5,6,7,11,23,27,33,45};
		int i = BinarySearch.find(arr, 5);
		System.out.println(i);
	}

}
