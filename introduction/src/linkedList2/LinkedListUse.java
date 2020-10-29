package linkedList2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListUse {
	
	public static void insertLL(Node<Integer> head, int pos , int data )
	{
		int count = 0;
	    pos -= 1;
		while(head != null)
		{
			count ++;
			if(count == pos)
			{
				Node<Integer> newNode = new Node<>(data) ;
				Node<Integer> temp = head.next;
				head.next=newNode;
				newNode.next=temp;
			}
			head = head.next;
		}
	}
	
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp = head;
		while(head != null)
		{
			System.out.print(head.data + " ");
			head=head.next;
		}
	}

	public static Node<Integer> input()
	{
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner s = new Scanner(System.in);		
		int data = s.nextInt();
		while(data > 0)
		{
			Node<Integer> newNode = new Node<>(data);
			if(head == null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void append(Node<Integer> head , int pos)
	{
		Node<Integer> temp = head;
		Node<Integer> curr = head;
		int len = 0;
		while(curr != null)
		{
			len++;
			curr = curr.next;
		}
		int count = 0;
		while(head != null)
		{
			head=head.next;
			count ++;
			if(count==pos)
			{
				break;
			}
		}
		print(head);
		int i = 0;
		while(i<len-count)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
			i++;
		}
	}
	
	public static void midpt(Node<Integer> head)
	{
		Node<Integer> slow = head ;
		Node<Integer> fast = head ;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}
	
	public static Node<Integer> mergeTwoSortedLL(Node<Integer> t1 , Node<Integer> t2)
	{
		Node<Integer> h = null;
		Node<Integer> t = null;
		
		if(t1.data > t2.data)
		{
			h = t2;
			t = t2;
			t2 = t2.next;
		}
		else 
		{
			h = t1;
			t = t1;
			t1=t1.next;
		}
		
		
		while(t1 != null && t2 != null)
		{
			if(t1.data > t2.data)
			{
				t.next = t2;
				t = t2;
				t2 = t2.next;
			}
			else 
			{
				t.next = t1;
				t = t1;
				t1=t1.next;
			}
		}
		
		if(t1 == null)
		{
			t.next = t2;
		}
		else
		{
			t.next = t1;
		}
		
		return h;
	}
	
	public static Node<Integer> reverseLLrecursive(Node<Integer> head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		Node<Integer> finalHead = reverseLLrecursive(head.next);
		Node<Integer> temp = finalHead ;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return finalHead;
	}
	
	public static DoubleNode<Integer> reverseLLrecursiveBetter(Node<Integer> head)
	{
		if(head == null || head.next ==null)
		{
			DoubleNode<Integer> Ans = new DoubleNode<Integer>();
			Ans.head = head;
			Ans.tail = head;
		    return Ans;
		}
		
		DoubleNode<Integer> smallAns = reverseLLrecursiveBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		DoubleNode<Integer> Ans = new DoubleNode<Integer>();
		Ans.head =  smallAns.head;
		Ans.tail =  head;
		return Ans;
		}
	
	public static Node<Integer> reverseItretively(Node<Integer> head)
	{
		Node<Integer> tail = head;
		Node<Integer> prev = head;
		Node<Integer> curr = head.next;
		Node<Integer> temp = curr.next;
		
		while(tail.next != null)
		{
			tail = tail.next;
		}
		
		
		if(prev == head)
		{
			prev.next = null;
		}
		
		while(curr != tail)
		{
			curr.next = prev;
			prev = curr;
			curr = temp;
			temp = temp.next;
		}
		
		curr.next = prev;
		
		return curr;

	}
	
	public static Node<Integer> insertRecursive(Node<Integer> head , int pos , int element )
	{
		if(pos == 0)
		{
			Node<Integer> newNode = new Node<Integer>(element);
			newNode.next = head;
			return newNode;
		}
		
		head.next = insertRecursive(head.next, pos - 1, element);
		return head;
	}
	
	public static Node<Integer> deleteRecursive(Node<Integer> head , int pos )
	{
		if(pos == 0)
		{
			head = head.next;
			return head;
		}
		
		head.next = deleteRecursive(head.next, pos - 1);
		return head;
	}
	
	public static Node<Integer> findNode(Node<Integer> head , int element)
	{
		if(head.data == element)
		{
			return head;
		}
		
		Node<Integer> node = findNode(head.next , element);
		return node;
	}
	
	public static Node<Integer> oddaftreven(Node<Integer> head) {
		
		Node<Integer> oddh = null;
		Node<Integer> oddt = null;
		Node<Integer> evenh = null;
		Node<Integer> event = null;
		
		while(head != null)
		{
			if(head.data%2!=0)
			{
				if(oddh == null)
				{
					oddh = head;
					oddt = head;
				}
				
				else
				{
					oddt.next = head;
					oddt = oddt.next;
				}
			}
			
			else
			{
				if(evenh == null)
				{
					evenh = head;
					event = head;
				}
				
				else
				{
					event.next = head;
					event = event.next;
				}
			}
			
		
			head = head.next;
		}
		
		oddt.next = null;
		event.next = null;
		
		oddt.next = evenh;
		
		return oddh;
		
	}
	
	public static Node<Integer> deletennodes(Node<Integer> head)
	{
		Scanner s = new Scanner(System.in);
		int index = s.nextInt();
		int n = s.nextInt();
		int aalo = 1;
		int count = 0 ;
		Node<Integer> temp = null;
		while(head!=null)
		{
			if(count == index)
			{
				temp = head;
				while(aalo != n)
				{
					temp = temp.next;
					count++;
				}
			}
			
			head.next = temp;
	
			count ++;
			head=head.next;
		}
		return head;
	}
	
	public static Node<Integer> evenAfterOdd(Node<Integer> head) 
	{
		Node<Integer> eh = null;
		Node<Integer> et = null;
		Node<Integer> oh = null;
		Node<Integer> ot = null;
		
		while(head != null)
		{
			if(head.data % 2 == 0)
			{
				if(eh == null)
				{
					eh = head;
					et = head;
				}
				else
				{
					et.next = head;
					et = et.next;
				}
			}
			else
			{
				if(oh == null)
				{
					oh = head;
					ot = head;
				}
				else
				{
					ot.next = head;
					ot = ot.next;
				}
			}
			
			head = head.next;
		}
		
		et.next = null;
		ot.next = eh;
		
		return oh;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head1 = input();
		print(head1);
//		Node<Integer> head2 = input();
//		print(head2);
//		System.out.println();
//		Node<Integer> h3 = mergeTwoSortedLL(head1 , head2);
//		print(h3);
		Node<Integer> fh = evenAfterOdd(head1);
		System.out.println();
		print(fh);
}
}
