package 树的子结构;

public class Solution {

	/**
	 * 通过递归的方式遍历A
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if(root1 != null && root2 != null){
			if(root1.val == root2.val){
				result = doesTree1HaveTree2(root1, root2);
			}
			if(!result)
				result = doesTree1HaveTree2(root1.left, root2);
			if(!result)
				result = doesTree1HaveTree2(root1.right, root2);
		}
		return result;
	}
	
	/**
	 * 查找B是不是A的子结构
	 * @param root1
	 * @param root2
	 * @return
	 */
	private boolean doesTree1HaveTree2(TreeNode root1,TreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val != root2.val)
			return false;
		return doesTree1HaveTree2(root1.left, root2.left) &&
				doesTree1HaveTree2(root1.right, root2.right);
	}
}
