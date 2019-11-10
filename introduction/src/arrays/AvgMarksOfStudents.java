package arrays;
import java.util.Scanner;
public class AvgMarksOfStudents {
public static void main(String[] args)
    {
	System.out.println("Enter the total no. of Students");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the marks of students");
	int  sum=0;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	int avgmarks = 0;
	avgmarks=sum/arr.length;
	System.out.println("Average marks of all the marks is");
	System.out.println(avgmarks);
	}
}
