package stacks;

public class Stackuse extends Stack_using_array {

	public static void main(String[] args)
	{
		Stack_using_array obj = new Stack_using_array();
		for(int i=1 ; i<6;i++)
		{
			try {
				obj.push(i);
			} catch (Stackfullexception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(obj.size()!=0)
		{
			try {
				System.out.println(obj.pop());
			} catch (Stackemptyexception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
