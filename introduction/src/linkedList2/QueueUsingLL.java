
package linkedList2;

public class QueueUsingLL<T> {
	
	Node<T> front = null;
	Node<T> rear = null;
	int size = 0;
	
	public void enqueue(T element)
	{
		Node<T> newNode = new Node<T>(element);
		if(size==0)
		{
			front = newNode;
			rear = newNode;
		}
		
		rear.next = newNode;
		rear=rear.next;
		size ++;
	}
	
	public T dequeue()
	{
		T temp = front.data;
		front = front.next;
		size--;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		QueueUsingArray obj1 = new QueueUsingArray(5);
		obj1.enqueue(10);
		obj1.enqueue(20);
		System.out.println(obj1.dequeue() + " is deleted");
		obj1.enqueue(30);
		System.out.println(obj1.dequeue() + " is deleted");
		obj1.enqueue(40);
		System.out.println(obj1.dequeue() + " is deleted");
		obj1.enqueue(50);
		System.out.println(obj1.dequeue() + " is deleted");
		System.out.println(obj1.dequeue() + " is deleted");	


	}

}
