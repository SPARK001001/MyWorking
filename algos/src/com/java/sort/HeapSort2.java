package com.java.sort;
//博客实现


public class HeapSort2 {
 
	public static void main(String[] args) {
		int[] array = new int[]{12, 5, 9 , 36, 8, 21, 7};
		System.out.println("初始状态：");
		showArray(array);
		
		initHeap(array); //这个应该也是堆排序的一部分，此处只是为了显示下结果
		System.out.println("建堆之后：");
		showArray(array); 
		
		heapSort(array);
		System.out.println("排序之后：");
		showArray(array); 
	}
	
	
	public static void heapSort(int[] array){
		initHeap(array); //建堆
		
		int count = array.length;
		while(count > 1) {
			int tmp = array[count - 1];
			array[count - 1] = array[0];
			array[0] = tmp;
			
			count--; //未排序部分又少一个
			adjustHeap(array, count, 0);//调整过程自上而下，参数root=0
		}
	}	
	
	public static void initHeap(int[] array){
		//建堆，从最后一个非叶子节点开始，而最后一个非叶子节点的下标为array.length/2-1
		for(int root = array.length/2 - 1; root >= 0; root--){
			adjustHeap(array, array.length, root);
		}
		
	}
	
 
	public static void adjustHeap(int[] array, int count, int root){
		int maxChildIndex;
		
		while(root <= count/2-1) { //待调整子堆的根节点必须是非叶子节点
			//需要在root、letfchild、rightchild中找到最大的值，
			//因为最后一个非叶子节点有可能没有右孩子，所以要做出判断。
			if(root == count/2 - 1 && count % 2 == 0){
				//节点数量为偶数时，最后一个非叶子节点只有左孩子
				maxChildIndex = 2 * root + 1;				
			}else{
				int leftChildIndex = 2 * root + 1;
				int rightChildIndex = 2 * root + 2;
				
				maxChildIndex = array[leftChildIndex] > array[rightChildIndex] ?
						leftChildIndex : rightChildIndex;
			}
			
			if(array[root] < array[maxChildIndex]){
				int tmp = array[root];
				array[root] = array[maxChildIndex];
				array[maxChildIndex] = tmp;
				
				//*****************这里很重要，继续调整因交换结构改变的子堆
				root = maxChildIndex; 
			}else{
				return;
			}
		}
	}
	
	public static void showArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ((i == array.length - 1) ? "\n" : " "));
		}
	}
}
