import java.util.Arrays;
import java.util.Scanner;

public class CPL {
	
	static long[][] dp = new long[4020][4020];
	static long arr2[] = new long[4020];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			int k = s.nextInt();
			long arr[] = new long[n];

			
			for(int i = 0 ; i < n ; i++)
			{
				arr[i] = s.nextLong();
			}
			
			if(n == -1)
			{
				System.out.println(-1);
				break;
			}
			
			Arrays.sort(arr);
			
			for(int i = 0 ; i < n/2 ; i++)
			{
				long temp = 0;
				temp = arr[i];
				arr[i] = arr[n-i-1];
				arr[n-i-1] = temp;
			}
			
			for(int i = 0 ; i <=n+10 ; i++)
			{
				arr2[i] = 0;
				for(int j = 0 ; j <=k+10 ; j++)
				{
					dp[i][j] = -1;
				}
			}
			
			for(int i = 1 ; i <=n ; i++)
			{
				arr2[i] = arr2[i-1] + arr[i-1];
			}
			
			long ans = foo(0,0,n,k,arr);
			if(ans>1e9)
				System.out.println(-1);
			else
				System.out.println(ans);
		}
		
       
        s.close();

	}

	private static long foo(int i, int j, int n, int k, long[] arr) {
		// TODO Auto-generated method stub
		
		if(j>=k && (arr2[i] - j>=k))
			return 0;
		else if(i>=n)
			return (long) 1e10;
		else if(dp[i][j]!=-1)
			return dp[i][j];
		
		long c1 = foo(i+1, (int) Math.min(j+arr[i], arr2[i]-j), n, k, arr);
		long c2 = foo(i+1, (int) Math.min(j, arr2[i]-j+arr[i]), n, k, arr);

		return dp[i][j] = 1+Math.min(c1, c2);
	}

}
