import java.util.*;
public class AmanQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		a=sc.nextLine();
//		sc.nextLine();
		char arr[] = new char[a.length()];
		int n = a.length();
		for(int i=0,j=n-1;j>=0;i++,j--)
		{
//			arr[i]=a.charAt(j);
			if(a.charAt(i)==' ')
			{
				for(int k=i,l=j+1;k<i;k++,l--)
				{
					arr[k]=a.charAt(l);
				}
				arr[i]=' ';
			}	
//			else
//			{
//				arr[i]=a.charAt(i);
//			}
		}
		for(int i=0;i<a.length();i++)
		{
			System.out.print(arr[i]);
		}
	}
}
