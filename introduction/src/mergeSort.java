
public class mergeSort {
	
	public static void mergeSort(int[] arr ,int l ,int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			
			merge(arr , l , mid , r);
		}
		
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		int n1 = mid-l+1;
		int n2 = r-mid; //(r-mid-1+1)
		
		int[] a = new int[n1];
		int[] b = new int[n2];

		for(int i = 0 ; i < n1 ; i++)
		{
			a[i] = arr[l+i];
		}
		
		for(int i = 0 ; i < n2 ; i++)
		{
			b[i] = arr[mid+1+i];
		}
		
		int i = 0 ; 
		int j = 0 ;
		int k = l;
		
		while(i<n1 && j<n2)
		{
			if(a[i] < b[j])
			{
				arr[k] = a[i];
				i++; k++;
			}
			else
			{
				arr[k] = b[j];
				j++; k++;
			}
		}
		
		while(i<n1)
		{
			arr[k] = a[i];
			i++;k++;
		}
		
		while(j<n2)
		{
			arr[k] = a[j];
			j++;k++;
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,4,3,2,1};
		
		mergeSort(arr, 0, 4);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
