package strings;
import java.util.Scanner;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String a = sc.nextLine();
		System.out.println("enter the Second string");
		String b = sc.nextLine();
		boolean isanagram = false ;
		boolean visited[] = new boolean[a.length()] ;
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				isanagram = false ;
				char c = a.charAt(i);
				for(int j=0;j<a.length();j++)
				{
					if(b.charAt(j)==c && !visited[j])
					{
						visited[j]=true;
						isanagram = true;
						break;
					}
				}
				if(!isanagram)
				{
					break;
				}
			}
		}
		if(isanagram)
			System.out.println("Your strings are anagrams");
		else
		{
			System.out.println("Your strings are not anagrams");
		}
	}

}
