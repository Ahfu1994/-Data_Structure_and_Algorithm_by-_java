package Recursion;

public class recursion1 {

	public static void main(String[] args) {
		openRussianDoll(10);

	}
	
	public static void openRussianDoll(int doll) {
		if (doll < 1) {
			System.out.println("All dolls are opened");
		}
		else {
			System.out.println("All dolls "+doll +" are opened");
			openRussianDoll(doll-1);
		}
	}

}
