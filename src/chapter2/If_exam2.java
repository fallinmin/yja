package chapter2;

import java.util.Scanner;

public class If_exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int a =0;
		a = sc.nextInt();
		System.out.println("2번째 숫자를 입력하시오");
		int b = 0;
		b = sc.nextInt();
		int c = 0;
		
		c = a+b;
		
		
		if(50<c&&60>c) {
			int result = 0;
			result = c/3;
			System.out.println("ㅇㅇ"+result);
		}else if(60<c&&100>c) {
			int result =0;
			result = c/6;
			System.out.println(result);
		}else if(100<c) {
			int result = 0;
			System.out.println("100보다 큰수이므로 숫자를 입력하세요");
			int i = 0;
			int j = 0;
			i = sc.nextInt();
			j = c - i;
			
			System.out.println(j);
			
		}else
		{
			System.out.println("50보다 작음");
		}
	}

}
