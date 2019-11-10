package arrays;
import java.util.Scanner;
public class MatrixAddition {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of matrix rows and columns respectively");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int a[][] = new int[rows][columns];
		int b[][] = new int[rows][columns];
		System.out.println("Enter the data of matrix1");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the data of matrix2");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Our two Matrixs are");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");System.out.println(" ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(b[i][j] +" ");
			}
			System.out.println(" ");

		}
	}

}
