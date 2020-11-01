package binaryTree;

public class BinarySearchTree {
	
	private BinaryTreeNode<Integer> root;
	
	public static BinaryTreeNode<Integer> insertInBST(BinaryTreeNode<Integer> root , int data)
	{
		if(root == null)
		{
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		
		if(root.data > data)
		{
			root.left = insertInBST(root.left, data);
		}
		else
		{
			root.right = insertInBST(root.right, data);
		}
		return root;
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
	
	
	public static void main(String[] args) {
		
		
	}

}
