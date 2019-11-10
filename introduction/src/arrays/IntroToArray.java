package arrays;
import java.util.Scanner;
public class IntroToArray {

	public static void main(String[] args) {
		Scanner Kb=new Scanner(System.in);
		String s=Kb.nextLine();
		char c;
		int n = s.length();
     	char ac[] = new char[n];
			for(int i=0;i<s.length();i++)
			{
                 ac[i]=s.charAt(i);
                    
				if(Character.isLowerCase(s.charAt(i)))
				{
					c=Character.toUpperCase(s.charAt(i));
					System.out.print(c);
				}
				else if(Character.isUpperCase(s.charAt(i)))
				{
				    c=Character.toLowerCase(s.charAt(i));
					System.out.print(c);
				}
				else
				{
			       System.out.print(s.charAt(i));
				}
		 }
	}

}