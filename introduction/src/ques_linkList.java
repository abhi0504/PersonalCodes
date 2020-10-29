import java.util.Arrays;
import java.util.Scanner;

public class ques_linkList {
	
	
	public static int[] deleteElement(int arr[], int n, int x) 
    { 
        // Search x in array 
        int i; 
        for (i=0; i<n; i++) 
            if (arr[i] == x) 
                break; 
   
        // If x found in array 
        if (i < n) 
        { 
            // reduce size of array and move all 
            // elements on space ahead 
            n = n - 1; 
            for (int j=i; j<n; j++) 
                arr[j] = arr[j+1]; 
        } 
   
        return arr; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int TestCase = s.nextInt();
		int i = 0;
		while(i<TestCase)
		{
			int TotalFriends = s.nextInt();
			int TotalRemove = s.nextInt();
			int Friends[] = new int[TotalFriends];
			for(int j=0 ; j<Friends.length ; j++)
			{
				Friends[j] = s.nextInt();
			}
		
		boolean DeleteFriend=false;
		for(int k=1 ; k<Friends.length - 1 ; k++)
		{
			if (Friends[k] < Friends[k+1])
			{
				 Friends = deleteElement(Friends, Friends.length, Friends[k]);
		         DeleteFriend=true;
		         break;
			}
	          
	    if(DeleteFriend == false)
	    {
	    	Friends = deleteElement(Friends, Friends.length, Friends[Friends.length - 1] );
	    }
	    
		}
		 for (int element: Friends) {
	            System.out.print(element + " ");
	        }
	 }
	}

}
