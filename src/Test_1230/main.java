package Test_1230;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���⿡ ���Ű��� ȯ���մϴ�");
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			int chogigap = 0;
			System.out.println("���ڸ� �Է��ϼ���");
			int num = sc.nextInt();
			System.out.println("�����ڸ� �Է��Ͽ� �ּ���");
			String giho = sc.next();
			switch (giho) {
			case "+":
				System.out.println("���ڸ� �Է��ϼ���");
				int num2 = sc.nextInt();
				chogigap = num + num2;
				break;
			case "-":
				System.out.println("���ڸ� �Է��ϼ���");
				num2 = sc.nextInt();
				chogigap = num - num2;
				break;
			case "*":
				System.out.println("���ڸ� �Է��ϼ���");
				num2 = sc.nextInt();
				chogigap = num * num2;
				break;
			case "/":
				System.out.println("���ڸ� �Է��ϼ���");
				num2 = sc.nextInt();
				chogigap = num / num2;
				break;

			}
			if (giho.equals("=")) {
				System.out.println(chogigap);
				run = false;
			}

		}
	}

}
