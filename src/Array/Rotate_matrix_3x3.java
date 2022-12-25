package Array;

import java.util.Arrays;

public class Rotate_matrix_3x3 {

	public static void main(String[] args) {
		Rotate_matrix_3x3 mx = new Rotate_matrix_3x3();
		int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		int[][] rotated = mx.rotateMatrix(matrix);
		mx.printMatrix(rotated);		
	}
	
	public int[][] rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		int[][] rotated = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotated[j][n-i-1] = matrix[i][j];
			}
		}
		return rotated;
	}
	
	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
