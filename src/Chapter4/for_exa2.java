package Chapter4;

import java.util.Scanner;

public class for_exa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str;
		String in ;
		
		boolean aaa = true;
		
		System.out.println("문자열를 입력하시오");
		str = sc.next();
		String a= "%";
		String b= "?";
		String c= "!";
		String d= "*";
		for(int i = 0;i<str.length();i++) {
			
		in = str.substring(i,i+1);
		System.out.print(in+" ");
		if(in.equals(a)||in.equals(b)||in.equals(c)||in.equals(d)) {
			System.out.println("잘못 입력하셨습니다");
			aaa = false;
		}
		
		}
		if(aaa==true) {
			System.out.println("정상적으로 입력하셨습니다");
			}

}
}