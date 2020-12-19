package binaryTree;

public class BinarySearchTree {
	
	private  BinaryTreeNode<Integer> root;
	
	private  boolean searchInBSTHelper(int data , BinaryTreeNode<Integer> root )
	{
		if(root == null)
		{
			return false;
		}
		
		
		if(root.data == data)
		{
			return true ;
		}
		
		else
		{
			if(data > root.data)
			{
				return searchInBSTHelper(data, root.right);
			}
			else if(data<root.data)
			{
				return searchInBSTHelper(data, root.left);
			}
			else
			{
				return false;
			}
		}
	}
	
	public  boolean searchInBST(int data)
	{
		return searchInBSTHelper(data, root);
	}
	
	public static BinaryTreeNode<Integer> insertInBSTHelper(BinaryTreeNode<Integer> root , int data)
	{
		if(root == null)
		{
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		
		if(root.data > data)
		{
			root.left = insertInBSTHelper(root.left, data);
		}
		else
		{
			root.right = insertInBSTHelper(root.right, data);
		}
		return root;
	}
	
	public void insertInBST(int data)
	{
		root = insertInBSTHelper(root, data);
	}
	
	public static BinaryTreeNode<Integer> deleteInBST(BinaryTreeNode<Integer> root , int data)
	{
		if(root == null)
		{
			return null;
		}
		
		if(root.data>data)
		{
			root.right = deleteInBST(root.right, data);
			return root;
		}
		else if(root.data < data)
		{
			root.left = deleteInBST(root.left, data);
			return root;
		}
		else
		{
			BinaryTreeNode<Integer> minNode = root.right;
			while(minNode.left != null)
			{
				minNode = minNode.left;
			}
			root.data = minNode.data;
			root.right = deleteInBST(root.right, minNode.data);
		}
		return root;
	}
	
	public static void main(String []args) 
	{
		BinarySearchTree root = new BinarySearchTree();
		root.insertInBST(2);
		System.out.println("HEHEHEHE");
		System.out.println(root.searchInBST(2));
	}
}
