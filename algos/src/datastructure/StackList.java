package datastructure;

import java.util.Stack;

public class StackList<T> {
	private Stack<T> in;
	private Stack<T> out;
	private int count = 0;

	public StackList() {
		// 将out中元素pop到in中，然后push新元素
		in = new Stack<T>();
		// 将in中元素pop到out中，返回最后一个元素
		out = new Stack<T>();
		count = 0;
	}

	// 将元素插入到队尾
	public void put(T val) {
		while (!out.isEmpty()) {
			in.push(out.pop());
		}
		in.push(val);
		count++;
	}

	// 取出队头元素
	public T get() {
		while (!in.isEmpty()) {
			out.push(in.pop());
		}
		count--;
		return out.pop();
	}

	private int size() {
		return count;
	}

	private boolean isEmpty() {
		return size() == 0;
	}

	public static void main(String[] args) {
		StackList<Integer> slist = new StackList<Integer>();
		slist.put(10);
		slist.put(20);
		slist.put(30);
		System.out.printf("isempty()=%b\n", slist.isEmpty());
		System.out.printf("size()=%d\n", slist.size());
		while (!slist.isEmpty()) {
			System.out.println(slist.get());
		}
	}

}
