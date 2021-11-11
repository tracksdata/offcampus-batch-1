package arrays;

import java.util.Arrays;
// CRUD operations -> create, retrieve, update and delete	
public class Test {
	
	public static void main(String[] args) {
		
		int[] nums= {76,43,76,12,87,3};
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		

	}

}
