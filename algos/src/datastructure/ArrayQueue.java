package datastructure;

/**
 * 2 * Java : 数组实现“队列”，只能存储int数据。 3 * 4 * @author pjr 5 * @date 2018/3/15 6
 */

public class ArrayQueue {
	private int[] marray;
	private int mcount;

	public ArrayQueue(int sz) {
		marray = new int[sz];
		mcount = 0;
	}

	// 将val添加到队列的末尾
	public void put(int val) {
		marray[mcount++] = val;
	}

	// 返回“队列开头元素”
	public int peekFirst() {
		return marray[0];
	}

	// 返回“栈顶元素值”，并删除“栈顶元素”
	public int getTop() {
		int tmp = marray[0];
		for (int i = 1; i < mcount; i++) {
			marray[i - 1] = marray[i];
		}
		mcount--;
		return tmp;
	}

	// 返回“栈”的大小
	public int size() {
		return mcount;
	}

	// 返回“栈”是否为空
	public boolean isEmpty() {
		return size() == 0;
	}

	public static void main(String[] args) {
		// 将10, 20, 30 依次推入栈中
		ArrayQueue aqueue = new ArrayQueue(12);
		aqueue.put(10);
		aqueue.put(20);
		aqueue.put(30);
		// 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
		int tmp = aqueue.getTop();
		System.out.println("tmp" + tmp);
		// 只将“栈顶”赋值给tmp，不删除该元素.
		tmp = aqueue.peekFirst();
		System.out.println("tmp" + tmp);
		aqueue.put(40);
		System.out.println(aqueue.isEmpty());
		while (!aqueue.isEmpty()) {
			System.out.println("top" + aqueue.getTop());
		}

	}
}
