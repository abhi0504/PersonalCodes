package priorityQueue;

import java.util.ArrayList;

public class Priority_Queue {
	
	private ArrayList<Integer> heap; 
	
	public Priority_Queue() 
	{
		heap = new ArrayList<Integer>();
	}
	
	public Boolean isEmpty() 
	{
		if(heap.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int size() 
	{
		return heap.size();
	}
	
	public int getMin() throws PriorityQueueException 
	{
		if(heap.size() == 0)
		{
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}
	
	

}
