package Array;

public class sum_diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(sumDiagonal(myArray2D) );

	}
	
	 public static int sumDiagonal(int[][] a) {
		 if (a.length != a[0].length || a.length == 1) {
			return -1;
		 }
		 int sum = 0;
		 for (int i = 0; i < a.length; i++) {
			sum += a[i][i];
		}
		
		 return sum;
	 }

}
