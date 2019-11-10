import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int al[] = new int[256];
		int j = 0 ;
		
		int t = sc.nextInt();
		sc.nextLine();
		do
		{
		String a = sc.nextLine();
		String b = sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
			int index=a.charAt(i);
			al[index]++;
		}
		for(int i=0;i<b.length();i++)
		{
			int index=b.charAt(i);
			if(a.charAt(i)==b.charAt(i))
			al[index]--;
			else
			al[index]++;
		}
		int sum = 0;
		for(int i=0;i<256;i++)
		{
			sum = sum + al[i];
		}
		System.out.println(sum);
        j++;
		}
		while(j<t);
	}

}
