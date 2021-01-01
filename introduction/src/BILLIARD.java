import java.util.Scanner;

public class BILLIARD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			long n = s.nextLong();
			long k = s.nextLong();
			long x = s.nextLong();
			long y = s.nextLong();
			
			long fx = 0;
			long fy = 0;
			
			int phase = 1;
			
			if(x==y)//diagonal
			{
				k=0;
				fx = n;
				fy = n;
			}
			
			if(x<y)//upper
			{
				while(k!=0)
				{
					//y!=n(Hitting Condition)
					
				}
			}
			
			if(x>y)//lower
			{
				while(k!=0)
				{
					//x!=n(Hitting Condition)
					
					if(x==n)
					{
						k--;
						fx = x;
						fy = y;
						phase = 2;
						
					}
					
					if(y==n)
					{
						k--;
						fx = x;
						fy = y;
						phase =3;
						
					}
					
					if(y==0)
					{
						k--;
						fx = x;
						fy = y;
						phase = 4;
						
					}
					
					if(x==0)
					{
						k--;
						fx = x;
						fy = y;
						phase = 1;
						
					}
					
					if(phase == 1)
					{
						x++;
						y++;
					}
					
					if(phase == 2)
					{
						x--;
						y++;
					}
					
					if(phase == 3)
					{
						x--;
						y--;
					}
					
					if(phase == 4)
					{
						x++;
						y--;
					}
					
					
				}
				
			}
			
			System.out.println(fx + " " + fy);

		}
       
        s.close();

	}

}
