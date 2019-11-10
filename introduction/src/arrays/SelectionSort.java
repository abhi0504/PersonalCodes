package arrays;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
				Scanner Kb=new Scanner(System.in);
				String s=Kb.next();

					for(int i=0;i<s.length();i++)
					{

						if(Character.isLowerCase(s.charAt(i)))
						{
							s.charAt(i)=s.toUpperCase(i);
						}
						else if(Character.isUpperCase(s.charAt(i)))
						{
							s.charAt(i)=s.toLowerCase(i);
						}
					
					System.out.println(s.charAt(i));
				}
			}
		}
        


