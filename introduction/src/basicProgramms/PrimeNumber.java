package basicProgramms;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the no. you want to check");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=2;i<a;i++)
		{
			if((a%i)==0)
			{
				System.out.println("Your no. is not prime");
				break;
			}
			else
			{
				System.out.println("Your no. is prime");

			}
		}
		
	}
}
