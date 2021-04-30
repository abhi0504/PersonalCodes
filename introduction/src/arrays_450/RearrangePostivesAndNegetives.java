package arrays_450;
import java.util.*;

public class RearrangePostivesAndNegetives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
				
		int[] arr = {1,-1,1,-1,1,1,-1};
		
		int i = 0;
		int j = arr.length-1;

		while(i < j)
		{
			switch (arr[i]) {
			case 1:
				int temp = 0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[i];
				j--;
				break;

			case -1:
				i++;
				break;
			}
		}

	}

}
