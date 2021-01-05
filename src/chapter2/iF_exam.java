package chapter2;

import java.util.Scanner;

public class iF_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		a=0;
		b=0;
		c=0;
		d=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		a = sc.nextInt();
		
		if(a>100)
		{
			System.out.println("너무 많아요");
		}
		else if(a<100 || a>50)
		{
			System.out.println("적당해요");
		}
		else if(a<50)
		{
			System.out.println("너무 작아요");
		}
		
	}

}
