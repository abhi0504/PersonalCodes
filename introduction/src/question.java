import java.util.Arrays;
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
        for (int m = 1; m &lt = high - low; m = 2*m)
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
    
    private static void printResult(int key, int pos, 
            SC sC) 
{ 
System.out.println("" + key + ", " + sC + ":" + pos); 
} 

enum SC { 
EQUAL, 
EQUAL_OR_BIGGER, 
EQUAL_OR_SMALLER 
}; 

public static int searchEqualOrClose(int key, int[] arr, SC sC) 
{ 
if (arr == null || arr.length == 0) { 
return -1; 
} 

if (arr.length == 1) { // just eliminate case of length==1 

// since algorithm needs min array size==2 
// to start final evaluations 
if (arr[0] == key) { 
return 0; 
} 
if (arr[0] < key && sC == SC.EQUAL_OR_SMALLER) { 
return 0; 
} 
if (arr[0] > key && sC == SC.EQUAL_OR_BIGGER) { 
return 0; 
} 
return -1; 
} 
return searchEqualOrClose(arr, key, 0, arr.length - 1, sC); 
} 

private static int searchEqualOrClose(int[] arr, int key, 
                  int start, int end, SC sC) 
{ 
int midPos = (start + end) / 2; 
int midVal = arr[midPos]; 
if (midVal == key) { 
return midPos; // equal is top priority 
} 

if (start >= end - 1) { 
if (arr[end] == key) { 
return end; 
} 
if (sC == SC.EQUAL_OR_SMALLER) { 

// find biggest of smaller element 
if (arr[start] > key && start != 0) { 

// even before if "start" is not a first 
return start - 1; 
} 
if (arr[end] < key) { 
return end; 
} 
if (arr[start] < key) { 
return start; 
} 
return -1; 
} 
if (sC == SC.EQUAL_OR_BIGGER) { 

// find smallest of bigger element 
if (arr[end] < key && end != arr.length - 1) { 

// even after if "end" is not a last 
return end + 1; 
} 
if (arr[start] > key) { 
return start; 
} 
if (arr[end] > key) { 
return end; 
} 
return -1; 
} 
return -1; 
} 
if (midVal > key) { 
return searchEqualOrClose(arr, key, start, midPos - 1, sC); 
} 
return searchEqualOrClose(arr, key, midPos + 1, end, sC); 
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

