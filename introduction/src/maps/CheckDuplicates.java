package maps;

import java.util.*;

public class CheckDuplicates {
	
	public static ArrayList<Integer> checkDupli(int[] a)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
		for(int i = 0 ; i < a.length ; i++)
		{
			if(seen.containsKey(a[i]))
			{
				continue;
			}
			output.add(a[i]);
			seen.put(a[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,1,12,2,5,1};
		ArrayList<Integer> out = checkDupli(a);
		System.out.println(out);

	}

}
