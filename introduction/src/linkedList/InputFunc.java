package linkedList;

import java.util.Scanner;

public class InputFunc {
	
	public static  Node<Integer> takeInput()
	{
		Node<Integer> Head = null,tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1)
		{
			Node<Integer> newNode = new Node<Integer>(data);
			if(Head==null)
			{
				Head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}
			data=sc.nextInt();
		}
		return Head;
	}
   
	public static void print(Node<Integer> Head) {
		
		while(Head!=null) {
			System.out.print(Head.data + " ");
			Head = Head.next;
		}
		System.out.println();
	}
   
    public static Node<Integer> insert(Node<Integer> Head,int data,int pos)
    {
    	Node<Integer> newNode = new Node<Integer>(data);
    	if(pos==0)
    	{
    		newNode.next=Head;
    		return newNode;
    	}
    		int i = 0;
    		Node<Integer> temp;
    		temp=Head;
    		while(i<pos-1)
    		{
    			temp=temp.next;
    			i++;
    		}
    		newNode.next = temp.next;
    		temp.next=newNode;
        	return Head;
    }
    public static Node<Integer> delete(Node<Integer> Head,int pos)
    {
    	if(pos==0)
    	{
    		Head=Head.next;
    		return Head;
    	}
    		int i = 0;
    		Node<Integer> temp;
    		temp=Head;
    		while(i<pos-1)
    		{
    			temp=temp.next;
    			i++;
    		}
    		temp.next=temp.next.next;
        	return Head;
    }
	
	public static void main(String[] args)
	{
		Node<Integer> Head = takeInput();
		Head = insert(Head,80,0);
		Head = delete(Head,2);
		print(Head);
	}

}
