package recursionQues;

public class Count5 {
	public static int foo (int num)
	{
		if(num/10 == 0)
		{
			if(num == 5)
				return 1;
			else
				return 0;
		}
		else
		{
			if(num % 10 ==5)
			{
				return 1 + foo(num/10);
			}
			else
				return foo(num/10);
		}
	}
	public static void main(String[] args) {

		System.out.println(foo(4555567));
	}
}
