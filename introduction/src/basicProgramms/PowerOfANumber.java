package basicProgramms;
import java.util.Scanner;
public class PowerOfANumber {
	public static void main(String[] args) {
		
		System.out.println("Enter your Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter power of the");
		int n = sc.nextInt();
		int ans=1;
		for(int i=1;i<=n;i+=1)
		{
			 ans=ans*a;
		}
	System.out.println(ans);
	}
}

