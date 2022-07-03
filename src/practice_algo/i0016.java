package practice_algo;

public class i0016 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int count = 0;
		int a,b,c,d,e;
		
//		test case 1
//		int n =5 ;
//		int m = 6 ;
//		int [][] arr = {
//				{3,4,0,-1,9,-2},
//				{-1,1,3,8,10,13},
//				{5,5,2,0,6,-4},
//				{-5,7,4,-1,8,-9},
//				{3,-7,-3,5,-3,12}
//		};

//		test case 2
//		int n = 9 ;
//		int m = 5 ;
//		int [][] arr = {
//				{-6,5,9,6,2},
//				{-7,-2,-5,0,7},
//				{2,6,10,-1,-1},
//				{6,-8,1,2,2},
//				{-6,-4,8,10,8},
//				{9,-6,3,10,1},
//				{10,0,3,-2,5},
//				{-6,4,4,3,2},
//				{-6,10,8,-8,-5}
//		};

//		test case 3
		int n = 7 ;
		int m = 12 ;
		int [][] arr = {
				{-1,-4,3,1,-4,-6,4,-10,5,-8,-2,-3},
				{5,1,10,-8,4,0,6,4,4,-5,-5,-10},
				{-7,4,-7,9,10,-3,10,-8,3,0,-5,1},
				{-4,-8,-5,-6,-10,8,2,-1,-7,0,-9,-3},
				{3,8,-5,5,-7,-5,8,-6,2,9,-3,4},
				{10,-4,-6,2,8,-8,-9,6,6,-4,-10,9},
				{0,-2,1,9,-8,-7,5,10,-6,-1,-8,-3},	
		};
		
		for (int i=0; i<n;i++) {
			for(int j=0;j<m;j++) {
				try {
					 a = arr[i][j-1];
				}catch (Exception e2){
					 a= 0;
				}
				try {
					b = arr[i-1][j];
				}catch (Exception e2){
					 b = 0;
				}
				try {
					c = arr[i][j+1];
				}catch (Exception e2){
					 c= 0;
				}
				try {
					 d = arr[i+1][j];
				}catch (Exception e2){
					 d= 0;
				}
				e = arr[i][j];
			 if(check(a,b,c,d,e)==true) {
//				 System.out.println("a= "+a+",b= "+b+",c="+c+",d="+d+",e="+e);
				 System.out.println(e);
				 count ++;
					
			 }
			}
		}
		System.out.println("Cells colored: "+count);
		long totalTime = (System.nanoTime() - startTime);
		System.out.println(totalTime);
	}
	private static boolean check(int a,int b,int c,int d,int e) {
		if(a+b+c+d == e) {
			return true;
		}
		if(a-b+c+d == e) {
			return true;
		}
		if(a+b-c+d == e) {
			return true;
		}
		if(a+b+c-d == e) {
			return true;
		}
		if(a-b-c+d == e) {
			return true;
		}
		if(a-b+c-d == e) {
			return true;
		}
		if(a+b-c-d == e) {
			return true;
		}
		if(a-b-c-d == e) {
			return true;
		}
		
		
		if(-a+b+c+d == e) {
			return true;
		}
		if(-a-b+c+d == e) {
			return true;
		}
		if(-a+b-c+d == e) {
			return true;
		}
		if(-a+b+c-d == e) {
			return true;
		}
		if(-a-b-c+d == e) {
			return true;
		}
		if(-a-b+c-d == e) {
			return true;
		}
		if(-a+b-c-d == e) {
			return true;
		}
		if(-a-b-c-d == e) {
			return true;
		}
		return false;
	}
}
