import java.util.*;
import java.lang.*;
import java.io.*;

public class MEET {
	
	static void print24(String str)
	{
	    // Get hours
	    int h1 = (int)str.charAt(1) - '0';
	    int h2 = (int)str.charAt(0) - '0';
	    int hh = (h2 * 10 + h1 % 10);
	 
	    // If time is in "AM"
	    if (str.charAt(9) == 'A')
	    {
	        if (hh == 12)
	        {
	            System.out.print("00");
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	        else
	        {
	            for (int i = 0; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	    }
	 
	    // If time is in "PM"
	    else
	    {
	        if (hh == 12)
	        {
	            System.out.print("12");
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	        else
	        {
	            hh = hh + 12;
	            System.out.print(hh);
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	    }
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			String str = s.next();
			System.out.println(str.charAt(9));
			print24(str);
		    
		}
       
        s.close();

	}

}
