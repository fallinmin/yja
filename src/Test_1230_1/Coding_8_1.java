package Test_1230_1;

import java.util.Scanner;

public class Coding_8_1 {

	public static void Scan() {
		System.out.println("1.��ȭ��ȣ�� 2.��ȭ�ɱ� 3.�ð� Ȯ�� 4.���ͳ� �˻�");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		if (menu == 1) {
			book();
		} else if (menu == 2) {
			System.out.println("��ȭ�� �ŽǺ��� �̸��� �Է��ϼ���");
			String men = sc.next();
			call(men);
		} else if (menu == 3) {
			clock();
		} else if (menu == 4) {
			internet();
		}
	}

	public static void book() {
		Scanner sc = new Scanner(System.in);
		String books[] = { "��â��", "Ȧ�浿", "��ö��" };
		System.out.println("1.��ȭ��ȣ�� Ȯ�� 2.������"); 
		int call = sc.nextInt();
		if (call == 1) {
			for (int i = 0; i < books.length; i++) {
				System.out.println(books[i]);
			}
		}

	}

	public static void call(String men) {
		System.out.println(men + "�Կ��� ��ȭ�� �̴ϴ�");

	}

	public static void clock() {
		System.out.println("����ð��� 10��10���Դϴ�");
	}

	public static void internet() {
		System.out.println("����");
	}

}
