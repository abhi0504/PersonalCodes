import java.util.*;
import java.util.Scanner;

public class FAIRELCT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			
			long a[] = new long[n];
			long b[] = new long[m];
			
			long sumA = 0;
			long sumB = 0;
			
			for(int i = 0 ; i < n ; i++)
			{
				a[i] = s.nextInt();
				sumA += a[i];
			}
			
			for(int i = 0 ; i < m ; i++)
			{
				b[i] = s.nextInt();
				sumB += b[i];
			}
			
			if(sumA>sumB)
			{
				System.out.println(0);
			}
			else
			{
				Arrays.sort(a);
				Arrays.sort(b);
				
				int ai = 0;
				int bi = m-1;
				
				int finalAns = 0;
				
				while(ai < n && bi >= 0 )
				{
					if(sumA>sumB)
						break;
					sumA = sumA - a[ai] + b[bi]; 
					sumB = sumB + a[ai] - b[bi];
					long temp = a[ai];
					a[ai] = b[bi];
					b[bi] = temp;
					ai++;
					bi--;
					finalAns++;
//					System.out.println("ai: " + ai);
//					System.out.println("bi: " + bi);
//					System.out.println(sumA);
//					System.out.println(sumB);
				}
				
				if(sumB>=sumA)
				{
					System.out.println(-1);
				}
				else
				{
					System.out.println(finalAns);
				}

			}
			
						
		}
       
        s.close();

	}

}
