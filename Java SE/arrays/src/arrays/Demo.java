package arrays;

public class Demo {
	
	
	void f3(int ...x) { // var args
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
	
	void f2(int i) {
		i=2000;
	}
	
	void f1(int x[]) { // 1-D array
		x[0]=100;
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		
		int x[]= {10,20};
		//System.out.println(x.hashCode());
		//System.out.println(x.length);
		
		int i=1000;
		int[] z=new int[5];
		int[] zz=new int[3];
		
		z[0]=100;
		
		
		d.f3(1,2,3,4,5,6,67,8,9,10);
		
		System.out.println("Before I: "+i);
		d.f2(i);
		System.out.println("After I: "+i);
		
		
		System.out.println("Before : "+x[0]);
		
		d.f1(x);
		
		System.out.println("After : "+x[0]);
		
		
		

	}

}
