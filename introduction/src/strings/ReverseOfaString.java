package strings;
import java.util.Scanner;

import looops.MaxSubArray;
public class ReverseOfaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = sc.nextLine();
		int n = a.length();
		int j = 0;
		char al[] = new char[n];
		for(int i = n-1;i>=0;i--,j++)
		{
			al[i]=a.charAt(j);
		}
//		System.out.println();
//		for(int i=0;i<a.length();i++)
//		{
//			System.out.print(al[i]);
//		}
		MaxSubArray ar = new MaxSubArray();
	}
	

}
