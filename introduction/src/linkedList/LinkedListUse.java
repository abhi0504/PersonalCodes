package linkedList;

public class LinkedListUse {
	public static void print(Node<Integer> head)
	{
		while(head!=null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}

	public static Node<Integer> head;
	
	public static void rotate(int k) 
    { 
        if (k == 0) 
            return; 
  
        // Let us understand the below code for example k = 4 
        // and list = 10->20->30->40->50->60. 
        Node<Integer> current = head; 
  
        // current will either point to kth or NULL after this 
        // loop. current will point to node 40 in the above example 
        int count = 1; 
        while (count < k && current != null) { 
            current = current.next; 
            count++; 
        } 
  
        // If current is NULL, k is greater than or equal to count 
        // of nodes in linked list. Don't change the list in this case 
        if (current == null) 
            return; 
  
        // current points to kth node. Store it in a variable. 
        // kthNode points to node 40 in the above example 
        Node kthNode = current; 
  
        // current will point to last node after this loop 
        // current will point to node 60 in the above example 
        while (current.next != null) 
            current = current.next; 
  
        // Change next of last node to previous head 
        // Next of 60 is now changed to node 10 
  
        current.next = head; 
  
        // Change head to (k+1)th node 
        // head is now changed to node 50 
        head = kthNode.next; 
  
        // change next of kth node to null 
        kthNode.next = null; 
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
