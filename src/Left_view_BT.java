package reva.careercup.solutions;

import reva.java.practice.TreeNode;

public class Left_view_BT {
	static int max_level=-1;

	
	
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(8);
		root.leftchild = new TreeNode(4);
		root.rightchild = new TreeNode(10);
		root.leftchild.leftchild = new TreeNode(2);
		root.leftchild.rightchild = new TreeNode(5);
		root.rightchild.leftchild = new TreeNode(9);
		root.rightchild.rightchild = new TreeNode(11);
		print_left_view(root, 0);
		
	}

	public static void print_left_view(TreeNode node,int level){
		if(node==null)
			return;

		else{
			if(level> max_level)
			{
				max_level = level;
				System.out.print(node.value+"->");
			}

			
			
			print_left_view(node.leftchild,level+1);
			print_left_view(node.rightchild,level+1);

		}


	}

}
