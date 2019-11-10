package basicProgramms;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int rno = 0;
     do
        {
			int r = a%10;
			a=a-r;
			a=a/10;
			rno=rno*10+r;
		}
		while(a>0);
		System.out.println("reverse no. is "+ rno);
		if(temp==rno)
		{
			System.out.println("your Number is Pallindrome");
		}
		else
		{
			System.out.println("your Number is not a Pallindrome");
		}
		
	}

}
