package linkedList2;

import java.util.*;

public class MaxProfitOnApp {

	public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int price = 0,temp;
		int arr[] = new int[n];
		for(int i = 0; i<n ; i++)
		{
			price = s.nextInt();
			arr[i] = price; 
		}
		
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
    	for(int i = 0; i<n ; i++)
		{
			stack.push(arr[i]) ; 
		}
        
        int big = 0;
        int temp1 = 0;
        int z =0;
        
        while(stack.size() != 0)
        {
        	int nsize = stack.size();
        	int popped = stack.pop();
            System.out.println(popped);
        	 temp1 = nsize*popped;
        	 System.out.println(temp1);
        	 if(temp1>big)
        	 {
        		big=temp1;
        	 }
        	 System.out.println(big);
        	 System.out.println(temp1);
        }
        System.out.println(big);
	}
}
