package Programs;
public class Quicksort {	
	public static void Quicksort (int [] arr, int low, int high) 
	{
		if (low<high)
		{
			int pi = partition (arr, low, high);
			Quicksort(arr, low, pi-1);
			Quicksort (arr, pi+1, high);
		}
	}
	private static int partition(int[] arr, int low, int high) 
	{
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = low-1;		
		for (int j=low; j<high;j++) 
		{
			if (arr[j]<pivot)
			{
			   i++;
			   int temp = arr[i];
			   arr[i] = arr[j];
			   arr[j] = temp;
		   }
	    }
		int temp = arr[i+1];
		arr[i+1] = arr [high];
		arr[high] = temp;
		return i+1;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {72,4,67, 899, 21,2};
		Quicksort(arr, 0, arr.length-1);
		
		for (int num:arr)
		{
			System.out.println(num + " ");
		}

	}

}
