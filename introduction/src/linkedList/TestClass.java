package linkedList;

import java.util.Scanner;

public class TestClass {
	
	public static Node<Integer> take_input()
	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1)
		{
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		
		Node<Integer> head = take_input();
		print(head);
	}

	private static void print(Node<Integer> head) {
			
		while(head != null)
		{
			System.out.println(head.data + " ");
			head = head.next;
		}
		
	}

}
