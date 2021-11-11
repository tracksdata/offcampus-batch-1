package arrays;

public class TwoD {
	
	public static void main(String[] args) {
		
		int[][]x=new int[2][3]; // 2X3
		
		x[0][0]=10;
		x[0][1]=20;
		x[0][2]=30;
		
		x[1][0]=40;
		x[1][1]=50;
		x[1][2]=60;
		
		/*
		//System.out.println(x.length);
		for(int i=0;i<x.length;i++) {
			
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			
			System.out.println();
		}
		*/
		
		
		for(int rows[]:x) { // JDK 6.0
			
			for(int col:rows) {
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("-------------------");
		
		int[] nums= {10,30,54,76,43};
		
		for(int num:nums) { // for each loop >> JDK 6.0
			System.out.println(num);
		}
		
		
		
		
	}

}
