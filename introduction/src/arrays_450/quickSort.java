package arrays_450;

public class quickSort {
	
	public static void quickSortFunc(int[] arr , int l , int r)
	{
		if(l<r)
		{
			int pi = piovetfunc( arr ,  l ,  r);
			
			quickSortFunc(arr, l, pi-1);
			quickSortFunc(arr, pi+1, r);
		}
	}

	private static int piovetfunc(int[] arr, int l, int r) {

		int pivot = arr[r];
		int i = l-1;
		
		for(int j = l ; j < pivot ; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				swap(arr , i , j);
			}
			
		}
		
		swap(arr , i+1 , r);
		
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		
		quickSortFunc(arr, 0, 4);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
