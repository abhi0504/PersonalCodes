import java.util.Scanner;
public class question {
	
	// merge arrays : intArray[start...mid] and intArray[mid+1...end]
    public static void merge(int[] intArray, int[] temp, int start, int mid, int end)
    {
        int k = start, i = start, j = mid + 1;
 
        // traverse through elements of left and right arrays
        while (i &lt;= mid &amp;&amp; j &lt;= end) {
            if (intArray[i] &lt; intArray[j]) {
                temp[k++] = intArray[i++];
            } else {
                temp[k++] = intArray[j++];
            }
        }
 
        // Copy remaining elements
        while (i &lt;= mid) {
            temp[k++] = intArray[i++];
        }
 
        // copy temp array back to the original array to reflect sorted order
        for (i = start; i &lt;= end; i++) {
            intArray[i] = temp[i];
        }
    }
// sorting intArray[low...high] using iterative approach
    public static void mergeSort(int[] intArray)
    {
        int low = 0;
        int high = intArray.length - 1;
 
        // sort array intArray[] using temporary array temp
        int[] temp = Arrays.copyOf(intArray, intArray.length);
 
        // divide the array into blocks of size m
        // m = [1, 2, 4, 8, 16...]
        for (int m = 1; m &lt;= high - low; m = 2*m)
        {
            for (int i = low; i &lt; high; i += 2*m)
            {
                int start = i;
                int mid = i + m - 1;
                int end = Integer.min(i + 2 * m - 1, high);
                //call merge routine to merge the arrays
                merge(intArray, temp, start, mid, end);
            }
        }
    }

	    public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner(System.in);
	    	int price1,price2;
	    	int t = sc.nextInt();
	    	for(int k=0;k<t;k++)
	        {
	        int net_sum1 = 0;
	        int net_sum2 = 0;
	        price1 = sc.nextInt();
	        int sum1 = 0, sum2 = 0;
	        int sum3 = 0, sum4 = 0;
	        price2 = sc.nextInt();
	        int mem = sc.nextInt();
	        for(int i=0;i<mem;i++)
	        {
	            for(int j=0;j<1;j++)
	            {
	                int a = sc.nextInt();
	                int b = sc.nextInt();
	                sum1 += price1*a;
	                sum2 += price2*b;
	                net_sum1=sum1+sum2;
	                sum3 += price2*a;
	                sum4 += price1*b;
	                net_sum2=sum3+sum4;
	            }
	        }
	        if(net_sum1<net_sum2)
	        {
	        	System.out.println(net_sum1);
	        }
	        else
	        {
	        	System.out.println(net_sum2);
	        }
	    }
	}
}

