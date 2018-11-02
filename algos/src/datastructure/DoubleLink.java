/**
 * java 实现双向链表
 * 注：java自带的集合包中有实现双向链表，路径是：java.util.LinkedList
 * 
 * @author pjr
 * @date 2018/3/14
 */

package datastructure;

class DoubleLink<T> {
	// 表头
	private DNode<T> mHead;
	// 节点个数
	private int mCount;

	// 双向链表节点对应的结构体
	private class DNode<T> {
		private DNode prev;
		private DNode next;
		private T value;

		public DNode(T value, DNode prev, DNode next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}

	// 构造函数
	public DoubleLink() {
		// 创建表头，注意表头没有存储数据。
		mHead = new DNode<T>(null, null, null);
		mHead.prev = mHead.next = mHead;
		// 初始化节点个数为0
		mCount = 0;
	}

	// 返回节点个数
	public int size() {
		return mCount;
	}

	// 返回链表是否为空
	public boolean isEmpty() {
		return mCount == 0;
	}

	// 获取第index位置的节点
	public DNode<T> getNode(int index) {
		if (index < 0 || index >= mCount) {
			throw new IndexOutOfBoundsException();
		}
		// 正向查找
		if (index < mCount / 2) {
			DNode<T> node = mHead.next;
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
			return node;
		}
		// 反向查找
		DNode<T> rnode = mHead.prev;
		int rindex = mCount - index - 1;
		for (int i = 0; i < rindex; i++) {
			rnode = rnode.prev;
		}
		return rnode;
	}

	// 获取第index位置的值
	public T get(int index) {
		return getNode(index).value;
	}

	// 获取第一个节点的值
	public T getFirst() {
		return getNode(0).value;
	}

	// 获取最后一个节点的值
	public T getLast() {
		return getNode(mCount - 1).value;
	}

	// 将节点插入到第index位置前
	public void insert(int index, T value) {
		if (index == 0) {
			DNode<T> node = new DNode<T>(value, mHead, mHead.next);
			mHead.next.prev = node;
			mHead.next = node;
			mCount++;
			return;
		}
		DNode<T> inode = getNode(index);
		DNode<T> tnode = new DNode<T>(value, inode.prev, inode);
		inode.prev.next = tnode;
		inode.prev = tnode;
		mCount++;
		return;
	}

	// 将节点插入到第一个节点处
	public void insertFirst(T t) {
		insert(0, t);
	}

	// 将节点追加到链表到末尾
	public void appendLast(T t) {
		DNode<T> node = new DNode<T>(t, mHead.prev, mHead);
		mHead.prev.next = node;
		mHead.prev = node;
		mCount++;
	}

	// 删除index位置的节点
	public void del(int index) {
		DNode<T> node = getNode(index);
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node = null;
		mCount--;
	}

	// 删除第一个节点
	public void delFirst() {
		del(0);
	}

	// 删除最后一个节点
	public void delLast() {
		del(mCount - 1);
	}
}
