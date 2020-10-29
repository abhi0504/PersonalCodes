package recursionQues;

public class FactorialByRecursion {
	
	public static int foo(int n)
	{
		if(n==1)
			return 1;
		else 
			return n * foo(n-1);
	}
	
	public static void main(String[] args)
	{
		System.out.println(foo(4));
	}

}
