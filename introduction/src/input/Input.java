package input;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
System.out.println("We are make a program for Simple Intrest");
System.out.println("enter pr rate time respectively");
Scanner sc = new Scanner(System.in);
int pr = sc.nextInt();
int rate = sc.nextInt();
int time = sc.nextInt();
System.out.println("your intrest is ");
System.out.println((pr*rate*time)/100);
	}

}
