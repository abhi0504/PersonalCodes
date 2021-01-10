package dp;

public class MinCostToPath {
	
	public static int MinCostToPathfunc(int[][] arr)
	{
		return MinCostToPathfuncHelper(arr , 0 , 0);
	}

	private static int MinCostToPathfuncHelper(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		int m = arr.length;
		int n = arr[0].length;
		
		if(i == m-1 && j == n-1)
		{
			return arr[i][j];
		}
		
		if(i>=m || j>=n)
		{
			return Integer.MAX_VALUE;
		}
		
		int opt1 = MinCostToPathfuncHelper(arr, i, j+1);
		int opt2 = MinCostToPathfuncHelper(arr, i+1, j);
		int opt3 = MinCostToPathfuncHelper(arr, i+1, j+1);
		
		return arr[i][j] + Math.min(opt1, Math.min(opt2, opt3));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1,1,1} , {4,5,2} , {7,8,9} };
		System.out.println(MinCostToPathfunc(arr));
	}

}
