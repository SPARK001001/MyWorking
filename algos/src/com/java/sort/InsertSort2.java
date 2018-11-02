package com.java.sort;
/**简单插入排序：
 * 插入排序：外循环是要插入的数，内循环是把该数放到前面已经排序好的序列的正确位置；
 * 时间复杂度：正序时，每次插入不用移动前面的元素，时间复杂度为O(N)
 * 			反序时，每次插入都要前面元素后移，时间复杂度为O(N²)
 * 空间复杂度：需要一临时变量存插入的值，为O(1)
 * 稳定性：插入排序过程中，不需要改变相等数值的位置，是稳定的。
 * @author pjr
 *
 */
public class InsertSort2 {
	public void insertSort(int[] arr) {
		if(arr==null || arr.length==0)
			System.out.println("the array is null");
			
		for(int i = 1;i<arr.length;i++) {
			int temp = arr[i];//取临时变量保存待插入点的值
//			for(int j=i;j>0;j--) {
//				if(arr[j-1]>temp) {
//					arr[j] = arr[j-1];//采用移位而不是交换
//				}else {
//					arr[j] = temp;
//					break;
//				}
//			}
			int j =i;
			while(j>0&&arr[j-1]>temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}
}
