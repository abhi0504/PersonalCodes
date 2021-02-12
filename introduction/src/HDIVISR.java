import java.lang.*;
import java.util.*;

public class HDIVISR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int ans = 1;
	    for(int i = 10 ; i < 0 ; i--)
	    {
	        if(n%i == 0)
	        {
	            ans = i;
	            break;
	        }
	    }
	    System.out.print(ans);
    s.close();

	}

}
