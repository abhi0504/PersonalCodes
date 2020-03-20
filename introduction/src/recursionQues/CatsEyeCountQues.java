package recursionQues;

public class CatsEyeCountQues {
	
	public static int catsCount(int num)
	{
		
		if(num == 0)
			return 0;
		else {
			return 2 + catsCount(num - 1); 
	 	     }
		

	}
	
	public static void  main (String[] args) {
		
		System.out.println(catsCount(5));
		
	}
}
