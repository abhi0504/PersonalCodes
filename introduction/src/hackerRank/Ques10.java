package hackerRank;
import java.util.*;
public class Ques10 {

	public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[1000];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();   
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=1; j<=1000;j++)
        	{
            if(a[i]==j)
            {
                b[j-1]++ ;
            }
        	}
        }
        int t = sc.nextInt();
        for(int i = 0; i<t;i++)
        {
			int index=0;
            int c = sc.nextInt();
        	for(int j=0;j<1000;j++)
        	{
        		if(j==c)
        		{
        			index = j;
        		}
        	}
        	if(index==0)
        	{
        		if(b[index]==0)
        		{
        			System.out.println("NOT PRESENT");
        		}
        		else
        		{
            		System.out.println(b[index]);
        		}
        	}
        	else 
        	{
           		if(b[index-1]==0)
        		{
        			System.out.println("NOT PRESENT");
        		}
        		else
        		{
            		System.out.println(b[index-1]);
        		}
        	}
        }
	}

}
