package Chapter3;

import java.util.Scanner;

public class Switch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	/*	int f1;
		int f2;
		String ee = "";
		String a = "+";
		String b = "-";
		String c = "*";
		String d = "/";
		int sum;
		
		System.out.println("첫번째 숫자를 입력하세요");
		f1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		f2 = sc.nextInt();
		System.out.println("연산자를 입력하세요    + - * / ");
		ee = sc.next();
		
		if(ee.equals(a)) {
			sum = f1 + f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else if(ee.equals(b)) {
			sum = f1 - f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else if(ee.equals(c)) {
			sum = f1 * f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else if(ee.equals(d)) {
			sum = f1 / f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else {
			System.out.println("연산자를 잘못 입력하셨습니다");
		}

		*/
		
		
		
		
		
/*		int f1;
		int f2;
		int sum;
		String ee = "";
		System.out.println("첫번째 수를 입력 하시오");
		f1 = sc.nextInt();
		System.out.println("연산자를 입력하시오");
		ee = sc.next();
		System.out.println("두번째 수를 입력하시오");
		f2 = sc.nextInt();
		
		
		if(ee.equals("+")) {
			sum = f1 +f2 ;
			System.out.println();
		}
		
		
		
		System.out.println();
*/		
		int f1;
		int f2;
		String ee = "";
		String a = "+";
		String b = "-";
		String c = "*";
		String d = "/";
		int sum;
		
		System.out.println("첫번째 숫자를 입력하세요 1~9");
		f1 = sc.nextInt();
		if(!(f1>0&&f1<10)) {
			System.out.println("숫자를 잘못 입력하였습니다");
		}
		System.out.println("두번째 숫자를 입력하세요 1~9");
		f2 = sc.nextInt();
		if(!(f2>0&&f2<10)) {
			System.out.println("숫자를 잘못 입력하였습니다");
		}
		System.out.println("연산자를 입력하세요    + - * / ");
		ee = sc.next();
		if(!((ee.equals("+")||ee.equals("-")||ee.equals("*")||ee.equals("/"))))
		{
			System.out.println("연산자를 잘못입력하셨습니다");
		}
		
		
/*		if(ee.equals(a)) {
			sum = f1 + f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else if(ee.equals(b)) {
			sum = f1 - f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else if(ee.equals(c)) {
			sum = f1 * f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else if(ee.equals(d)) {
			sum = f1 / f2;
			System.out.println("계산값은 "+sum+"입니다");
		}else {
			System.out.println("연산자를 잘못 입력하셨습니다");
		}
*/
		switch(ee) {
		case "+":
			sum = f1 + f2;
		System.out.println("계산값은 "+sum+"입니다");
		break;
		case "-":
			sum = f1 - f2;
		System.out.println("계산값은 "+sum+"입니다");
		break;
		case "*":
			sum = f1 * f2;
		System.out.println("계산값은 "+sum+"입니다");
		break;
		case "/":
			sum = f1 / f2;
		System.out.println("계산값은 "+sum+"입니다");
		break;
		}
		
		
		
	}

}