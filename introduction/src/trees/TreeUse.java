package trees;
import java.util.*;

import com.sun.source.tree.Tree;

import queue.QueueUsingLL;
import queue.queue_empty_exception;
public class TreeUse {
	
	public static TreeNode<Integer> takeInputRecursively(Scanner s) {
		System.out.println("Enter node data");
		int n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter the no. of childrens for " + n);
		int childCount = s.nextInt();
		for(int i = 0 ; i < childCount ; i++)
		{
			TreeNode<Integer> child = takeInputRecursively(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInputLevelWise()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isempty())
		{
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter the number of childrens of " + frontNode.data );
				int numChildrens = s.nextInt();
				for(int i = 0 ; i < numChildrens ; i++)
				{
					System.out.println("Enter " + (i+1) + "th children of " + frontNode.data);
					int childData = s.nextInt();
					TreeNode<Integer> child = new TreeNode<Integer>(childData);
					frontNode.children.add(child);
					pendingNodes.enqueue(child);
				}
			} catch (queue_empty_exception e) {
				// TODO Auto-generated catch block
				return null;
			}
			
		}
		return root;
	}
	
	public static void printLevelwise(TreeNode<Integer> root)
	{
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isempty())
		{
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				String s = frontNode.data + ":";
				for(int i = 0 ; i < frontNode.children.size() ; i++)
				{
					s = s + frontNode.children.get(i).data + ",";
					pendingNodes.enqueue(frontNode.children.get(i));
				}
				System.out.println(s);
			} catch (queue_empty_exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void print (TreeNode<Integer> root)
	{
		String s = root.data + ":";
		for(int i = 0 ; i < root.children.size() ; i ++)
		{
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for(int i = 0 ; i < root.children.size() ; i ++)
		{
			print(root.children.get(i));
		}
	}
	
	public static int numNodes(TreeNode<Integer> root)
	{
		int count = 1;
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			count += numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static int SumOfNodes(TreeNode<Integer> root)
	{
		int sum = root.data;
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			sum += SumOfNodes(root.children.get(i));
		}
		return sum;
	}
	
	public static int largestOfNodes(TreeNode<Integer> root)
	{
		int l = root.data;
		for(int i = 0 ; i < root.children.size() ; i++ )
		{
			int temp = largestOfNodes(root.children.get(i));
			if(l<temp)
			{
				l = temp;
			}
		}
		return l;
	}
	
	public static int maxHeight(TreeNode<Integer> root)
	{
		int h = 1;
		if(root.children.size() == 0 )
		{
			return h;
		}
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			h = Math.max(h , maxHeight(root.children.get(i)));
		}
		return h+1;
	}
	
	public static void printAtDepthK(TreeNode<Integer> root , int k)
	{
		if(k<0)
		{
			return;
		}
		if(k == 0)
		{
			System.out.println(root.data);
			return;
		}
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			printAtDepthK(root.children.get(i), k-1);
		}
	}
	
	public static int leafCount(TreeNode<Integer> root)
	{
		int size = 0;
		if(root.children.size() == 0)
		{
			size++;
			return size;
		}
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			size += leafCount(root.children.get(i));
		}
		return size;
	}
	 
	public static int PostOrder(TreeNode<Integer> root)
	{
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			System.out.println(PostOrder(root.children.get(i)));
		}
		return root.data;
	}
	
	public static void PreOrder(TreeNode<Integer> root)
	{
		System.out.print(root.data + " ");
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			PreOrder(root.children.get(i));
		}
		
	}
	
	public static void LevelOrder(TreeNode<Integer> root)
	{
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isempty())
		{
			try {
				TreeNode<Integer> n = pendingNodes.dequeue();
				for(int i = 0 ; i < n.children.size() ; i++)
				{
					pendingNodes.enqueue(n.children.get(i));
				}
				System.out.println(n.data);

			} catch (queue_empty_exception e) {
				// TODO Auto-generated catch block
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		TreeNode<Integer> root = takeInputLevelWise();
		System.out.println(root.data);
		printLevelwise(root);
		System.out.println(numNodes(root));
		System.out.println(SumOfNodes(root));
		System.out.println(largestOfNodes(root));
		System.out.println(maxHeight(root));
		System.out.println("@");
		printAtDepthK(root, 2);
		System.out.println("@@");
		System.out.println(leafCount(root));
		System.out.println("@@@");
		System.out.println(PostOrder(root));
		System.out.println("@@@@");
		PreOrder(root);
		System.out.println();
		System.out.println("@@@@@");
		LevelOrder(root);
		
		
		
	}

}
