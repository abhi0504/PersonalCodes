import java.util.*;
public class rate {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		float si = 0 , p = 0 , r = 0 , t = 0 , ta = 0;
		p = s.nextFloat();		
		ta = s.nextFloat();
		t = s.nextFloat();
//		si = s.nextFloat();
		
		r = ((100*(ta - p))/(p*t));
		
		System.out.println(r);
		
	}
}
