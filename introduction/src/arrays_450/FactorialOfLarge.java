package arrays_450;
import java.util.*;

public class FactorialOfLarge {
	
	static int multiply( int x , ArrayList<Integer> res , int res_size )
    {
        int carry = 0;
        
        for(int i = 0 ; i <res_size ; i++ )
        {
            int prod = res.get(i) * x + carry;
            res.set(i , prod % 10);
            // res[i] = prod % 10;
            carry = prod/10; 
        }
        
         while (carry!=0)
        {
            res.add(res_size , carry % 10);
            // res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        
        return res_size;
        
    }
    
    static ArrayList<Integer> factorial(int N){
        //code here
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        int res_size = 1;
        res.add(0 , 1);
        
        for(int i = 2 ; i <= N ; i++)
        {
             res_size = multiply(i , res , res_size );
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = factorial(5);
		System.out.println(res);
	}

}
