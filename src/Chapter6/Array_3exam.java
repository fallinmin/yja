package Chapter6;

public class Array_3exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = new int[3][4];
		
		int i =0,k=0;
		int val = 1;
		
		while(i<3) {
			while(k<4) {
				aa[i][k] = val;
				val++;
				k++;
			}
			i++;
		}
	}

}
