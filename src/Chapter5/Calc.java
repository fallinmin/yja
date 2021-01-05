package Chapter5;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	boolean run = true;
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("첫번째 숫자를 입력하시오");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하시오");
			int num2 = sc.nextInt();
			System.out.println("어떤 연산을 하시겠습니까?(+,-,/,*)");
			String str = sc.next();
			int sum = 0;
			switch(str) {
			case("+"):
				sum = num1+num2;
			break;
			case("-"):
				sum = num1-num2;
			break;
			case("*"):
				sum = num1*num2;
			break;
			case("/"):
				sum = num1/num2;
			break;
			}

			
			System.out.println(num1+str+num2+"="+sum);
			
			System.out.println("계속하시겠습니까? 1 계속 2 중지");
			int flag = sc.nextInt();
			if(flag==1) {
				run = true;
			}else {
				run = false;
				System.out.println("계산을 종료합니다");
			}
			
		} */
		boolean run = true;
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("어떤 연산을 하시겠습니까?(+,-,/,*)");
			String str = sc.next();
			System.out.println("첫번째 숫자를 입력하시오");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하시오");
			int num2 = sc.nextInt();
			int sum = 0;
			switch(str) {
			case("+"):
				sum = num1+num2;
			break;
			case("-"):
				sum = num1-num2;
			break;
			case("*"):
				sum = num1*num2;
			break;
			case("/"):
				double(sum) = double(num1/num2);
			break;
			}
			
		}
	}

}
