package Recursion;

public class Poweroftwo {

	public static void main(String[] args) {
		
		System.out.println(recusivePowerOfTwo(3));
		System.out.println(iterativePowerOfTwo(4));
	}
	
	public static int recusivePowerOfTwo(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			int power  = 2*recusivePowerOfTwo(n-1);
			return power;
		}
	}

	public static int iterativePowerOfTwo(int n) {
		int i = 0;
		int power = 1;
		while (i < n) {
			power = 2*power;
			i++;
		}
		return power;
	}
}
