package hackerRank;
import java.util.*;
public class Ques5 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int k=0;
			int t = sc.nextInt();
			while(k<t)
			{
				int SH = sc.nextInt();
				int SM = sc.nextInt();
				int EH = sc.nextInt();
				int EM = sc.nextInt();
				int TT;
				int TS = SH*60 + SM;
				int TE = EH*60 + EM;
				TT = TE - TS;
				int TTH = TT/60;
				int TTM = TT%60;
				System.out.println(TTH +" "+TTM);
				k++;
			}
			sc.close();
	}

}
