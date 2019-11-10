package strings;
import java.util.Scanner;
public class Anagram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		System.out.println("enter the first string");
		String a = sc.nextLine();
		System.out.println("enter the Second string");
		String b = sc.nextLine();
		int al[] = new int[256];
		int bl[] = new int[256];
		for(int i=0;i<a.length();i++)
		{
			int index=a.charAt(i);
			al[index]++;
		}
		for(int i=0;i<b.length();i++)
		{
			int index=b.charAt(i);
			bl[index]++;
		}
		for(int i=0;i<256;i++)
		{
			if(bl[i]!=al[i])
			{
				check = false;
				break;
			}
		}
		if(check)
			System.out.println("Your strings are anagrams");
		else
		{
			System.out.println("Your strings are not anagrams");
		}
	
	}

}
