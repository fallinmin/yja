package Calc;

import java.util.Scanner;

public class men {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �Է��Ͻÿ�");
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
		int a = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
		int b = sc.nextInt();
		System.out.println("�����ڸ� �Է��Ͻÿ�");
		String c = sc.next();
		
		Calculater ca = new Calculater(a,b,c);
		
		System.out.println();
	}

}
