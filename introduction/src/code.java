import java.util.Scanner;


public class code {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n-->0)
		{
		    int a = s.nextInt();
		    int l = s.nextInt();
		    int c = 0;
		    
		    if(a%2 == 0)
		    {
		    	if(a<=l)
		    	{
		    		c=1;
		    	}
		    	if(a>l)
		    	{
		    		if(a%l == 0)
		    		{
		    			c = a/l;
		    		}
		    		else
		    		{
		    			c = a/l;
		    			c++;
		    		}
		    	}
		    }
		    else
		    {
		    	if(a<l)
		    	{
		    		c = 2;
		    	}
		    	if(a>l)
		    	{
		    		int r = a/l;
		    		int rem = a%l;
		    		if(rem%2 == 0)
		    		{
		    			c = r + 1;
		    		}
		    		else {
		    			c = r + 2;
		    		}
		    		
		    	}
		    	
		    }
		    
		    if(a == 1)
		    {
		    	c = 1;
		    }
		    
		    System.out.println(c);		    
		    
		}
       
        s.close();

		}


	}

