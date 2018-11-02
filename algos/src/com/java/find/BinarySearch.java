package com.java.find;
//没重复元素的查找
//变种 https://www.cnblogs.com/luoxn28/p/5767571.html
public class BinarySearch {
	public static int find(int[] arr,long key) {
		int lowerBound = 0;
		int upperBound = arr.length-1;
		int curIn;
		while(true) {
			curIn = lowerBound+(upperBound-lowerBound)/2;//防止溢出
			if(arr[curIn]==key)
				return curIn;
			else if(lowerBound>upperBound)
				return arr.length;
			else if(arr[curIn]>key) {
				upperBound = curIn-1;//要有常数步的前进
			}else
				lowerBound = curIn+1;
		}
		
	}
}
