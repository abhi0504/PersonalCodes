package recursionQues;

public class PowerBaseQues {
	
	public static int foo(int base , int power)
	{
		if(power == 1)
			return base;
		else
		{
			return base * foo(base , power -1);
		}
	}
	
	
	public static void main (String[] args)
	{
		System.out.println(foo(3,3));
	}
}
