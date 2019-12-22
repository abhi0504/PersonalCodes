package stacks;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	public StackUsingLL()
	{
		head=null;
		size=0;
	}

	public int size()
	{
		return size;
	}
	
	public T top() throws Stackemptyexception
	{
		if(size==0)
		{
			throw new Stackemptyexception();
		}
		return head.data;
	}
	
	public void push(T data)
	{
		Node<T> newNode = new Node<T>(data);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	public T pop() throws Stackemptyexception
	{
		if(size==0)
		{
			throw new Stackemptyexception();
		}
		
		T temp;
		temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
}
