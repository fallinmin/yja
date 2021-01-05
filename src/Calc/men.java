package Calc;

import java.util.Scanner;

public class men {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 값을 입력하시오");
		System.out.println("첫번째 숫자를 입력하시오");
		int a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		int b = sc.nextInt();
		System.out.println("연산자를 입력하시오");
		String c = sc.next();
		
		Calculater ca = new Calculater(a,b,c);
		
		System.out.println();
	}

}
