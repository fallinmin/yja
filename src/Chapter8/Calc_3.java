package Chapter8;

import java.util.Scanner;

public class Calc_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//항갯수를 선택
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		boolean run = true;
		int re=0;
		String giho= "";
		while(run) {
		System.out.println("몇항 계산하시겠습니까?");
		a = sc.nextInt();
		int num[] = new int[a];
		for(int i =0;i<a;i++) {
			System.out.println(i+1+"번째 숫자를 입력");
			num[i] = sc.nextInt();
			
		}
		System.out.println("기호를 입력하시오.");
		giho = sc.next();
		
		for(int i =0;i<a;i++) {
			if(i==0) {
				b = num[i];
			}else {
			if(giho.equals("+")) {
				b += num[i];
			}else if(giho.equals("-")) {
				b -= num[i];
			}else if(giho.equals("*")) {
				b *= num[i];
			}else if(giho.equals("/")) {
				b /= num[i];
			}
			}
		}

		if(giho.equals("=")){
			System.out.println("결과값: "+b);
		}
		System.out.println("다시 계산하시겠습니까? 1.리셋 2.종료");
			re= sc.nextInt();
			
			if(re==1) {
			b = 0;
			}else if(re==2) {
				run =!run;
				System.out.println("종료하였습니다.");
				
			}
		}
		
	}

}
