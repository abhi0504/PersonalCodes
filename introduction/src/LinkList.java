import java.util.*;
class Node<T> {
	T data ;
	Node<T> next;
	
	Node(T data)
	{
		this.data = data;
		next = null;
	}
	
}
public class LinkList {
	
	public static Node<Integer> inputfunc()
	{
		Scanner s = new Scanner(System.in);
		int data = 0;
		Node<Integer> head = null,tail=null;
		data=s.nextInt();
		while(data != -1)
		{
			Node<Integer> newnode = new Node<>(data);
			if(head == null)
			{
				head = newnode;
				tail = newnode;
			}
			else
			{
				tail.next=newnode;
				tail=newnode;
			}
			data=s.nextInt();	
		}
		return head;
	}
	
	   public static void printing(Node<Integer> Head) {
			
			while(Head!=null) {
				System.out.print(Head.data + " ");
				Head = Head.next;
			}
			System.out.println();
		}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the data in lined list untill -1");
		Node<Integer> head1 = inputfunc();
		printing(head1);
	}

}
