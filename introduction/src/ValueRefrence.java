
class dog
	{
		int legs,eyes;
		void count(int a)
		{
			legs +=2;
		}
	}
public class ValueRefrence {
	static void swap(int a , int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		int a, b;
		a=10;
     	b=20;
//     	System.out.println("a=10;\r\n" + 
//     			"     	b=20;");
//		swap(a,b);
//		System.out.println(a);
//		System.out.println(b);
		dog husky = new dog();
		husky.legs=2;
		husky.count(9);
		Factorial f = new Factorial();
	    f.new_func();
//		System.out.println(husky.legs);
	}
}
