package Chapter8;

import java.util.Scanner;

public class Calc_lll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=0,b,c;
		String giho = "";
		boolean run = true;
		boolean b_giho = false;
		int summary = 0;
		while(run) {
			if(b_giho==false) {
			System.out.println("숫자를 입력하시오");
			a = sc.nextInt();
			System.out.println("연산자를 입력하시오");
			giho = sc.next();
			System.out.println("두번째숫자를 입력하시오");
			b = sc.nextInt();
			

			switch(giho) {
			case "+":
				summary = a+b;
				break;
			case "-":
				summary = a-b;
				break;
			case "*":
				summary = a*b;
				break;
			case "/":
				summary = a/b;
				break;
			}
			}
			else {
				System.out.println("두번째 입력값");
				b = sc.nextInt();
			
			System.out.println("연산자를 입력하시오");
			giho = sc.next();
			switch(giho) {
			case "+":
				System.out.println(summary+b);
				summary = a+b;
				break;
			case "-":
				System.out.println(summary-b);
				summary = a-b;
				break;
			case "*":
				System.out.println(summary*b);
				summary = a*b;
				break;
			case "/":
				System.out.println(summary/b);
				summary = a/b;
				break;
			case "=":
				run =!run;
				System.out.println(summary+"입니다");
				break;
			}
			}
		}b_giho = true;
		b = summary;
			
		
	}

}
