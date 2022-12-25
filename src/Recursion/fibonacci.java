package Recursion;

public class fibonacci {

	public static void main(String[] args) {
		fibonacci recursion = new fibonacci();
		var rec = recursion.fibo(3);
		System.out.println(rec);

	}
	
	public int fibo(int n) {
		if(n < 0) {
			return -1;
		}
		if (n == 1 || n ==0) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
