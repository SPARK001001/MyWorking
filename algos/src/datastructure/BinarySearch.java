package datastructure;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 6, 7 };
		int target = 8;
		System.out.println(findTarget(array, target));
	}

	public static int findTarget(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}

		// double check
		if (array[start] == target)
			return start;
		if (array[end] == target)
			return end;
		return -1;
	}
}
