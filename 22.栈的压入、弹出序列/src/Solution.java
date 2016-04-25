import java.util.Stack;

public class Solution {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if(pushA.length == 0 || popA.length == 0){
			return false;
		}
		
		
		Stack<Integer> stack = new Stack<Integer>();
		int j = 0;
		for (int i = 0; i < popA.length; i++) {
			stack.push(pushA[i]);
			/**
			 * peek()方法 查看栈顶对象而不移除它
			 */
			while (j < popA.length && stack.peek() == popA[j]) {
				stack.pop();
				j++;
			}
		}
		return stack.empty() == true;
	}

}
