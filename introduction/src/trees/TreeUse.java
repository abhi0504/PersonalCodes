package trees;
import java.util.*;

import queue.QueueUsingLL;
import queue.queue_empty_exception;
public class TreeUse {
	
	public static TreeNode<Integer> takeinput(Scanner s)
	{
		int n;
		System.out.println("Enter the node data");
		n=s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter total no. of children for" + n);
		int childcount = s.nextInt();
		for(int i=0 ; i<childcount;i++)
		{
			TreeNode<Integer> child = takeinput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root)
	{
		String s = root.data + ":";
		for(int i=0;i<root.children.size();i++)
		{
			s = s + root.children.get(i).data + "," ;
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++)
		{
			print(root.children.get(i));
		}
	}
	
	public static TreeNode<Integer> takeInputLevelWise()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootdata = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingnodes = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootdata);
		pendingnodes.enqueue(root);
		while(!pendingnodes.isempty())
		{
			try 
			{
				TreeNode<Integer> frontnode = pendingnodes.dequeue();
				System.out.println("Enter total no. of child of " + frontnode.data );
				int numchild=s.nextInt();
				for(int i=0;i<numchild;i++)
				{
				   System.out.println("Enter the " + (i+1) + "th child of" + frontnode.data);	
				   int child = s.nextInt();
				   TreeNode<Integer> childnode = new TreeNode<Integer>(child);
				   frontnode.children.add(childnode);
				   pendingnodes.enqueue(childnode);
				}
			} 
			catch (queue_empty_exception e) 
			{
				return null;
			}
		}
		return root;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
		
		
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(9);
//		TreeNode<Integer> node4 = new TreeNode<>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
		
	}

}
