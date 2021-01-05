package chapter2;

import java.util.Scanner;

public class next_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 2개를 입력 둘이 더한 값이 홀수인지 짝수인지 확인
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		System.out.println("숫자를 입력하시오");
		i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		j = sc.nextInt();
		
		
		
		int k=i + j;
		
		if(k%2==0)
		{
			System.out.println("값"+k+" 짝수입니다");
		}
		else {
			System.out.println("값"+k+" 홀수입니다");
		}
	}

}
