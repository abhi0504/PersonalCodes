package basicProgramms;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
     do
        {
			int r = a%10;
			a=a-r;
			a=a/10;
			sum=sum+r;
		}
		while(a>0);
		System.out.println(sum);
	}
	

}
