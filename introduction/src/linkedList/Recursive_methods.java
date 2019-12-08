package linkedList;

import java.util.Scanner;

public class Recursive_methods extends InputFunc {
	
	public static Node<Integer> Insert_Recursive(Node<Integer> head,int pos,int elem)
	{
		if(pos==0)
		{
			Node<Integer> newNode = new Node<Integer>(elem);
			newNode.next=head;
			return newNode;
		}
		
		head.next=Insert_Recursive(head.next, pos-1, elem);
		return head;
	}
	
	public static Node<Integer> Delete_Recursive(Node<Integer> head,int pos)
	{
		if(pos==0)
		{
			return head.next;
		}
		
		head.next=Delete_Recursive(head.next,pos-1);
		return head;
		
	}

	public static void main(String[] args) {
		int elem;
		Scanner sc = new Scanner(System.in);
		elem=sc.nextInt();
		int pos =sc.nextInt();
		Node<Integer> head = takeInput();
		head=Insert_Recursive(head,pos,elem);
		head=Delete_Recursive(head, pos+1);
		print(head);
		sc.close();
	}

}
