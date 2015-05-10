package reva.careercup.solutions;

import reva.java.practice.TreeNode;

//Check of all the leaves are at the same level in the tree
public class Same_level {

	static int maxdepth  = -1;

	public static void main(String[] args) {

		TreeNode root = new TreeNode(10);
		root.leftchild = new TreeNode(12);
		root.rightchild = new TreeNode(15);
		root.leftchild.leftchild = new TreeNode(25);
		root.leftchild.leftchild.leftchild = new TreeNode(28);
		root.leftchild.rightchild = new TreeNode(30);
		root.leftchild.rightchild.rightchild = new TreeNode(31);
		root.rightchild.leftchild = new TreeNode(36);
		root.rightchild.leftchild.rightchild = new TreeNode(37);
		root.rightchild.leftchild.rightchild.rightchild = new TreeNode(38);
		System.out.println(_sameLevel(root, 0));
		//System.out.println(atSamelevel(root, 0, -1));

	}


	public  static boolean _sameLevel(TreeNode node, int level)
	{
		if(node == null)
			return true;

		else if(node.leftchild==null &&node.rightchild==null)
		{	
			if(maxdepth==-1)
				maxdepth = level;

			return (maxdepth==level);
		}


		else
		{

			return(_sameLevel(node.leftchild, level+1)&&_sameLevel(node.rightchild, level+1));

		}

		

	}

	/*public static boolean atSamelevel(TreeNode node,int level,int max_level)
	{
		if(node== null)
			return true;
		else if(node.leftchild== null && node.rightchild== null)
		{ 
			if(max_level==-1)
				max_level = level;
			return(max_level==level);
		}

		{	
			level = level+1;
		return(atSamelevel(node.leftchild,level,max_level)&&atSamelevel(node.rightchild,level,max_level));


		}

	}*/



}
