package practice_algo;

public class i0018 {
	public static void main(String []arg) {
		int[] d1 = {0,0,0,1,0,0,0,1,0,0,0,0};
		int[] d2 = {0,1,0,0,0,0,0,0,0,0,1,0};
		int[] d3 = {0,0,1,0,0,0,0,0,1,0,0,0};
		int step = 0;
		for(int i=0; i<=12;i++) {
			if(d1[i] == d2[i] && d2[i] == d3[i] && d3[i] == 1) {
				System.out.println(step);
				break;
			}
		}
	}
//	protected 
}
