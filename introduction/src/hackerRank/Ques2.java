package hackerRank;
import java.util.Scanner;
import java.lang.Math;
public class Ques2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0,T,f;
		int al = 1, bl = 7;
		T =sc.nextInt();
		while(i<T)
		{
			f =sc.nextInt();
			if(Math.abs(al-f)>Math.abs(bl-f))
			{
				bl=f;
				System.out.println("B");
			}
			else
			{
				al=f;
				System.out.println("A");
			}
			if(Math.abs(al-f)==Math.abs(bl-f))
			{
				if(Math.abs(al-1)>Math.abs(bl-1))
				{
					bl=f;
					System.out.println("B");
				}
				else
				{
					al=f;
					System.out.println("A");
				}
			}
			i++;
		}
      sc.close();
	}

}
