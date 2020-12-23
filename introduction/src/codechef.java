import java.util.*;

public class codechef {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
			int n = s.nextInt();
			int canPresent = 120 - n;
			String str = s.next();
			for(int i = 0 ; i < n ; i++)
			{
				if(str.charAt(i) == '1')
				{
					canPresent++;
				}
			}
			canPresent *= 100;
			canPresent /= 120;
			if(canPresent>=75)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			t--;
		}
       
        s.close();

	}

}
