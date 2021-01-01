import java.util.*;

public class codechef {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			long req = s.nextLong();
			long days = s.nextLong();
			int arr[] = new int[n];
			long sum = 0 ;
			for(int i = 0 ; i < n ; i++)
			{
				arr[i] = s.nextInt(); 
				sum += arr[i];
			}
			long ans = sum/req;
			if(sum>req*days)
			{
				ans = days;
			}
			System.out.println(ans);
		}
       
        s.close();

	}

}
