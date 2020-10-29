import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.io.*;

public class ytdw {
	
	public static long foo(long n)
	{
		return(n*(n+1))/2;
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
			while(t-->0)
			{
				long n = s.nextLong();
				long a = 0 ;
				long sum = (n*(n+1)) / 2;
				if(sum <= 3 )
					a = 0;
				else
				{
					double temp = sum/2;
					double num = (Math.sqrt(8*temp+1)/2) - 0.5;
					long intpart = (long) num;
					BigDecimal bigDecimal = new BigDecimal(String.valueOf(num));
					String decipart = bigDecimal.subtract(new BigDecimal(intpart)).toPlainString();
					double deciparty = Double.parseDouble(decipart);
					long ans = (long) num ;
					if(deciparty == 0)
						a = foo(ans - 1) + foo(n - ans -1);
					a += n - ans;
				}
				System.out.println(a);
			}
		}

}
