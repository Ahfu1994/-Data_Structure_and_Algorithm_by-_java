package Recursion;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(100, 20));

	}
	
	public static int gcd(int a, int b) {
		if(a< 0 || b < 0) {
			return -1;
		}
		if(b == 0) {
			return a;
		}
		else if(a > b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		return gcd(a, a%b);
	}

}
