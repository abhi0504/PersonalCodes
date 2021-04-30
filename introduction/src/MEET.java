import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.*;

public class MEET {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String str = br.readLine();
			
			
			int aaa = str.charAt(0) - 48;
			int aab = str.charAt(1) - 48;
			int Timehr = aaa*10 + aab;
			
			int bbb = str.charAt(3) - 48;
			int bba = str.charAt(4) - 48;
			int Timemin = bbb*10 + bba;
			
			int g1 = 0;
			
			if(str.charAt(6) == 'A')
			{
				if(Timehr != 12)
				{
					 g1 = Timehr*60 + Timemin;
				}
				else
				{
					 g1 = Timemin;
				}
			}
			else
			{
				if(Timehr != 12)
				{
					 g1 = ((12+Timehr)*60) + Timemin;
				}
				else
				{
					 g1 = 12*60 + Timemin;
				}
			}
			
			
//			System.out.println("g1: " + g1);
			
			
			int n = Integer.parseInt(br.readLine());
			String arr[] = new String[n];
			for(int i = 0 ; i < n ; i++)
			{
				arr[i] = br.readLine();;
			}
			int a[] = new int[n];
			int startlimit = 0;
			int endlimit = 0;
			String finalStr = "";
			for(int i = 0 ; i < n ; i++)
			{
				//Starting Time
				int h1 = arr[i].charAt(0) - 48;
				int h2 = arr[i].charAt(1) - 48;
				int sTimehr = h1*10 + h2;
				
				int m1 = arr[i].charAt(3) - 48;
				int m2 = arr[i].charAt(4) - 48;
				int sTimemin = m1*10 + m2;
				
				//Ending Time
				int h11 = arr[i].charAt(9) - 48;
				int h22 = arr[i].charAt(10) - 48;
				int eTimehr = h11*10 + h22;
				
				int m11 = arr[i].charAt(12) - 48;
				int m22 = arr[i].charAt(13) - 48;
				int eTimemin = m11*10 + m22;
				
				if(arr[i].charAt(6) == 'A')
				{
					if(sTimehr!=12)
					{						
						 startlimit = (sTimehr * 60) + sTimemin;
						if(arr[i].charAt(15) == 'A')
						{
							if(eTimehr!=12)
							{								
								 endlimit = (eTimehr * 60) + eTimemin;
							}
							else
							{
								 endlimit = eTimemin;
							}
 						}
						else
						{
							 endlimit = (eTimehr+12)*60 + eTimemin;
						}
					}
					else
					{
						 startlimit = sTimemin;
						 if(arr[i].charAt(15) == 'A')
							{
								if(eTimehr!=12)
								{								
									 endlimit = (eTimehr * 60) + eTimemin;
								}
								else
								{
									 endlimit = eTimemin;
								}
	 						}
							else
							{
								 endlimit = (eTimehr+12)*60 + eTimemin;
							}
					}
				}
				else
				{
					if(sTimehr!=12)
					{						
						 startlimit = ((sTimehr+12) * 60) + sTimemin;
						if(arr[i].charAt(15) == 'A')
						{
							if(eTimehr!=12)
							{								
								 endlimit = (eTimehr * 60) + eTimemin;
							}
							else
							{
								 endlimit = eTimemin;
							}
 						}
						else
						{
							 endlimit = (eTimehr+12)*60 + eTimemin;
						}
					}
					else
					{
						 startlimit = 12*60 + sTimemin;
						 if(arr[i].charAt(15) == 'A')
							{
								if(eTimehr!=12)
								{								
									 endlimit = (eTimehr * 60) + eTimemin;
								}
								else
								{
									 endlimit = eTimemin;
								}
	 						}
							else
							{
								 endlimit = (eTimehr+12)*60 + eTimemin;
							}
					}
				}
				
//				System.out.println(startlimit + " - " + endlimit);
				
				if(g1>=startlimit && g1<=endlimit)
				{
//					System.out.println(1);
					finalStr += '1';
				}
				else
				{
//					System.out.println(0);
					finalStr += '0';
				}
				
			}
			
			System.out.println(finalStr);
			
		}
       
	}

}
