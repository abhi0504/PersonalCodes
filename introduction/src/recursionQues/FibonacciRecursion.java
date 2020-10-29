package recursionQues;

public class FibonacciRecursion {

	public static int foo(int num)
	{
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		else
			return foo(num-1) + foo(num-2);
	}
	public static void main(String[] args) {
		
		System.out.println(foo(8));
		int na =123;
		System.out.println(na/10);
	}

}
