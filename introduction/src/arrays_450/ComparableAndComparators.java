package arrays_450;

import java.util.*;

class ComparableAndComparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{9,6} , {8,6} , {1,3} , {6,5}};
		
		Arrays.sort(arr ,(m1,m2) -> {
				return m1[0] - m2[0];
		    });
		
		System.out.print(arr[0][0]);		System.out.print(arr[0][1]);
		System.out.println();
		System.out.print(arr[1][0]);		System.out.print(arr[1][1]);
		System.out.println();
		System.out.print(arr[2][0]);		System.out.print(arr[2][1]);
		System.out.println();
		System.out.print(arr[3][0]);		System.out.print(arr[3][1]);

	}

}
