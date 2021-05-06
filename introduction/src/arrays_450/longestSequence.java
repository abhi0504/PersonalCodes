package arrays_450;
import java.util.HashMap;
import java.util.*;

public class longestSequence {
	
	public static int foo(int[] arr , int n)
	{
		Map<Integer, Boolean> hash_map = new HashMap<>();
		int ccount = 1;
		int maxcount = 1;
		for (int i = 0 ; i < n ; i++)
		{
			hash_map.put(arr[i], true);
		}
		
		for (Map.Entry<Integer, Boolean> set : hash_map.entrySet()) {
			if(hash_map.containsKey(set.getKey()+1))
				{
					ccount++;
					if(ccount>maxcount)
						maxcount = ccount;
				}
				else
				{
					if(ccount>maxcount)
						maxcount = ccount;
					ccount = 1;
				}
			
		}
		return maxcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		
		int[] arr = {1,9,3,10,4,20,2,11,12,0};
		
		System.out.println(foo(arr , arr.length));
		

	}

}
