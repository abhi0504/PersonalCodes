package hackerRank;

import java.util.*;
public class Ques8 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			int n = s.nextInt();
			int temp = n;
			char a[] = new char[str.length()];
 			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
				{
					n = temp;
					if(n>26)
					{
						while(n>26)
						{
							n -= 26;
						}
					}
					a[i] = str.charAt(i);
					if(a[i]+n>'Z')
					{
						a[i] += n - 26;
					}
					else
					{
						a[i] += n;
					}
					System.out.print(a[i]);
				}
				if(str.charAt(i)>='a'&& str.charAt(i)<='z')
				{
					n = temp;
					if(n>26)
					{
						while(n>26)
						{
							n -= 26;
						}
					}
					a[i] = str.charAt(i);
					if(a[i]+n>'z')
					{
						a[i] += n - 26;
					}
					else
					{
						a[i] += n;
					}
					System.out.print(a[i]);
                }
				if(str.charAt(i)>='0'&& str.charAt(i)<='9')
				{
					n = temp;
					if(n>16)
					{
						while(n>16)
						{
							n -= 10;
						}
					}
					a[i] = str.charAt(i);
					if(a[i]+n>'9')
					{
						a[i] += n - 10;
					}
					else
					{
						a[i] += n;
					}
					System.out.print(a[i]);

				}
				if((str.charAt(i)>=' '&& str.charAt(i)<='/')||(str.charAt(i)>=':'&& str.charAt(i)<='@')||(str.charAt(i)>='['&& str.charAt(i)<='_')||(str.charAt(i)>='{'&& str.charAt(i)<='~'))
				{
					a[i] = str.charAt(i);
					System.out.print(a[i]);
				}
			}
	}

}
