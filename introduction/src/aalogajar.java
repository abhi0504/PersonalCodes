import java.util.*;
public class aalogajar {
	
	static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			while(t-->0)
			{
				int k = s.nextInt();
				int count = 0;
				for(int i = 1 ; i < 2*k+1 ; i++)
				{
					count += gcd( k+(i*i) , k + (i+1)*(i+1));
				}
				System.out.println(count);
			}

			s.close();
	}
}
