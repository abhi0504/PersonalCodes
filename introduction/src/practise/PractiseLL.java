package practise;
import java.util.*;
public class PractiseLL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        //Scanner
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(n-->0)
        {
        	int data = s.nextInt();
        	list.add(data);
        	System.out.println(list.element());
        }

	}

}
