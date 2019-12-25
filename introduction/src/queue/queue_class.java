package queue;

public class queue_class {

	public static void main(String[] args) throws queue_full_exception, queue_empty_exception {

		queueUsingArray obj = new queueUsingArray();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.enqueue(60);
		
		for(int i=0;i<6;i++)
		{
			System.out.println(obj.dequeue());
		}

		
		
	}

}
