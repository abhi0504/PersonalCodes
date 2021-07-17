package arrays_450;

public class MergeSortLL {
	
	static class Node {
	    int data;
	    Node next, prev;
	};
	
	static Node insert(Node head, int data)
	{
	    // allocate node
	    Node temp = new Node();
	  
	    // put in the data
	    temp.data = data;
	    temp.next = temp.prev = null;
	  
	    if ((head) == null)
	        (head) = temp;
	    else {
	        temp.next = head;
	        (head).prev = temp;
	        (head) = temp;
	    }
	    return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	Node head = null;
		    // insert values in sorted order
		    head = insert(head, 9);
		    head = insert(head, 8);
		    head = insert(head, 6);
		    head = insert(head, 5);
		    head = insert(head, 4);
		    head = insert(head, 2);
		    head = insert(head, 1);

	}

}
