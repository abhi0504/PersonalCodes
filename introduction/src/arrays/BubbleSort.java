package arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of array");
		int n,temp = 0;
		n = sc.nextInt();
		System.out.println("Enter the elements of ARRAY");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Your array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Your array after swap is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
