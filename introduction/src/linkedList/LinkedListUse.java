package linkedList;

public class LinkedListUse {
	public static void print(Node<Integer> head)
	{
		while(head!=null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node<Integer> node1 = new Node<Integer>(10);
//		System.out.println(node1.data);
//		System.out.println(node1.next);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(30);
		node1.next=node2;
		node2.next=node3;
		node3.next=null;
		
		Node<Integer> head = node1;
		print(head);
		
	}

}
