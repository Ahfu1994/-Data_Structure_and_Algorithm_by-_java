package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] intArray;
		intArray = new int[3];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();  
		}
		
		System.out.println(Arrays.toString(intArray));
		
		String[] strArray = {"a","b","c"};
		System.out.println(Arrays.toString(strArray));
		

	}

}
