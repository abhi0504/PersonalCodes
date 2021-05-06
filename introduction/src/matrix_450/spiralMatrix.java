package matrix_450;

public class spiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};

		int len = arr.length * arr[0].length;
		int r = 4 , c = 4;
		
		
		int i = 0 ;
		
		int k = 0  ;
		
		while(i<r && k<c)
		{
			for(int m = i ; m < r ; m++ )
			{
				System.out.println(arr[i][m]);
			}
			i++;
			
			for(int m = k+1 ; m < c ; m++)
			{
				System.out.println(arr[m][c-1]);
			}
			c--;
			
			if(k<c)
			{
				for(int m = c-1 ; m>=k ; m--)
				{
					System.out.println(arr[c][m]);
				}
				r--;
			}
			
			if(i<r)
			{
				for(int m = r-1 ; m>= i; m--)
				{
					System.out.println(arr[m][k]);
				}
				k++;
			}
			
			
		}
	}

}
