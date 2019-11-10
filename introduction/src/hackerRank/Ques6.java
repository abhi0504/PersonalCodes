package hackerRank;
import java.util.*;
public class Ques6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int arr[] = new int[10];
		int count=0;
		long b = 100000*100000;
//		if(a<9999999999)
		if(a<b)
		{
		for(int i=0;i<10;i++)
		{
			int r = (int) (a%10);
			arr[i]=r;
			a = (a-r)/10;
		}
		for(int i=9,j=1;i>=0;i--,j++)
		{
			count += (arr[i]*j);
		}
		}
		else
		System.out.println("illegal ISBN");

		if(count%11==0)
			System.out.println("Legal ISBN");
		else
			System.out.println("illegal ISBN");
		sc.close();

	}

}
