public class minStepsTo1 {
	
	public static int minStepFunc(int n)
	{
		if(n == 1)
		{
			return 0;
		}
		
		int opt1 = minStepFunc(n-1);
		int minSteps = opt1;
		
		if(n%3==0)
		{
			int opt2 = minStepFunc(n/3);
			if(opt2 < minSteps)
			{
				minSteps = opt2;
			}
		}
		
		if(n%2==0)
		{
			int opt3 = minStepFunc(n/2);
			if(opt3 < minSteps)
			{
				minSteps = opt3;
			}
		}
		
		return minSteps + 1;
	}
	
	public static int minStepFuncM(int n , int[] storage)
	{
		if(n==1)
		{
			storage[n] = 0;
			return storage[n];
		}
		
		if(storage[n] != 0)
		{
			return storage[n];
		}
		
		int opt1 = minStepFuncM(n-1 , storage);
		int minSteps = opt1;
		
		if(n%3==0)
		{
			int opt2 = minStepFuncM(n/3 , storage);
			if(opt2 < minSteps)
			{
				minSteps = opt2;
			}
		}
		
		if(n%2==0)
		{
			int opt3 = minStepFuncM(n/2 , storage);
			if(opt3 < minSteps)
			{
				minSteps = opt3;
			}
		}
		
		storage[n] = minSteps + 1;
		
		return storage[n];
	}
	
	public static int minStepFuncDP(int n)
	{
		int[] storage = new int[n+1];
		storage[1] = 0;
		
		for(int i = 2 ; i <= n ; i++)
		{
			int min = storage[i-1];
			
			if(i%3 == 0)
			{
				if(min>storage[i/3])
				{
					min = storage[i/3];
				}
			}
			
			if(i%2 == 0)
			{
				if(min>storage[i/2])
				{
					min = storage[i/2];
				}
			}
			
			storage[i] = min + 1;
		}
		return storage[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 999; 
		int[] arr = new int[n+1];
		System.out.println(minStepFuncDP(n));
		System.out.println(minStepFuncM(n , arr));
		System.out.println(minStepFunc(n));

	}

}
