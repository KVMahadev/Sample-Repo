package programs;

import java.util.Arrays;

public class Firstlastindex {

	static int[] firstLast(int num[], int target) {
		int l = 0;
		int h = num.length - 1;
		int mid = 0;
		int res[] = { -1, -1 };
		while (l <= h) {
			mid = (l + h) / 2;
			if (num[mid] == target) {
				res[0] = mid;
				h = mid - 1;
			} else if (num[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
			
		 l = 0;
		 h = num.length - 1;
		 mid = 0;
		while (l <= h) {
			mid = (l + h) / 2;
			if (num[mid] == target) {
				res[1] = mid;
				l = mid + 1;
			} else if (num[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num[] = { 1,2,6,6,6,6,7};
		 int target = 6;
		 int[] result = firstLast(num, target);
		 System.out.println(result);
		 for (int i : result) {
			System.out.println(i);
		}
	        System.out.println("First and Last Index of " + target + ": " + Arrays.toString(result));
	    }
}
