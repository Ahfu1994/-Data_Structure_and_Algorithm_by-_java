package Recursion;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(222));
	}
	
	public static int sumOfDigits(int n)
	{
		if(n < 0) {
			return 0;
		}
		if(n == 0){
			return 0;
		}
		return n%10 + sumOfDigits(n/10); 
	}
}
