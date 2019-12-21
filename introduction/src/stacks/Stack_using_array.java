package stacks;

public class Stack_using_array {
	
   private int data[]; 
   private int top;
   
   public Stack_using_array()
   {
	   data = new int[10];
	   top = -1;
   }
   
   public Stack_using_array(int capacity)
   {
	  data = new int[capacity];
	  top=-1;
   }
   
   public boolean isempty()
   {
	   if(top==-1)
		   return true;
	   else
		   return false;
   }
   
   public int size()
   {
	   return top+1;
   }
   
   public void push(int elem) throws Stackfullexception
   {
	   if(size()==data.length)
	   {
		   Stackfullexception e = new Stackfullexception();
		   throw e;
	   }
	   
	   top++;
	   data[top]=elem;
   }
   
   public int pop() throws Stackemptyexception
   {
	   if(size()==0)
	   {
		   Stackemptyexception  e = new Stackemptyexception();
		   throw e;
	   }
	   
	   int temp = top;
	   top--;
	   return temp;
   }
   
}
