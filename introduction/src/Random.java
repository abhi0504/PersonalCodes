import java.util.Scanner;

public class Random {

    static void combinationUtil(int arr[], int data[], int start, 
                                int end, int index, int r) 
    { 
        if (index == r) 
        { 
            for (int j=0; j<r; j++) 
                System.out.print(data[j]+" "); 
            System.out.println(""); 
            return; 
        } 
  
        for (int i=start; i<=end && end-i+1 >= r-index; i++) 
        { 
            data[index] = arr[i]; 
            combinationUtil(arr, data, i+1, end, index+1, r); 
        } 
    } 
  
    static void printCombination(int arr[], int n, int r) 
    { 
        // A temporary array to store all combination one by one 
        int data[]=new int[r]; 
  
        // Print all combination using temprary array 'data[]' 
        combinationUtil(arr, data, 0, n-1, 0, r); 
    } 
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int r = 9; 
        int n = arr.length; 
        printCombination(arr, n, r); 
//		System.out.println("All good here");
//
//		float a = 1;
//		float b = 2;
//		float c = 3;
//		float d = 4;
//		float e = 5;
//		float f = 6;
//		float g = 7;
//		float h = 8;
//		float i = 9;
//		
//		System.out.println("All good here");
//		
//		arr[0] = a ;
//		arr[1] = b ;
//		arr[2] = c ;
//		arr[3] = d ;
//		arr[4] = e ;
//		arr[5] = f ;
//		arr[6] = g ;
//		arr[7] = h ;
//		arr[8] = i ;
//				
//		System.out.println("All good here");
//
//		
//		while(res == false)
//		{
//			if((a*10 + b)*c == (d*10 + e))
//			{
//				if(((d*10 + e) + (f*10 + g)) == h*10 + i)
//				{
//					System.out.println("All good here");
//					res = true;
//				}
//
//			}
//			
//		}
		
	}

}
