package reva.careercup.solutions;

import reva.java.practice.TreeNode;

public class Max_sum{
	int sum_left;
	int sum_right;
	static int max_sum;
	public Max_sum() {
		sum_left =0;
		sum_right= 0;
	}
	

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(8);
		root.leftchild = new TreeNode(4);
		root.rightchild = new TreeNode(10);
		root.leftchild.leftchild = new TreeNode(7);
		root.leftchild.rightchild = new TreeNode(5);
		root.rightchild.leftchild = new TreeNode(9);
	
		Max_sum  m = new Max_sum();
		
		System.out.println(m.findMaxSum(root,0));
		findMaxSum1(root, 0);
		System.out.print(max_sum);
	}
	public static void findMaxSum1(TreeNode node, int sum)
    {
        if(node == null)
            return;
        else
        {
            sum = sum + (int)node.value;
            
        findMaxSum1(node.leftchild,sum);
        findMaxSum1(node.rightchild,sum);
        
        if(sum>max_sum)
            max_sum = sum;   
    }
    }

	public int findMaxSum(TreeNode node, int sum)
	{
		if(node == null)
			return 0;
		else
		{
			sum = sum+ (int)node.value;
			return((int)node.value+Math.max(findMaxSum(node.leftchild, sum),findMaxSum(node.rightchild, sum)));
			
		}
	}
}