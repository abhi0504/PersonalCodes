package trees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class TreeUse {
	
	public static boolean check = false;
	
	public static TreeNode<Integer> takeinput()
	{
		Scanner s = new Scanner(System.in);
		int n ;
		System.out.println("Enter the data of node");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter the no. of children for " + n);
		int childCount = s.nextInt();
		for(int i = 0 ; i<childCount ; i++)
		{
			TreeNode<Integer> child = takeinput();
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root)
	{
		String s = root.data + ":";
		for(int i = 0; i<root.children.size() ; i++)
		{
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for(int i = 0 ; i<root.children.size() ; i++)
		{
			print(root.children.get(i));
		}
	}

	public static TreeNode<Integer> takeinputLevelwise(Scanner s)
	{
		System.out.println("Enter the root of TREE");
		int rootdata = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootdata);
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode<Integer> ele = queue.remove();
			System.out.println("Enter the no. of chlidrens of " + ele.data);
			int totalchild = s.nextInt();
			for(int i = 0 ; i<totalchild ; i++)
			{
				System.out.println("Enter the " + (i+1) + "th child of " + ele.data );
				int childdata = s.nextInt();
				TreeNode<Integer> children = new TreeNode<Integer>(childdata);
				ele.children.add(children);
				queue.add(children);
			}
		}
		return root;
	}

	public static void printLevelwise(TreeNode<Integer> root)
	{
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode<Integer> child = queue.remove();
			System.out.println();
			System.out.print(child.data + ":");
			for(int i = 0 ; i<child.children.size() ; i++)
			{
				System.out.print(child.children.get(i).data + ",");
				queue.add(child.children.get(i));
			}
		}
	}
	
	public static int numNodes(TreeNode<Integer> root)
	{
		int count = 1;
		for(int i = 0 ; i<root.children.size() ; i++)
		{
			count += numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static int largestdata(TreeNode<Integer> root)
	{
		int ans = root.data;
		for(int i = 0 ; i<root.children.size() ; i++)
		{
			int num = largestdata(root.children.get(i));
			if(num>ans)
			{
				ans=num;
			}
		}
		return ans;
	}
	
	public static int largerthanx(TreeNode<Integer> root , int g)
	{
		int count = 0;
		if(root.data > g)
		{
			count++;
		}
		for(int i = 0; i<root.children.size() ; i++)
		{
			int ans = largerthanx(root.children.get(i) , g);
			count += ans;
			
		}
		return count;
	}

	public static int heightoftree(TreeNode<Integer> root)
	{
		int h1 = 1;
		if(root.children.size() == 0)
		{
			return h1;
		}
		for(int i = 0 ; i<root.children.size() ; i++ )
		{
			 h1 = Math.max(h1 , heightoftree(root.children.get(i)) );
		}
		return (h1 + 1);
	}
	
	public static void printAtk(TreeNode<Integer> root , int k)
	{
		if(k<0)
		{
			return;
		}
		if(k==0)
		{
			System.out.println(root.data);
			return;
		}
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			printAtk(root.children.get(i), k-1);
		}
		
	}
	
	public static int countLeafs(TreeNode<Integer> root)
	{
		int leaf = 0;
		if(root.children.size() == 0)
		{
			leaf++;
			return leaf;
		}
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			leaf += countLeafs(root.children.get(i));
		}
		return leaf;
	}
	
	public static void preOrder(TreeNode<Integer> root)
	{
		System.out.println(root.data + " ");
		for(int i = 0 ; i < root.children.size() ; i++ )
		{
			preOrder(root.children.get(i));
		}
	}
	
	public static void postOrder(TreeNode<Integer> root)
	{		
		for(int i = 0 ; i < root.children.size() ; i++ )
		{
			postOrder(root.children.get(i));
		}
		System.out.println(root.data + " ");
	}
	
	public static boolean checkforxthere(TreeNode<Integer> root , int k)
	{
		if(root.data == k)
		{
			return true;
		}
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			boolean ans = checkforxthere(root.children.get(i) , k);
			if(ans)
			{
				return true;
			}
		}
		
		return false;
		
	}
	
	public static int numberoflargernodes(TreeNode<Integer> root , int k)
	{
		int count  = 0;
		if(root.data > k )
		{
			count++;
		}
		
		for(int i = 0 ; i < root.children.size(); i++)
		{
			 count += numberoflargernodes(root.children.get(i), k);
		}
		
		return count;
	}
	
	public static int sumofchildrens(TreeNode<Integer> root)
	{
		int sum = root.data;
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			sum += sumofchildrens(root.children.get(i));
		}
		
		return sum;
	}
	
	public static int nodechildrensummax(TreeNode<Integer> root)
	{
		int ans = 0 , temp = 0;
		for(int i = 0 ; i < root.children.size() ; i++)
		{			 
			if(ans < sumofchildrens(root.children.get(i)))
			{
				ans = sumofchildrens(root.children.get(i));
				temp = root.children.get(i).data;
			}
		}
		return temp;
	}
	
	public static int nextlargernum(TreeNode<Integer> root , int k) 
	{
		int ans = 0;
		if(root.data > k)
		{
			ans = root.data;
			return ans;
		}
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			ans = nextlargernum(root.children.get(i), k);
			if(ans != 0)
			{
				break;
			}
		}
		return ans;
	}
	
	public static TreeNode<Integer> secondlargest(TreeNode<Integer> root , TreeNode<Integer> seclarge , TreeNode<Integer> large )
	{
		if(root.data>large.data)
		{
			seclarge.data = large.data;
			large.data = root.data;
		}
		
		else if(root.data > seclarge.data && root.data != seclarge.data)
		{
			seclarge.data = root.data;
		}
		
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			seclarge = secondlargest(root.children.get(i), seclarge, large);
		}
		
		return seclarge;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner s = new Scanner(System.in);
		TreeNode<Integer> root = takeinputLevelwise(s);
		printLevelwise(root);
		System.out.println();
		System.out.println("Total no. of nodes : " +  numNodes(root));
//		System.out.println("Largest data of nodes : " +  largestdata(root));
//		System.out.println(largerthanx(root, 4));
//		System.out.println("Height of the given Tree : " + heightoftree(root));
//		printAtk(root, 3);
//		System.out.println(countLeafs(root));
//		System.out.println("Pre-Order : ");
//		preOrder(root);
//		System.out.println("Post-Order : ");
//		postOrder(root);
//		System.out.println(checkforxthere(root, 9));
//		System.out.println(numberoflargernodes(root, 4));
//		System.out.println(nodechildrensummax(root));
//		System.out.println(sumofchildrens(root));
//		System.out.println(nextlargernum(root , 5));
		TreeNode<Integer> seclarge = new TreeNode<Integer>(0);
		TreeNode<Integer> large = new TreeNode<Integer>(0);
		seclarge = secondlargest(root, seclarge, large);
		System.out.println(seclarge.data);
	}

}
//1 3 2 3 4 2 5 6 1 8 0 0 1 7 0 1 9 0
