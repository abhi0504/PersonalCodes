import java.util.*;
import java.lang.Math;

public class MAXFUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{			
			int n = s.nextInt();
			long[] arr = new long[n];
			for(int i = 0 ; i < n ; i++)
			{
				arr[i] = s.nextLong();
			}
			Arrays.sort(arr);
			long x = arr[0];
			long y = arr[n-1];
			long z = arr[n - 2];
			long sum = Math.abs(x-y) + Math.abs(y-z) + Math.abs(z-x);
			System.out.println(sum);
		}
       
        s.close();

	}

}
