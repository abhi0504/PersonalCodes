package hackerRank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Ques4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=0;
		int t = sc.nextInt();
		while(k<t)
		{
		   	int a=sc.nextInt();
		   	for(int i=1;i<=a;i++)
		   	{
		   	    for(int j=1;j<=2*a;j++)   
		   	    {
		   	    	if(j>2*a-i || j<=i)
			   	    System.out.print("*");
		   	    	else
		   	        System.out.print("#");
		   	    }
	   	        System.out.println(" ");
		   	}
		k++;
		}
	}

}
