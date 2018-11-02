package com.java.sort;


public class HeapSort{
	public static void main(String[] args) {
		int size = 20;
		Heap theHeap = new Heap(size);
		for(int j = 0;j<size;j++) {
			int random = (int) (java.lang.Math.random()*100);
			Node newNode = new Node(random);
			theHeap.insertAt(j, newNode);
			theHeap.incrementSize();
		}
		System.out.print("Random: ");
		theHeap.displayArray();
		for(int j=size/2-1;j>=0;j--) {
			theHeap.trickleDown(j);
		}
		System.out.print("Heap: ");
		theHeap.displayArray();
		
		for(int j=size-1;j>=0;j--) {
			Node biggestNode = theHeap.remove();
			theHeap.insertAt(j, biggestNode);
		}
		System.out.print("Sorted: ");
		theHeap.displayArray();
		
		
	}
}
class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public void displayArray() {
		for(int j=0;j<maxSize;j++) {
			System.out.print(heapArray[j].getKey()+" ");
		}
		System.out.println();
	}
	
	public void incrementSize() {
		this.currentSize++;
	}
	public Heap(int mx) {
		maxSize = mx;
		currentSize = 0;
		heapArray = new Node[maxSize];
	}
	
	public void insertAt(int index,Node newNode) {
		heapArray[index] = newNode;
	}

	public void trickleDown(int index) {
		int largeChild;
		Node top = heapArray[index];
		while(index<currentSize/2) {
			int leftChild =2*index+1;
			int rightChild = leftChild+1;
			
			if(rightChild<currentSize &&
					heapArray[leftChild].getKey()<heapArray[rightChild].getKey()) 
				largeChild = rightChild;
				else
				largeChild = leftChild;
			
			if(top.getKey()>=heapArray[largeChild].getKey())
				break;
			
			heapArray[index] = heapArray[largeChild];
			
			index = largeChild;			
		}
		heapArray[index] = top;
	}
	
	public Node remove() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}
	
	
	
}

class Node{
	private int iData;

	public int getKey() {
		return iData;
	}

	
	public Node(int key) {
		this.iData = key;
	}
}