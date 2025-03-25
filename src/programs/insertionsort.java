package programs;

public class insertionsort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {4,8,11,5,12};
		int size = arr1.length;
		for (int i = 1; i < size; i++)
		{
			int key = arr1[i];
			int j = i - 1;
			while (arr1[j] > key && j >= 0) 
				{
					arr1[j + 1] = arr1[j];
					j = j - 1;
				}
				arr1[j + 1] = key;
			}
		
			for (int num : arr1) {
				System.out.print(num + " ");
		}
}
}