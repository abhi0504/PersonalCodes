package hackerRank;
import java.util.Scanner;
public class Ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int j = 0;
		while(j<t)
		{
			boolean check = true;
			String a = sc.nextLine();
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
				System.out.println("YES");
			else
			{
				System.out.println("NO");
			}
			j++;
			
		}
		sc.close();
	}

}
