package linkedList;

public class MidPoint extends MergeTwoLinkedList {
	
	public static Node<Integer> Midpt(Node<Integer> H1)
	{
		Node<Integer> slow = H1, fast = H1;
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main (String[] args)
	{
		Node<Integer> H1 = takeInput(),mid = null;
		mid = Midpt(H1);
		System.out.println(mid.data);
	}

}
