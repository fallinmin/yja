package Test_1230;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("계산기에 오신것을 환영합니다");
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			int chogigap = 0;
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			System.out.println("연산자를 입력하여 주세요");
			String giho = sc.next();
			switch (giho) {
			case "+":
				System.out.println("숫자를 입력하세요");
				int num2 = sc.nextInt();
				chogigap = num + num2;
				break;
			case "-":
				System.out.println("숫자를 입력하세요");
				num2 = sc.nextInt();
				chogigap = num - num2;
				break;
			case "*":
				System.out.println("숫자를 입력하세요");
				num2 = sc.nextInt();
				chogigap = num * num2;
				break;
			case "/":
				System.out.println("숫자를 입력하세요");
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
