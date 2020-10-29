package recursionQues;

public class Sumofdigits {

	public static int foo (int num)
	{
		if(num/10 == 0)
		{
			return num;
		}
		else
		{
			return num % 10 + foo(num/10);
		}
	}
	public static void main(String[] args) {

		System.out.println(foo(4567));
	}

}
