package Test_1230_1;

import java.util.Scanner;

public class Coding_10 {
	static int money = 10000;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ATM�� ���Ű��� ȯ���մϴ�");
		boolean run = true;
		Coding_10_1 money = new Coding_10_1();

		while (run) {
			int minus = 0;
			int plus = 0;
			System.out.println("1. ��ȸ 2. ��� 3. �Ա�");
			int start = scan.nextInt();
			if (start == 1) {
				check(money);
			} else if (start == 2) {
				CG(money);
			} else if (start == 3) {
				ig(money);
			}
		}

	}

	public static void check(Coding_10_1 money) {
		System.out.println("�ܾ��� ��ȸ�մϴ�");
		System.out.println("===========================");
		System.out.println("�ܾ���" + money.money + "���Դϴ�");
	}

	public static void CG(Coding_10_1 money) {
		System.out.println("����մϴ�");
		System.out.println("===========================");
		System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
		System.out.print("��:");
		money.minus = scan.nextInt();
		money.money -= money.minus;
	}

	public static void ig(Coding_10_1 money) {
		System.out.println("�Ա��մϴ�");
		System.out.println("===========================");
		System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
		System.out.print("��:");
		money.plus = scan.nextInt();
		money.money += money.plus;
	}
}