package linkedList;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Node<Integer> Head = null ,Tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1)
		{
			Node<Integer> newNode = new Node<Integer>(data);
			if(Head == null)
			{
				Head=newNode;
				Tail=newNode;
			}
			else
			{
				Tail.next=newNode;
				Tail=newNode;
			}
			data = s.nextInt();
		}
		
		int n = s.nextInt();
		int i=0;
		int a[] = new int[10];
		Node<Integer> temp = null;
	   
		while(Head != null&&Head.data!=n)
		{	
			a[i]=Head.data;
			Head = Head.next;
			i++;
		}
		
		while(Head != null)
		{
			temp.data = Head.data;
			Head = Head.next;
			temp = temp.next;
		}
		
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
