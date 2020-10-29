package trees;

import trees.Node;
import queue.queue_empty_exception;

public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL()
	{
		front = null;
		rear = null;
		size=0;
	}
	
	public QueueUsingLL(int capacity)
	{
		front = null;
		rear = null;
		size=capacity;
	}
	
	
	int size()
	{
		return size;
	}
	
	public boolean isempty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void enqueue(T element)
	{
		Node<T> newnode = new Node(element);
		if(size==0)
		{
			front = newnode;
			rear = newnode;
		}
		else
		{
			rear.next=newnode;
			rear=rear.next;
		}
		size++;
	}
	
	public T dequeue() throws queue_empty_exception
	{
		T temp = front.data;
		if(size==0)
		{
			throw new queue_empty_exception();
		}
		else 
		{
			front=front.next;
		}
		if(size==1)
		{
			rear=null;
		}
		size--;
		return temp;
	}
	
}
