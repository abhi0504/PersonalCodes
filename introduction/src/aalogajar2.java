import java.util.*;

public class aalogajar2 {
	
	  public static void nextPermutation(int[] nums) {
	        
	        boolean check = false;
	        int fi = nums.length-1; 
	        
	        
	        
	        for(int i = nums.length-2 ; i >= 0 ; i--)
	        {
	        	System.out.println(nums[i]);
            	System.out.println(nums[i+1]);
	            if(nums[i] < nums[i+1])
	            {
	                check = true;
	                fi = i;
	                break;
	            }
	        }
	        
	        System.out.println(check);
	        System.out.println(fi);
	        
	        if(check == true)
	        {
	            for(int i = nums.length-1 ; i >= 0 ; i--)
	            {
	            	System.out.println(nums[i]);
	            	System.out.println(nums[fi]);
	            	
	                if(nums[i] > nums[fi])
	                {
	                    swap(nums , fi , i);
	                    System.out.println("Hi");
	                    System.out.println(nums[0]);
	                    System.out.println(nums[1]);

	                    System.out.println(nums[2]);

	                    break;
	                        
	                }
	            }
	        }
	        
	        reverse(nums , fi+1);
	        System.out.println("Hi 2");
	        System.out.println(nums[0]);
            System.out.println(nums[1]);

            System.out.println(nums[2]);
	    }
	    
	     private static void reverse(int[] nums, int start) {
	        int i = start, j = nums.length - 1;
	        while (i < j) {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }

	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	
	public static void main(String[] args) {
		    int[] a = {1,2,3};
		    
		    nextPermutation(a);

	}
}
