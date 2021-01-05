package Chapter10;

import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하여 주세요");
		String str = sc.nextLine();
		
		
		scan(str);
		leng(str);
		sub(str);
		
		String array[] = new String[str.length()];

		System.out.println(array);
		System.out.println(scan(str));
		System.out.println(leng(str));
		System.out.println(sub(str));
		for(int i =0;i<str.length()) {
			System.out.println(sub);
		}
		
	}
	
	public static int scan(String str) {
		
		int a = str.indexOf("안녕");
		return a;
	}
	
	public static int leng(String str) {
		int leng = str.length();
		return leng;
	}
	public static String[] sub(String str) {
		String sub[] = new String[str.length()];
		for(int i=0;i<str.length();i++) {
			
		sub[i] =str.substring(i,i+1);
		
		}
		return sub;
	}
		 
		
		
	}
		
