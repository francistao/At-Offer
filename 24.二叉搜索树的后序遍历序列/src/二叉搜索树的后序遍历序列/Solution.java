package 二叉搜索树的后序遍历序列;

import java.util.Arrays;

public class Solution {

	public boolean VerifySquenceOfBST(int[] sequence) {
		int length = sequence.length;
		if(sequence == null || length <= 0){
			return false;
		}
		int root = sequence[length - 1];
		//再二叉搜索树中左子树的结点小于根结点
		int i = 0;
		for(; i < length-1; i++){
			if(sequence[i] > root){
				break;
			}
		}
		//在二叉搜索树中右子树的结点大于根结点
		int j = i;
		for (; j < length - 1; j++) {
			if(sequence[j] < root){
				return false;
			}
		}
		
		//判断左子树是不是二叉搜索树
		boolean left = true;
		if(i > 0){
			left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		}
		
		//判断右子树是不是二叉搜索树
		boolean right = true;
		if(i < length - 1){
			right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, length - 1));
		}
		return (left && right);
	}
}
