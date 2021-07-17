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
	
	public void insert(int element)
	{
		heap.add(element);
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		while(childIndex > 0)
		{
			if(heap.get(childIndex) < heap.get(parentIndex))
			{
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}
			else {
				return;
			}
		}
	}
	
	public int removeMin() throws PriorityQueueException
	{
		if(heap.size() <= 0)
		{
			throw new PriorityQueueException();
		}
		int index = heap.get(0);
		int indi= 0;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int minIndex = 0;
		int lchildIndex = 1;
		int rchildIndex = 2;
		
		while(lchildIndex < heap.size())
		{
			if(heap.get(lchildIndex) < heap.get(minIndex))
			{
				minIndex = lchildIndex;
			}
			if(rchildIndex < heap.size() && heap.get(rchildIndex) < heap.get(minIndex))
			{
				minIndex = rchildIndex;
			}
			if(minIndex == indi)
			{
				break;
			}
			else
			{
				int temp = heap.get(minIndex);
				heap.set(minIndex, heap.get(indi));
				heap.set(indi, temp);
				indi = minIndex;
				lchildIndex = ((2*indi) + 1);
				rchildIndex = ((2*indi) + 2);
			}
		}
		
		return index;
		
	}
	
	public static void main(String args[]) 
	{
		Priority_Queue obj = new Priority_Queue();
		obj.insert(4);
		obj.insert(5);
		obj.insert(8);
		obj.insert(11);
		obj.insert(20);
		obj.insert(10);
		obj.insert(28);
		
		try {
			System.out.println(obj.getMin());
			System.out.println(obj.size());
			System.out.println(obj.removeMin());
			System.out.println(obj.removeMin());
			System.out.println(obj.removeMin());
			System.out.println(obj.removeMin());
			System.out.println(obj.removeMin());
			System.out.println(obj.removeMin());
			System.out.println(obj.removeMin());
			System.out.println(obj.size());
			System.out.println(obj.getMin());

		} catch (PriorityQueueException e) {

		}
	}
	
	

}
