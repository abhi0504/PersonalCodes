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
	
	
	public static void main(String[] args) {
		
		
	}

}
