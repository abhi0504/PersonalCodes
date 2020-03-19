import java.util.Scanner;

public class ques_sum_of_boundry_diagonals_matrices {
	public static boolean checkprime(int num)
	{
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
	}
	

    
	public static int nearest_prime(int n)
	{
		int count = 1;
		int no = n;
		int np = n;
		
		while(!checkprime(np))
		{
			np = np+count ;
		}
		
		while(!checkprime(no))
		{
			no = no-count ;
		}	
	
		if((n-no)>np-n)
		{
			n=np;
		}
		else
		{
			n=no;
		}
		
		return n;
	}

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
         int nooftimes = 0 , noofchar;
         int ccc = s.nextInt();
        
		
		int check = 0;char aab;
        while(nooftimes<ccc)
        {
        	noofchar = s.nextInt();
        	String n = s.next();
		for(int i=0 ; i<noofchar ; i++)
		{
			
			if(!checkprime(n.charAt(i)))
			{
				check = nearest_prime(n.charAt(i));
				aab = (char) check;
				System.out.print(aab);
			}
		}
		nooftimes++;
        }

    }
}
