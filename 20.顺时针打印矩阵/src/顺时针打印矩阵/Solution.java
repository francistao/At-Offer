package 顺时针打印矩阵;

public class Solution {

	public void printMatrix(int [][] matrix) {
		int columns = matrix.length;
		int rows = matrix[0].length;
	     if(matrix == null || columns <= 0 || rows <= 0)
	    	 return;
	     int start = 0;
	     while (columns > start * 2 && rows > start * 2) {
			printMatrixInCircle(matrix,columns,rows,start);
			start++;
		}
    }

	private void printMatrixInCircle(int[][] matrix, int columns, int rows, int start) {
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		
		//从左到右打印一行
		for (int i = 0; i <= endX; i++) {
			int number = matrix[start][i];
			printNumber(number);
		}
		//从上到下打印一列
		if(start < endY){
			for (int i = start+1; i < endY; i++) {
				int number = matrix[i][endX];
				printNumber(number);
			}
		}
		
		//从右到左打印一行
		if(start < endX && start < endY){
			for (int i = endX - 1; i >= start; i--) {
				int number = matrix[endX][i];
				printNumber(number);
			}
		}
		
		//从下到上打印一行
		if(start < endX && start < endY-1){
			for (int i = endY-1; i >= start + 1; i--) {
				int number = matrix[i][start];
				printNumber(number);
			}
		}
		
		
	}

	private void printNumber(int number) {
		System.out.println(number + "");
	}

	
}
