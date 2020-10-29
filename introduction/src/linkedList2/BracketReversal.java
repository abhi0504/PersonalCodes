package linkedList2;

import java.util.Scanner;
import java.util.Stack;

public class BracketReversal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Stack<Character> stack = new Stack<>();
		int n = 0;
		while(n < str.length())
		{
			if(str.charAt(n) == '(')
			{
				stack.push(str.charAt(n));
			}
			else
			{
				stack.pop();
			}
		n++;
		}
		System.out.println(stack.size());
	}

}
