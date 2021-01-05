package Test_1230_1;

import java.util.Scanner;

public class Coding_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		System.out.println("연산자를 입력하세요");
		String f = sc.next();
		
		switch(f) {
		case "+":
			System.out.println(a+b+c+d+e);
			break;
		case "-":
			System.out.println(a-b-c-d-e);
			break;
		case "*":
			System.out.println(a*b*c*d*e);
		case "/":
			System.out.println(a/b/c/d/e);
		}
		
		
	}

}
