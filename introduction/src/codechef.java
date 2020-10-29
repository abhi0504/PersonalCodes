import java.util.*;


public class codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
			int n = s.nextInt();
			int b = 0;
			int w = 0;
		    int a[] = new int[n];
		    int sum[] = new int[n];
		    for(int i = 0 ; i < n ; i++)
		    {
		    	a[i] = s.nextInt();
		    }
		    
		  for(int i = 0 ; i < n ; i++)
		  {
		      sum[i] = 0;
		  	int ii = i;
		  	for(int j = 0 ; j < n ; j++)
		      {
		      		if(Math.abs(a[ii] - a[j]) <= 2 )
		      		{
		      			sum[i]++;
		      			ii = j;
		      		}	
		      }
		  }
		    
		    w = sum[0];
		    
		    for(int i = 1 ; i < n ; i++)
		    {
		    	if(sum[i] > sum[i-1])
		    	{
		    		w = sum[i];
		    	}
		    }
		    
		    b = sum[0];
		    
		    for(int i = 1 ; i < n ; i++)
		    {
		    	if(sum[i] < sum[i-1])
		    	{
		    		b = sum[i];
		    	}
		    }
		    
		    System.out.println(b + " " + w);    
		    
		    t--;
		}
       
        s.close();

	}

}

//
//for(int i = 0 ; i < n ; i++)
//{
//    sum[i] = 0;
//	int ii = i;
//	for(int j = 0 ; j < n ; j++)
//    {
//    		if(Math.abs(a[ii] - a[j]) <= 2 )
//    		{
//    			sum[i]++;
//    			ii = j;
//    		}	
//    }
//}