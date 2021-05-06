package matrix_450;
import java.util.*;

public class medianInSortedRow {
	
	static int binaryMedian(int m[][],int r, int c)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
          
        for(int i=0; i<r ; i++)
        {
              
            // Finding the minimum element
            if(m[i][0] < min)
                min = m[i][0];
              
            // Finding the maximum element
            if(m[i][c-1] > max)
                max = m[i][c-1];
        }
          
        int desired = (r * c + 1) / 2; //desired median element
        while(min < max)
        {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;
              
            // Find count of elements smaller than mid
            for(int i = 0; i < r; ++i)
            {
                  
                get = Arrays.binarySearch(m[i],mid);
                
//                System.out.println(get);
                  
                // If element is not found in the array the 
                // binarySearch() method returns 
                // (-(insertion_point) - 1). So once we know 
                // the insertion point we can find elements
                // Smaller than the searched element by the 
                // following calculation
                if(get < 0)
                    get = Math.abs(get) - 1;
                  
                // If element is found in the array it returns 
                // the index(any index in case of duplicate). So we go to last
                // index of element which will give  the number of 
                // elements smaller than the number including 
                // the searched element.
                else
                {
                    while(get < m[i].length && m[i][get] == mid)
                        get += 1;
                    
                    System.out.println(get);
                }
                  
                place = place + get;
            }
              
            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 3, c = 3;
        int m[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
          
        System.out.println("Median is " + binaryMedian(m, r, c));

	}

}
