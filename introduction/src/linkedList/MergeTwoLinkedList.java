package linkedList;

public class MergeTwoLinkedList extends InputFunc {
	
	public static Node<Integer> Merge(Node<Integer> T1 , Node<Integer> T2)
	{
		Node<Integer> H3 = T1, T3 = T1;
		while(T1 != null || T2 != null)
		{
			if(T1.data<=T2.data)
			{
				T3.next = T1;
				T1=T1.next;
			}
			else
			{
				T3.next = T2;
				T2=T2.next;
			}
			T3 = T3.next;
		}
	 return H3;	
	}

	public static void main(String[] args) {

		Node<Integer> H1=null,H2=null,H3=null;
		H1=takeInput();
		H2=takeInput();
		H3=Merge(H1,H2);
		print(H3);
	}

}
