package practice_algo;

public class i0018 {
	public static void main(String []arg) {
		int[] d1 = {0,0,0,1,0,0,0,1,0,0,0,0};
		int[] d2 = {0,1,0,0,0,0,0,0,0,0,1,0};
		int[] d3 = {0,0,1,0,0,0,0,0,1,0,0,0};
		int step = 36;
		for(int i=0; i<12;i++) {
			if(d1[i] == d2[i] && d2[i] == d3[i] && d3[i] == 1) {
				System.out.println(0);
				break;
			}
			int s,s1=0,s2=0,s3=0,l,r;
			boolean check1 =false;
			boolean check2 =false;
			boolean check3 =false;
			for (int j=0;j<12;j++) {
				l = i-j;
				r = i+j;
				if(l<0) {
					l=12+l;
				}
				if(r>11) {
					r = r-12;
				}
				if(check1 == false && (d1[l] == 1||d1[r] == 1)) {
					check1 = true;
					s1=j;
				}
				if(check2 == false &&(d2[l] == 1||d2[r] == 1)) {
					s2=j;
					check2 = true;
				}
				if(check3 == false &&(d3[l] == 1||d3[r] == 1)) {
					s3=j;
					check3= true;
				}
				s = s1+s2 +s3;
				if(s<step) {
					step =s;
				}
			}
		}
	}
	private static void clockwise() {
		
	}
}
