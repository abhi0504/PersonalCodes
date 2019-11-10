package looops;

public class MaxSubArray {

	public static void main(String[] args) {

		int arr[] = {1,4,-2,4,-1,3,5,-6};
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int sumarr[] = new int[n];
		int sum = 0;
		sumarr[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			sumarr[i] = sumarr[i-1] + arr[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j = i; j<n;j++)
		  {
			sum=sumarr[j]-sumarr[i]+arr[i];
			if(max<sum)
				max=sum;
		  }
		}	
	System.out.println(max);
	}

}
