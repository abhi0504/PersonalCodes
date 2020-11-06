package quesBank;

import java.util.Scanner;

public class Arrays {
	
	public static int[] reverseAnArray(int arr[])
	{
		int length = arr.length;
		int[] a = new int[length];
		for(int i = length-1 , j = 0 ; i >= 0 ; i-- , j++)
		{
			a[j] = arr[i];
			System.out.print(a[j] + " ");
		}
		return a;
	}
	
	public static void MaxAndMin(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int length = arr.length;
		for(int i = 0 ; i < length ; i++ )
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Min : " + min + " Max : " + max);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = s.nextInt();
		int a[] = new int[n];	
		System.out.println("Enter your array");
		for(int i = 0 ; i < n ; i++)
		{
			a[i] = s.nextInt();
		}
		reverseAnArray(a);
		System.out.println();
		MaxAndMin(a);

	}

}
