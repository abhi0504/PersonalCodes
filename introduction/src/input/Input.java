package input;
import java.util.*;
public class Input {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
			int i = 0;
			boolean check = false;
			int curr = 0;
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			int sa[] = new int[n];
			for( i = 0 ; i < n ; i += 1 )
			{
				a[i] = s.nextInt();
				sa[i] = a[i];
			}
			
			 Arrays.sort(sa);
			 i=0;
			
			while(i<n)
			{
				if(a[i] == sa[i])
				{
					i++;
				}
				else
				{
					for(int j = 0 ; j < n ; j += k )
					{
						if(a[i] == a[j] )
						{
							check = true;
							i++;
							break;
						}
					}
					
					if(check == false)
					{
						break;
					}
					
				}

			}
			 
			if(check == false)
			{
				System.out.println("no");
			}
			else
			{
				System.out.println("yes");
			}
			 

			t--;
		}
		
		
        s.close();
		
	}

}
