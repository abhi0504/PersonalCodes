package typeCasting;
import java.util.*;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int flag = 1;
        int a[][] = new int[P][2];
        for(int i=0;i<P;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<P;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(a[i][j]<L)
                {
                     flag = 0;
                }
                
            }
        }
        int j=0;
        if(flag>0)
        {
        for(int i=0;i<P;i++)
        {
            
            for(j=0;j<2;j++)
            {
            
            }
            if(a[i][j-1]==a[i][j])
            {
                flag = 2;
            }
        }
        
                            // System.out.println("UPLOAD ANOTHER");
	}

}
