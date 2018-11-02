package datastructure;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		int tmp = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		tmp = stack.pop();
		System.out.println("tmp=" + tmp);
		tmp = stack.peek();
		System.out.println("tmp=" + tmp);
		stack.push(5);
		while (!stack.isEmpty()) {
			tmp = stack.pop();
			System.out.printf("tmp is %d\n", tmp);
		}

	}
}
