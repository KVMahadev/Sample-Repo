package Programs;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 1, 3, 4, 5, 6 };
		int target = 5;

		int result = linearsearch(num, target);
		int result1 = binarysearch(num, target);
		if (result1 != -1)
			System.out.println("Element found at index:" + result);
		else
			System.out.println("element not found");
	}

	public static int linearsearch(int num[], int target) {
		for (int i = 0; i <= num.length; i++) {
			if (num[i] == target)
				return i;
		}
		return -1;
	}

	public static int binarysearch(int num[], int target) {
		int left = 0;
		int right = num.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (num[mid] == target) {
				return mid;
			}

			else if (num[mid] < target) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
		return -1;
	}
}
