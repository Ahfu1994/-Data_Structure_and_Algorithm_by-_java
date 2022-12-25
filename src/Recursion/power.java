package Recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(p(2,5));

	}
	
	public static int p(int base, int exp) {
		if(exp < 0) {
			return -1;
		}
		if(exp == 0 ) {
			return 1;
		}
		return base*p(base,exp-1);
	}

}
