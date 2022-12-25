package Recursion;

public class findmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{12,33,44,55,66,77,88,99,100, 10,12,13,43};
		System.out.println(findMaxNumRec(arr,arr.length));
	}
	
	public static int findMaxNumRec(int[] sampleArray, int n) {
		if(n == 1) {
			return sampleArray[0];
		}
		return max(sampleArray[n-1],findMaxNumRec(sampleArray, n-1));
	}
	
	public static int max(int a, int b) {
		int max = 0;
		if(a>b) {
			max = a;
		}
		else {
			max = b;
		}
		return max;
	}

}
