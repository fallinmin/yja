package Chapter8;

import java.util.Scanner;

public class Calc_ex {

	public static void main(String[] args) {

		boolean run = true; // ���� ����
		boolean y = true;

		int sum = 0;
		double result = 0;
		int num2 = 0;

		while (run) {

			Scanner sc = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���.");
			int num = sc.nextInt();
			sum += num;

			while (y) {

				System.out.println("������ �Է�  //  c = ����");
				String str = sc.next();

				switch (str) {
				case "+":
					System.out.println("���ڸ� �Է��ϼ���.");
					num2 = sc.nextInt();
					result += (sum + num2);
					
					System.out.println(" = " + result);
					sum = 0;
					break;

				case "-":
					System.out.println("���ڸ� �Է��ϼ���.");
					num2 = sc.nextInt();
					result -= (sum + num2);
					sum = 0;
					System.out.println(" = " + result);
					break;

				case "*":
					System.out.println("���ڸ� �Է��ϼ���.");
					num2 = sc.nextInt();
					result *= (sum + num2);
					sum = 0;
					System.out.println(" = " + result);
					break;

				case "/":
					System.out.println("���ڸ� �Է��ϼ���.");
					num2 = sc.nextInt();
					result /= (sum + num2);
					sum = 0;
					System.out.println(" = " + result);
					break;

				case "c":
					y = false;
					run = false;
					break;
				}

			}
		}
	}

}
