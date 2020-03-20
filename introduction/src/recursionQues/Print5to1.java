package recursionQues;

public class Print5to1 {
	
	public static void printFunc(int num)
	{
		if(num == 0)
			return ;
		else
			System.out.println(num);
	 	    printFunc(num - 1);
	}
	
	public static void  main (String[] args) {
		
		printFunc(5);
		
	}

}
