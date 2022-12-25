package Array;

import java.util.Arrays;

public class Pairs {

	public static void main(String[] args) throws IllegalAccessException {
		int[] nums = new int[] {3,2,4};
		int target = 6;
		twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum(nums, target)));
		

	}
	
	public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		throw new IllegalAccessException("No Solution found");
	}

}
