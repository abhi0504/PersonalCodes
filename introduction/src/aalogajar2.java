import java.util.*;

public class aalogajar2 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
		    	String str1 = s.next();
				String str2 = s.next();
				char c = str2.charAt(0);
				char last = str2.charAt(str2.length() - 1);
				String str = "";
				char arr[] = new char[26];
				for(int i = 0 ; i < str1.length() ; i++)
				{
					int a = str1.charAt(i);
					arr[a-97]++;
				}
				for(int i = 0 ; i < str2.length() ; i++)
				{
					int a = str2.charAt(i);
					arr[a-97]--;
				}
				for(int i = 0 ; i<26 ; i++)
				{
					int time = arr[i];
					char ch = (char) (i+97);
					
					if(ch == c && last<c)
					{
						str += str2;
					}
					
					for(int j = 0 ; j < time ; j++)
					{
						str += ch;
					}
					
					if(ch == c && last>=c)
					{
						str += str2;
					}
					
					
				}
				
				System.out.println(str);
		    
		}
	s.close();
	}
}
