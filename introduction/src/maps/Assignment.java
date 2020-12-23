package maps;

import java.util.HashMap;

public class Assignment {
	
	public static void removeDuplicates(String str)
	{
		HashMap<Character, Boolean> maps =  new HashMap<Character, Boolean>();
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(maps.containsKey(str.charAt(i)) == true)
			{
				continue;
			}
			else
			{
				maps.put(str.charAt(i), true);
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
	
	public static void LongestConsecutiveSequence(int[] a)
	{
		HashMap<Integer, Boolean> map =  new HashMap<Integer, Boolean>();
		int min = 100;
		int max = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			if(a[i]<min)
			{
				min = a[i];
			}
			map.put(a[i], true);
		}
		int start = 0;
		int end = 0;
		int fs = 0;
		int fe = 0;
		int cont = 0 ;
		int temp = 0;
		for(int i = min ; i <= max ; i++ )
		{
			if(map.containsKey(i)==true)
			{
				temp++;
				if(start == 0)
				{
					start = i;
				}		
			}
			else if(map.containsKey(i)==false)
			{
				end = i-1;
				if(temp>cont)
				{
					cont=temp;
					fs=start;
					fe=end;
				}
				temp = 0;
				start = 0;
			}
		}
		System.out.println(fs  + " to " + fe);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicates("cdabbfdavvcscsadcv");
		int[] a = {1,2,4,5,6,7,9,10,12};
		int[] b = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		System.out.println();
		LongestConsecutiveSequence(b);
	}

}
