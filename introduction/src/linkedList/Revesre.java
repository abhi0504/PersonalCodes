package linkedList;

public class Revesre extends InputFunc {

	public static Node<Integer> Reverse(Node<Integer> head)
	{
     	Node<Integer> prev = null, curr = head, temp;
     	while(curr!=null)
     	{
     		temp=curr.next;
     		curr.next=prev;
     		prev=curr;
     		curr=temp;
     	}
		return prev;
	}
	
	public static void main(String[] args)
	{
		Node<Integer> H1 = takeInput();
		H1 = Reverse(H1);
		print(H1);
	}
}
