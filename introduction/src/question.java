import java.util.Scanner;
public class question {

	    public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner(System.in);
	    	int price1,price2;
	    	int t = sc.nextInt();
	    	for(int k=0;k<t;k++)
	        {
	        int net_sum1 = 0;
	        int net_sum2 = 0;
	        price1 = sc.nextInt();
	        int sum1 = 0, sum2 = 0;
	        int sum3 = 0, sum4 = 0;
	        price2 = sc.nextInt();
	        int mem = sc.nextInt();
	        for(int i=0;i<mem;i++)
	        {
	            for(int j=0;j<1;j++)
	            {
	                int a = sc.nextInt();
	                int b = sc.nextInt();
	                sum1 += price1*a;
	                sum2 += price2*b;
	                net_sum1=sum1+sum2;
	                sum3 += price2*a;
	                sum4 += price1*b;
	                net_sum2=sum3+sum4;
	            }
	        }
	        if(net_sum1<net_sum2)
	        {
	        	System.out.println(net_sum1);
	        }
	        else
	        {
	        	System.out.println(net_sum2);
	        }
	    }
	}
}

