package Chapter6;

public class Array_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5,6};
		String str = "ABCDE";
		char c = ' ';
		String str_slice ="";
		int str_n = num[4];
		for(int i =0;i<str.length();i++) {
			str_slice = str.substring(i,i+1);
			if(str_slice.equals("D")) {
				c = str.charAt(i);
				System.out.println(c);
				break;
			}
		}
	}

}
