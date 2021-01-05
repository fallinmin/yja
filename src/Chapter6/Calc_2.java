package Chapter6;

import java.util.Scanner;

public class Calc_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("곱할 첫번째값을 입력하시오");
		int a1 = sc.nextInt();
		System.out.println("곱할 두번째값을 입력하시오");
		int a2 = sc.nextInt();
		
		int hap = a1*a2;
		
		if(hap%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
	}

}
