package Test_1230_1;

public class Coding_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "9B768C";
		String[] a = new String[string.length()];
		String b;
		for (int i = 0; i < string.length(); i++) {
			a[i] = string.substring(i, i + 1);
		}
		
		for(int i =0;i<string.length();i++) {
			System.out.println(a[i]);
			
		}

	}

}
