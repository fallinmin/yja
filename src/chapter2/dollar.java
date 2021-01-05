package chapter2;

import java.util.Scanner;

public class dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double  b, c;
		double dollor = 1101.50;
		
		
		System.out.println("바꿀 원화 입력");
		
		
		
		int a = sc.nextInt();

		
		b = (dollor % (double)a);
		
		System.out.println("달러:"+b);
		
		c = (dollor / a);
		
		System.out.println("나머지"+c*1000);
		
		
		
		
	}

}
