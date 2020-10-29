package linkedList2;

public class StackUsingLL<T> {
	
	public Node<T> head;
	public int size;
	
	
	public StackUsingLL()
	{
		head = null;
		size = 0;
	}
	
	
	public T top(StackUsingLL<T> obj)
	{
		return obj.head.data;
	}
	
	public int size(StackUsingLL<T> obj)
	{
		return size;
	}
	
	public void pop()
	{
		T dat = head.data;
		head = head.next;
		size--;
		System.out.println(dat + " Poppped out");
	}
	
	public void push(T data)
	{
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingLL<Integer> obj = new StackUsingLL<Integer>();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
	}

}
