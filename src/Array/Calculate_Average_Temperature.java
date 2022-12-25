package Array;

import java.util.Scanner;

public class Calculate_Average_Temperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days' temperatures?");
		int numDays = sc.nextInt();
		int[] temps = new int[numDays];
		//record temperatures and find average
		int sum = 0;
		for (int i = 0; i < numDays; i++) {
			System.out.println("Day "+(i+1)+"'s hight temp: ");
			temps[i] = sc.nextInt();
			sum += temps[i];
		}
		
		double avg = sum/numDays;
		//count days above average
		int above = 0;
		for (int i = 0; i < temps.length; i++) {
			if (temps[i] > above) {
				above ++;
			}
		}
		System.out.println();
		System.out.println(above+" days temp above average");
		System.out.println("Average temp = "+avg);

	}

}
