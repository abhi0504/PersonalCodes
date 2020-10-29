import java.util.*;
public class aalogajar {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			while(t-->0)
			{
				int n = s.nextInt();
				int c = s.nextInt();
				int arr[] = new int[n];
				int a[] = new int[5000];
//				int a = 1 , b = c ;
				int max = 0;
				for(int i = 0 ; i < n ; i++)
				{
					arr[i] = s.nextInt();
				}
				for(int i = 0 ; i < n ; i++)
				{
					a[arr[i]]++;
				}
				for(int i = 0 ; i < 5000 ; i++)
				{
					if(a[i]>max)
					{
						max = a[i];
					}
				}
				
				System.out.println(max);
				
				
//				System.out.println(a);
//				System.out.println(b);
			}

			s.close();
	}
}
