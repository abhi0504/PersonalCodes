package linkedList2;

import java.util.Scanner;
import java.util.Stack;

public class SplitArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n ; i++)
		{
			arr[i] = s.nextInt();
		}
		int arr3[] = new int[n];
		int arr5[] = new int[n];
		int sum=0;
		Stack<Integer> stack3 = new Stack<Integer>();
		Stack<Integer> stack5 = new Stack<Integer>();
		for(int i = 0; i<n ; i++)
		{
			if(arr[i]%3==0 && arr[i]%5!=0)
			{
				stack3.push(arr[i]);
			}
			
			else if(arr[i]%5==0 && arr[i]%3!=0)
			{
				stack5.push(arr[i]);
			}
			
			else 
			{
				sum += arr[i]; 
			}
		}
		
		int j = 0,k=0;
		int sum1=0,sum2=0;
		
		while(stack3.size()!=0)
		{
			arr3[j] = stack3.pop();
			sum1+=arr3[j];
			j++;
		}
		
		while(stack5.size()!=0)
		{
			arr5[k] = stack5.pop();
			sum2+=arr5[k];
			k++;
		}
		
		boolean aalo = false;
		
		if(((sum2 - sum1) - sum) % 2 == 0)
		{
			aalo = true;
		}
		
		System.out.println(aalo);
		
	}

}
