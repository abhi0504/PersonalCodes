package binaryTree;

import java.util.*;

import trees.TreeNode;

public class BinaryTreeNodeUse {
	
	public static void print(BinaryTreeNode<Integer> root) 
	{
		if(root == null)
		{
			return;
		}
		
		String toBePrinted = root.data + ":" ;
		if(root.left != null)
		{
			toBePrinted += "L" + root.left.data + ",";
		}
		if(root.right != null)
		{
			toBePrinted += "R" + root.right.data + ",";
		}
		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);
		
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s)
	{
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if(rootData == -1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputItratively(Scanner s) throws queue_empty_exception 
	{
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isempty())
		{
			BinaryTreeNode<Integer> currNode = pendingNodes.dequeue();
			System.out.println("Enter left child of " + currNode.data);
			int Ldata = s.nextInt();
			System.out.println("Enter right child of " + currNode.data);
			int Rdata = s.nextInt();
			if(Ldata != -1)
			{
				BinaryTreeNode<Integer> Lchild = new BinaryTreeNode<Integer>(Ldata);
				currNode.left = Lchild;
				pendingNodes.enqueue(Lchild);
			}
			if(Rdata != -1)
			{
				BinaryTreeNode<Integer> Rchild = new BinaryTreeNode<Integer>(Rdata);
				currNode.right = Rchild;
				pendingNodes.enqueue(Rchild);
			}
		}
		return root;
	}
	
	public static void printItratively(BinaryTreeNode<Integer> root) 
	{
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		if(root.data != null)
		{
			pendingNodes.enqueue(root);
		}
		while(!pendingNodes.isempty())
		{
			BinaryTreeNode<Integer> currNode = null ;
			try {
				currNode = pendingNodes.dequeue();
			} catch (queue_empty_exception e) {		
				return;			
			}
			String str = currNode.data + ":";
			if(currNode.left != null)
			{
				pendingNodes.enqueue(currNode.left);
				str += "L" + currNode.left.data+ ",";
			}
			if(currNode.right != null)
			{
				pendingNodes.enqueue(currNode.right);
				str += "R" + currNode.right.data + ",";			
			}
			System.out.println(str);
		}
	}
	
	public static int numNodes(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return 0;
		}
		int count = 1 ;
		count += numNodes(root.left);
		count += numNodes(root.right);
		return count;
	}
	
	public static boolean findNode(BinaryTreeNode<Integer> root , int n)
	{
		if(root.data != null)
		{
			if(root.data == n )
			{
				return true;
			}
			
		}
			else
			{
				return false;
			}
		
		
		if(root.left.data != null)
		{
			if(root.left.data == n )
			{
				return true;
			}
		}
			else
			{
				return false;
			}
		
		
		if(root.right.data != null)
		{
			if(root.right.data == n )
			{
				return true;
			}
		}
			else
			{
				return false;
			}
		
		
		boolean L = findNode(root.left, n);
		boolean R = findNode(root.right, n);
		
		if(L || R)
		{
			return true;
		}
		
			return false;
		
	}
	
	public static int heightOfTree(BinaryTreeNode<Integer> root)
	{
		int h = 0;
		
		if(root == null)
		{
			return 0;
		}
		else
		{
			h++;
		}
		
		int lh = heightOfTree(root.left);
		int rh = heightOfTree(root.right);
		
		if(lh>rh)
		{
			h += lh;
		}
		else
		{
			h += rh;
		}
		
		return h;
			
	}
	
	public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return null;
		}
		
		if(root.left != null && root.right !=null)
		{
			BinaryTreeNode<Integer> temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		
		if(root.left == null)
		{
			root.left = root.right;
			root.right = null;
		}
		
		if(root.right == null)
		{
			root.right = root.left;
			root.left = null;
		}
		
		mirror(root.left);
		mirror(root.right);
		
		return root;
	}
	
	public static Pair<Integer , Integer> heightDiameter(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			Pair<Integer , Integer> output = new Pair<Integer, Integer>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		
		Pair<Integer, Integer> lo = heightDiameter(root.left);
		Pair<Integer, Integer> ro = heightDiameter(root.right);
		int height = 1 + Math.max(lo.first, ro.first);
		int option1 = lo.first + ro.first;
		int option2 = lo.second;
		int option3 = ro.second;
		int diameter = Math.max(option1, Math.max(option2, option3));
		Pair<Integer , Integer> output = new Pair<Integer, Integer>();
		output.first = height;
		output.second = diameter;
		return output;
		
	}
	
	public static void inorderPrint(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return ;
		}
		inorderPrint(root.left);
		System.out.println(root.data);
		inorderPrint(root.right);
	}
	
	public static void preOrderPrint(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return ;
		}
		System.out.println(root.data);
		preOrderPrint(root.left);
		preOrderPrint(root.right);
	}
	
	public static void postOrderPrint(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return ;
		}
		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.println(root.data);
	}
	
	public static BinaryTreeNode<Integer> TreeBuilder(int ino[] , int preo[] , int inoS , int inoE , int preoS , int preoE)
	{
		if(inoS>inoE)
		{
			return null;
		}
		
		int rootData = preo[preoS];
		int rootIndex = -1;
		for(int i = inoS ; i <= inoE ; i++)
		{
			if(ino[i] == rootData)
			{
				rootIndex = i;
				break;
			}
		}
		
		if(rootIndex ==-1)
		{
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int leftinoS = inoS;
		int leftinoE = rootIndex - 1;
		int leftpreoS = preoS + 1;
		int leftpreoE = leftpreoS + leftinoE - leftinoS;
		int rightinoS = rootIndex + 1;
		int rightinoE = inoE;
		int rightpreoE = preoE;
		int rightpreoS = leftpreoE + 1 ;
	
		root.right = TreeBuilder(ino, preo, rightinoS, rightinoE, rightpreoS, rightpreoE);
		root.left = TreeBuilder(ino, preo, leftinoS, leftinoE, leftpreoS, leftpreoE);
		
		return root;
		
	}
	
	public static int sumofBT(BinaryTreeNode<Integer> root)
	{
		int sum = 0;
		if(root == null)
		{
			return 0;
		}
		int leftsum = sumofBT(root.left);
		int rightsum = sumofBT(root.right);
		
		sum = leftsum + rightsum + root.data;
		return sum;
	}
	
	public static void levelOrderPrint(BinaryTreeNode<Integer> root)
	{
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isempty())
		{
			try {
				BinaryTreeNode<Integer> child = pendingNodes.dequeue();
				System.out.print(child.data + " ");
				if(child.left != null)
				{
					pendingNodes.enqueue(child.left);
				}
				if(child.right != null)
				{
					pendingNodes.enqueue(child.right);
				}
			} catch (queue_empty_exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static BinaryTreeNode<Integer> BSTsearchFunc(BinaryTreeNode<Integer> root , int k)
	{
		if(root==null)
		{
			return root;
		}
		if(root.data == k)
		{
			return root;
		}
				
		if(k>root.data)
		{
			return BSTsearchFunc(root.right, k);
		}
		
		return BSTsearchFunc(root.left, k);

	}
	
	public static int maximum(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.data , Math.max(maximum(root.left), maximum(root.right)));
	}
	
	public static int minimum(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return Integer.MAX_VALUE;
		}
		
		return Math.min(root.data , Math.min(minimum(root.left), minimum(root.right)));
	}
	
	
	public static boolean isBST1(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return true;
		}
		
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		
		if(root.data<=leftMax)
		{
			return false;
		}
		
		if(root.data>=rightMin)
		{
			return false;
		}		
		
		boolean lcheck = isBST1(root.left);
		boolean rcheck = isBST1(root.right);
		
		if(lcheck && rcheck)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer,Integer>>();
			output.first = true;
			output.second = new Pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		
		Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST2(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST2(root.right);
		
		int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
		
		boolean isBST = root.data > leftOutput.second.second && root.data <= rightOutput.second.first &&
				leftOutput.first && rightOutput.first;
		
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer,Integer>>();
		output.first = isBST;
		output.second = new Pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
		
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root , int min , int max)
	{
		if(root == null)
		{
			return true;
		}
		if(root.data < min || root.data > max)
		{
			return false;
		}
		boolean isLeftok = isBST3(root.left, min, root.data-1);
		boolean isRightok = isBST3(root.right, root.data, max);
		
		return isLeftok && isRightok ;
		
	}
	
	public static Node<Integer> BSTtosortedLL(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return null;
		}
		
		Node<Integer> node = new Node<Integer>(root.data);
		Node<Integer> leftNode = BSTtosortedLL(root.left);
		Node<Integer> rightNode = BSTtosortedLL(root.right);
		Node<Integer> temp = null; 
		
		if(leftNode != null)
		{
			temp = leftNode;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = node;
			node.next = rightNode;
			return leftNode;
		}
		else
		{
			if(rightNode != null)
			{
				node.next = rightNode;
				return node;
				
			}
			else
			{
				return node;
			}
			
		}
	}
	
	public static ArrayList<Integer> pathToBT(BinaryTreeNode<Integer> root , int data)
	{
		if(root==null)
		{
			return null;
		}
		
		if(root.data == data)
		{
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		} 
		
		ArrayList<Integer> leftArrayList = pathToBT(root.left, data);
		ArrayList<Integer> rightArrayList = pathToBT(root.right, data);
		
		if(leftArrayList != null)
		{
			leftArrayList.add(root.data);
			return leftArrayList;
		}
		else if(rightArrayList != null)
		{
			rightArrayList.add(root.data);
			return rightArrayList;
		}
		else
		{
			return null;
		}
	}
	
	
	public static void main(String[] args) throws queue_empty_exception 
	{
		Scanner s = new Scanner(System.in);
//		BinaryTreeNode<Integer> root = takeInputItratively(s);
//		printItratively(root);
//		System.out.println(numNodes(root));
////		System.out.println(findNode(root, 3));
//		System.out.println(heightOfTree(root));
//		root = mirror(root);
//		printItratively(root);
//		System.out.println("****");
//		System.out.println(heightDiameter(root).second);
//		inorderPrint(root);
//		preOrderPrint(root);
//		postOrderPrint(root);
//		int[] ino = { 4,2,5,1,6,3,7 } ;
//		int[] preo = { 1,2,4,5,3,6,7 } ;
//		BinaryTreeNode<Integer> root1 = TreeBuilder(ino, preo, 0, ino.length - 1, 0, preo.length - 1);
//		printItratively(root1);
//		System.out.println(sumofBT(root1));
//		levelOrderPrint(root1);
		System.out.println("Give input for BST");
		BinaryTreeNode<Integer> BSTroot = takeInputItratively(s);
		printItratively(BSTroot);
		System.out.println("********");
//		System.out.println(BSTsearchFunc(BSTroot, 10).data);
		System.out.println(isBST1(BSTroot));
		System.out.println(isBST2(BSTroot).first);
		System.out.println(isBST3(BSTroot , -5555 , 999999));
		Node<Integer> head = BSTtosortedLL(BSTroot);
//		while(head.next.data != null)
//		{
//			System.out.print(head.data + " ");
//			head=head.next;
//		}
	}
	
}

//10 9 4 -1 -1 5 8 -1 6 -1 -1 3 -1 -1 -1
//BST : 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1

