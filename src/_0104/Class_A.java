package _0104;

import java.util.Scanner;

public class Class_A {

	public static void main(String[] args) {
		boolean run = true;
		Class_A_list list = new Class_A_list();
		list.Class_B_array = new Class_B[3];
		list.current = 0;

		while (run) {
			// ��ü�迭�� �Ű�����.
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("--\n �ڡڡ� 1.�Է� 2.��� �ڡڡ�");
			int select = sc.nextInt();
			System.out.println("--");

			switch (select) {
			case 1:
				plus(list);
				break;
			case 2:
				print(list);
			}
		}
	}

	public static void plus(Class_A_list list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// ��ü ���� ��, �� �Է�
		Class_B B1 = new Class_B();
		System.out.println(list.current + 1 + "��° �迭�� ù��° �� �Է�");
		B1.num_1 = sc.nextInt();
		System.out.println(list.current + 1 + "��° �迭�� �ι�° �� �Է�");
		B1.num_2 = sc.nextInt();
		B1.num_3 = B1.num_1 + B1.num_2;

		// �Ű����� �迭 ��ü�� �� ���
		list.Class_B_array[list.current] = B1;
		list.current++;
	}

	public static void print(Class_A_list list) {
		for (int i = 0; i < list.current; i++) {
			// B1 ��ü �ٽ� ���� �� �� ���.
			Class_B B1 = list.Class_B_array[i];
			System.out.println("ù��° �� :: " + B1.num_1);
			System.out.println("�ι�° �� :: " + B1.num_2);
			System.out.println("�� :: " + B1.num_3);
		}
	}
}