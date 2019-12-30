package queue;

import java.util.*;

public class queue_usingLLuse {

	public static void main(String[] args) throws queue_empty_exception
	{
		QueueUsingLL<Integer> obj = new QueueUsingLL<>();
		for(int i=0;i<5;i++)
		{
			obj.enqueue(i);
		}
		
		while(obj.size()!=0)
		{
			System.out.println(obj.dequeue());
		}		
		
	}

}
