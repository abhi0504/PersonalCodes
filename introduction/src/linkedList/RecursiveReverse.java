package linkedList;

public class RecursiveReverse extends InputFunc {
	
	public static Node<Integer> ReverseR(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		else
		{
			Node<Integer> finalhead = ReverseR(head.next);
			Node<Integer> temp = finalhead;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=head;
			head.next=null;
			return finalhead;
		}
	}
	
	public static DoubleNode better_ReverseR(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		 
		DoubleNode smallans = better_ReverseR(head.next);
		smallans.tail.next=head;
		head.next=null;
		
		DoubleNode ans = new DoubleNode();
		ans.head=smallans.head;
		ans.tail=head;
		return ans;
		
	}
	
	public static Node<Integer> best_Reverse_recursive(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		Node<Integer> tail = head.next;
		Node<Integer> finalhead = best_Reverse_recursive(head.next);
		tail.next = head;
		head.next=null;
		
		return finalhead;
	}
	
	public static void main(String[] args)
	{
		Node<Integer> head = takeInput();
		DoubleNode ans = better_ReverseR(head);
		print(ans.head);
		Node<Integer> head1 = takeInput();
		Node<Integer> ans1 = best_Reverse_recursive(head1);
		print(ans1);

	}

}
