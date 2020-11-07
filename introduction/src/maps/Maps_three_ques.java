package maps;

import java.util.HashMap;

public class Maps_three_ques {
	
	public static int maxFreq(int[] a)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < a.length ; i ++ )
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i]) + 1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		int max = 0 ; int ans = 0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(map.get(a[i])>max)
			{
				max = map.get(a[i]);
				ans = a[i];
			}
		}
		
		return ans;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,1,1,2,2,2,3,3,5,5,5,5,5,5,5,5,55,5,6};
		int ans = maxFreq(a);
		System.out.println(ans);

	}

}
