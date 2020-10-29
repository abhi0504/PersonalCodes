import java.util.Scanner;


public class Factorial {

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
		    int n = s.nextInt();
		    int type = 0;
		    int a[] = new int[n+1]; int max =0 ;
		    boolean check = true;
		    int arr[] = new int[n];
		    for(int i = 0 ; i<n ; i++)
		    {
		    	arr[i] = s.nextInt();

		    }
		    for(int i = 0 ; i<n ; i++)
		    {
		    	if(i==0)
		    	{
			    	type = arr[i];
			    	a[type]++;
		    	}
		    	
		    	else 
		    	{
		    		if(arr[i] == arr[i-1])
		    		{
		    			check = !check;
		    			if(check == true)
			    		{
			    			type = arr[i];
					    	a[type] ++ ;
			    		}
		    		}
		    		
		    		else
		    		{
		    			type = arr[i];
				    	a[type] ++ ;
		    		}
		    		
		    	}
		    	
		    }
		    
		    for(int i = 0 ; i<n ; i++)
		    {
		    	if(a[max]<a[i])
		    	{
		    		max = i;
		    	}
		    }
		    System.out.println(max);
		    
		    t--;
		}
       
        s.close();

	}

}
