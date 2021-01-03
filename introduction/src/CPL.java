import java.util.Scanner;

public class CPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			int reqh = s.nextInt();
			int box[] = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
				box[i] = s.nextInt();
			}
			
			for (int i = 0; i < (1<<n); i++) 
	        { 
	            // Print current subset 
	            for (int j = 0; j < n; j++) 
	  
	                // (1<<j) is a number with jth bit 1 
	                // so when we 'and' them with the 
	                // subset number we get which numbers 
	                // are present in the subset and which 
	                // are not 
	                if ((i & (1 << j)) > 0) 
	                    System.out.println(box[j] + " "); 
	  
	        }
			
		}
		
       
        s.close();

	}

}
