package linkedList2;

import java.util.*;

public class StackReverse {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stackans = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		while(n>0)
		{
			int item = s.nextInt();
			stack.push(item);
			n--;
		}
		
		while(stack.size() != 0)
		{
			stackans.push(stack.pop()) ;
		}
		
		while(stackans.size() != 0)
		{
			System.out.println(stackans.pop());
		}


	}

}
