package 二叉树中和为某一值的路径;

import java.util.Stack;

public class Solution {

	public void findPath(BinaryTreeNode root,int sum){
		if(root == null){
			return;
		}
		Stack<Integer> stack = new Stack<>();
		int currentSum = 0;
		findPath(root, sum, stack, currentSum);
	}
	
	private void findPath(BinaryTreeNode root,int sum,Stack<Integer> stack,int currentSum){
		currentSum += root.val;
		stack.push(root.val);
		if(root.left == null && root.right == null){
			if(currentSum == sum){
				System.out.println("找到一个路径");
				for (int path : stack) {
					System.out.println(path + " ");
				}
				System.out.println();
			}
		}
		
		if(root.left != null){
			findPath(root.left, sum, stack, currentSum);
		}
		if(root.right != null){
			findPath(root.right, sum, stack, currentSum);
		}
		stack.pop();
	}
}
