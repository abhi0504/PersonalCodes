package hackerRank;
import java.util.Scanner;
public class Ques1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char a[] = new char[9];
		String str = sc.nextLine();
		boolean value = true;
		for(int i=0;i<9;i++)
		{		
			a[i]=str.charAt(i);						
		}
		for(int i=0;i<9;i++)
		{		
			if(i!=2&&i!=6)
			{
				if(a[0]%2==0)
				{				
						if(a[i]%2!=0)
						{
							value=false;
							break;
						}					
				}
		    
				if(a[0]%2!=0)
				{
						if(a[i]%2==0)
						{
							value=false;
				 			break;
						}
				}
			}
			if(i==2)
			{
				if(a[2]=='A'||a[2]=='E'||a[2]=='I'||a[2]=='O'||a[2]=='U'||a[2]=='Y')
				{
					value = false;
				}
			}
		}
		if(value==true)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}		
	}
	
}
		
		
		
	


