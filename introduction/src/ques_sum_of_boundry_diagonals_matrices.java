import java.util.Scanner;

public class ques_sum_of_boundry_diagonals_matrices {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[][] = new int[n][n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==(n-1)||j==0||j==n-1||i==j||(i+j)==(n-1))
				{
					sum = sum + a[i][j];
				}
			}
		}
		
		System.out.println(sum);

		
	}

}
