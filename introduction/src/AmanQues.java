import java.util.*;

import linkedList2.Node;
public class AmanQues {
	
	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		if (S == null)
			return null;
	 
		Arrays.sort(S);
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
	 
			//get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			//add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
	 
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
			int sum = 1;
			int num = 1;
			int n = s.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
				a[i] = s.nextInt();
			}
			ArrayList<ArrayList<Integer>> aList = subsets(a);
			
			 for (int i = 0; i < aList.size(); i++) { 
		            for (int j = 0; j < aList.get(i).size(); j++) { 
		                System.out.print(aList.get(i).get(j) + " "); 
		            } 
		            System.out.println("@"); 
		        } 
			
			t--;
		}
		
		s.close();
		
	}


	private static void subsets(Object s) {
		// TODO Auto-generated method stub
		
	}
}
