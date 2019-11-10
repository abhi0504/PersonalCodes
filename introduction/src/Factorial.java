import java.util.Scanner;


public class Factorial {
	public void new_func()
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m=1;
	    char t ='m';
	    for(int i=0;n>0;i++)
	    {
	    	if((i%2)==0)
	    	{
	    		n = n-m;
	    		t='m';
	    	}
	    	else
	    	{
	    		n = n-(2*m);
	    		t='p';
	    	}
	    	m++;
	    }
	    if(t=='m')
	    {System.out.println("MOTU");}
	    else
	    	System.out.println("PATLU");
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m=1;
	    char t ='m';
	    for(int i=0;n>0;i++)
	    {
	    	if((i%2)==0)
	    	{
	    		n = n-m;
	    		t='m';
	    	}
	    	else
	    	{
	    		n = n-(2*m);
	    		t='p';
	    	}
	    	m++;
	    }
	    if(t=='m')
	    {System.out.println("MOTU");}
	    else
	    	System.out.println("PATLU");

	}

}
