package Chapter6;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String of Text");
		String d = sc.nextLine();
		String str[] = d.split("-|;|@");
		
		for(int i =0;i<str.length;i++) {
			
			int leng = str[i].length();
			System.out.println(str[i]);
	//		for(int j=0;j<leng;j++) {
	//			String sub = str[i].substring(j,j+1);
	//			System.out.println(sub);
	//		}
		}
		
		
	}

}
