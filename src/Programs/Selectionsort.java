package Programs;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 6, 5, 4, 7, 8, 2 };
		int minindex;
		int size = num.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			minindex = i;
			for (int j = i + 1; j < size; j++) {
				if (num[minindex] > num[j]) {
					minindex = j;
				}
			}
			temp = num[minindex]; // temp = 2
			num[minindex] = num[i]; // in the place of 2 - assigning the value 6
			num[i] = temp;
		}
		for (int nums : num) {
			System.out.print(nums);
		}
		
	}

}