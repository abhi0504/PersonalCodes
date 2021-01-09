package dp;

public class StaircaseProblem {
	
	public static int staircase(int n)
	{
		int[] storage = new int[n+1];
		storage[0] = 1;
		storage[1] = 1;
		storage[2] = 2;
		for(int i = 3 ; i <= n ; i++)
		{
			storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
		}
		return storage[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(staircase(4));
	}

}
