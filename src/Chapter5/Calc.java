package Chapter5;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	boolean run = true;
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
			int num1 = sc.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
			int num2 = sc.nextInt();
			System.out.println("� ������ �Ͻðڽ��ϱ�?(+,-,/,*)");
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
			
			System.out.println("����Ͻðڽ��ϱ�? 1 ��� 2 ����");
			int flag = sc.nextInt();
			if(flag==1) {
				run = true;
			}else {
				run = false;
				System.out.println("����� �����մϴ�");
			}
			
		} */
		boolean run = true;
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("� ������ �Ͻðڽ��ϱ�?(+,-,/,*)");
			String str = sc.next();
			System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
			int num1 = sc.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
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
