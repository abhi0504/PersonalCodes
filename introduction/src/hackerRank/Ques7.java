package hackerRank;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int i = 0;
	    while(i<t)
	    {
	    	boolean test = false;
	    	int k = 0;
	        int n = sc.nextInt();
	        while(k<n||n!=1)
	        {
	            if(n==1)
	        	{
	        		test=true;
	        	}
	        	else
	        	{
	        	if(n%2==0)
	        	{
	        		n = n/2;
	        	}
	        	else
	        	{
	        		n = (3*n)+1;
	        	}
	        	}
	        	k++;
	        }
	        if(test==true)
	        {
	        	System.out.println("YES");
	        }
	        else
	        {
	        	System.out.println("NO");
	        }
	        i++;
	    }
	    }
	}


