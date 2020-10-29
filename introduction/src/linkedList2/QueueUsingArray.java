package linkedList2;

public class QueueUsingArray {
	
	int data[];
	int front;
	int rear;
	int size;
	
	public QueueUsingArray() {
		
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public QueueUsingArray(int capacity) {
		
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public int top()
	{
		return data[front];
	}
	
	public int size()
	{
		return size;
	}
	
	public void enqueue(int element)
	{
		if(size == 0)
		{
			front++;
		}
	
		rear++;
		size++;
		if(rear == data.length)
		{
			rear=0;
		}
		data[rear] = element;
		
	}
	
	public int dequeue()
	{
		int temp = data[front];
		front++;
		size--;
		return temp;
	}
	

	public static void main(String[] args) {
		
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
		

		
	}

}
