import java.util.*;

public class DECODEIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			String str = s.next();
			char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
			String finalAns = "";
			for(int i = 0 ; i < n ; i += 4)
			{
				int num = Integer.parseInt(str.substring(i, i+4),2);
				char word = alpha[num];
				finalAns += word;
			}
			System.out.println(finalAns);
		}
       
        s.close();


	}

}
