import java.util.ArrayList;
import java.util.Scanner;

public class BILLIARD {
	
	public static class Abc {
		long ax = 0;
		long ay = 0;
	}

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
						
			ArrayList<Abc> myAl = new ArrayList<Abc>();
			
			long tt = (k-1)%4;
			
			if(x==y)//diagonal
			{
				fx = n;
				fy = n;
			}
			
			
			if(x>y)
			{
				
				Abc obj1 = new Abc();
				Abc obj2 = new Abc();
				Abc obj3 = new Abc();
				Abc obj4 = new Abc();
				
				obj1.ax = n;
				obj1.ay = y+n-x;
				
				obj2.ax = y+n-x;
				obj2.ay = n;

				obj3.ax = 0;
				obj3.ay = x-y;

				obj4.ax = x-y;
				obj4.ay = 0;

				myAl.add(obj1);
				myAl.add(obj2);
				myAl.add(obj3);
				myAl.add(obj4);
				
				fx = myAl.get((int) tt).ax;
				fy = myAl.get((int) tt).ay;

			}
			
			if(x<y)
			{
				
				Abc obj1 = new Abc();
				Abc obj2 = new Abc();
				Abc obj3 = new Abc();
				Abc obj4 = new Abc();
				
				obj1.ax = x+n-y;
				obj1.ay = n;
				
				obj2.ax = n;
				obj2.ay = x+n-y;

				obj3.ax = y-x;
				obj3.ay = 0;

				obj4.ax = 0;
				obj4.ay = y-x;

				myAl.add(obj1);
				myAl.add(obj2);
				myAl.add(obj3);
				myAl.add(obj4);
				
				fx = myAl.get((int) tt).ax;
				fy = myAl.get((int) tt).ay;

			}
			

			System.out.println(fx);
			System.out.println(fy);
		}
		
       
        s.close();

	}

}
