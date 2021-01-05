package Chapter6;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 2;
		for(int i =1;i<=9;i++) {
			System.out.println(j+"X"+i+"="+j*i);
			if(i==9) {
				i =0;
				j++;
			if(j<=10) {
				break;
			}
			}
			
		}
	}

}
