package strings;

import java.util.Scanner;

public class ReverseOfWords {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String a = sc.nextLine();
	char al[] = new char[a.length()]; 
	char c[] = a.toCharArray();
	for(int i=0;i<a.length();i++)
	{
		System.out.print(c[i]);
	}
}
}
