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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicates("cdabbfdavvcscsadcv");

	}

}
