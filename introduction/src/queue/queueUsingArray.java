package queue;

public class queueUsingArray {
	
   private int data[];
   private int front=-1;
   private int rear=-1;
   private int size=0;
	
   
   public queueUsingArray()
   {
	   data = new int[10];
	    int front=-1;
	    int rear=-1;
	    int size=0;
   }
   
   public queueUsingArray(int capacity)
   {
	   data = new int[capacity];
	    int front=-1;
	    int rear=-1;
	    int size=0;
   }
   
   
   public int size()
   {
	   return size;
   }
   
   
   public void enqueue(int element) throws queue_full_exception
   {
	   
	   if(size==data.length)
	   {
		   throw new queue_full_exception();
	   }
	   if(size==0)
	   {
		   front++;
	   }
	   rear++;
	   if(rear==data.length)
	   {
		   rear=0;
	   }
	   size++;
	   data[rear]=element;
	   
   }
   
   public int dequeue() throws queue_empty_exception
   {
	   if(size==0)
	   {
		   throw new queue_empty_exception();
	   }
	   
	   int temp = data[front];
	   front++;
	   if(front==data.length)
	   {
		   front=0;
	   }
	   size--;
	   if(size==0)
	   {
		   front=-1;
		   rear=-1;
	   }
	   return temp;
   }
   


}
