package Recursion;

public class numbertobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberToBinary(-13));

	}
	
	public static int numberToBinary(int n) {
		if(n == 0) {
			return 0;
		}
		return n%2+10*numberToBinary(n/2);
	}

}
