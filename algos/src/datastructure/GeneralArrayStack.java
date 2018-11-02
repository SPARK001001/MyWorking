package datastructure;

import java.lang.reflect.Array;

/**
 * 2 * Java : 数组实现的栈，能存储任意类型的数据 3 * 4 * @author pjr 5 * @date 2018/3/15 6
 */
public class GeneralArrayStack<T> {
	private static final int DEFAULT_SIZE = 12;
	private T[] mArray;
	private int count;

	public GeneralArrayStack(Class<T> type) {
		this(type, DEFAULT_SIZE);
	}

	public GeneralArrayStack(Class<T> type, int size) {
		mArray = (T[]) Array.newInstance(type, size);
		count = 0;
	}

	// 将val添加到栈中
	public void push(T val) {
		mArray[count++] = val;
	}

	// 返回“栈顶元素值”
	public T peek() {
		return mArray[count - 1];
	}

	// 返回“栈顶元素值”，并删除“栈顶元素”
	public T pop() {
		T tmp = mArray[count - 1];
		count--;
		return tmp;
	}

	// 返回“栈”的大小
	public int size() {
		return count;
	}

	// 返回“栈”是否为空
	public boolean isEmpty() {
		return size() == 0;
	}

	// 打印“栈”
	public void printStackArray() {
		if (isEmpty()) {
			System.out.println("stack is empty!!");
			return;
		}
		int i = size() - 1;
		while (i >= 0) {
			System.out.println("stack[" + i + "] = " + mArray[i]);
			i--;
		}
	}

	public static void main(String[] args) {
		GeneralArrayStack<String> marray = new GeneralArrayStack<String>(String.class);
		// 将10, 20, 30 依次推入栈中
		marray.push("10");
		marray.push("20");
		marray.push("30");
		// 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
		String tmp = marray.pop();
		// 只将“栈顶”赋值给tmp，不删除该元素.
		tmp = marray.peek();
		// 打印栈
		marray.push("40");
		marray.printStackArray();
	}
}