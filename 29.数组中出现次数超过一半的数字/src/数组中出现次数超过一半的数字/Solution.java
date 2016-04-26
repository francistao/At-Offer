package 数组中出现次数超过一半的数字;


public class Solution {
	public int MoreThanHalfNum_Solution(int[] array){
		if(array == null){
			return 0;
		}
		int result = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(count == 0){
				result = array[i];
				count = 1;
			}else if(array[i] == result){
				count++;
			}else {
				count--;
			}
		}
			if(checkMoreThanHalf(array, result))
				return result;
			else{
				return 0;
			}
	}
	/**
	 * 判断是否超过一半
	 * @param array
	 * @param number
	 * @return
	 */
	private boolean checkMoreThanHalf(int[] array,int number){
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == number){
				times++;
			}
		}
			if(times*2<=array.length)
				return false;
			else
				return true;
	}
}
