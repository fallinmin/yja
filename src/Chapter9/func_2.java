package Chapter9;

import java.util.Scanner;

public class func_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String moon = sc.nextLine();
		System.out.println(nk(moon));
		System.out.println(index(moon)+1+"��°");
	}
	
	public static boolean nk(String moon) {
		
		if(moon.contains("!")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static int index(String moon) {
		int a = moon.indexOf("!");
		return a;
	}

	
}
 	