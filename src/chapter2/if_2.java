package chapter2;

import java.util.Scanner;

public class if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자3개를 받는다 앞의 2개 숫자의 곱이 홀수이면 곱셈값을 출력하고 짝수이면 2의 3번째 숫자를 나눈값을 출력	
		int a,b,c;
		
		 a= 0;
		 b = 0;
		 c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하시오");
		a = sc.nextInt();
		System.out.println("2번째 숫자를 입력하시오");
		b= sc.nextInt();
		System.out.println("3번째 숫자를 입력하시오");
		c= sc.nextInt();
		if((a*b)%2 ==1)
		{
			System.out.println(a*b);
		}
		else
		{
			System.out.println((a*b)/(double)c);
		}
	}

}
