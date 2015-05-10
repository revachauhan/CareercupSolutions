package reva.careercup.solutions;

import java.util.Stack;

import reva.java.practice.TreeNode;

public class MaxSumPath {

	static Stack<TreeNode> curr = new Stack<>();
	static Stack<TreeNode> maxpath = new Stack<>();
	static int maxsum;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.leftchild = new TreeNode(4);
		root.rightchild = new TreeNode(10);
		root.rightchild.rightchild  = new TreeNode(11);
		root.leftchild.leftchild = new TreeNode(7);
		root.leftchild.rightchild = new TreeNode(5);
		root.rightchild.leftchild = new TreeNode(9);
		printPath(root, 0);
		while(!maxpath.isEmpty())
			System.out.println(maxpath.pop().value);
	}


	public static void printPath(TreeNode node,int sum)
	{
		curr.push(node);
		sum = sum +(int)node.value;
		if(node.leftchild==null && node.rightchild==null)
		{
			if(sum > maxsum)
			{
				maxsum = sum;
				maxpath = (Stack<TreeNode>) curr.clone();
				
			}

		}
		if(node.leftchild!=null)
			printPath(node.leftchild, sum);
		if(node.rightchild!=null)
			printPath(node.rightchild, sum);
		curr.pop();

	}


}
