package stacks;

public class StackUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLL<Integer> obj = new StackUsingLL<Integer>();
		for(int i=1 ; i<6;i++)
		{
			obj.push(i);
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
