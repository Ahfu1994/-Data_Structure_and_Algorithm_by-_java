package Recursion;

public class factorial {

	public static void main(String[] args) {
		factorial recursion = new factorial();
		var rec = recursion.fac(3);
		System.out.println(rec);

	}
	
	public int fac(int n)
	{
		if(n < 0) {
			return -1;
		}
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * fac(n-1);
	}
}

