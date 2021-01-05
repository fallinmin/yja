package Trycatch;

public class tryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD";
		try {
		for(int i=0;i<=str.length();i++) {
			String sub =str.substring(i,i+1);
		}
		
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		int array[] = new int[2];
		try {
			for(int i=0;i<=str.length();i++) {
				array[i] = str.length();
			}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
