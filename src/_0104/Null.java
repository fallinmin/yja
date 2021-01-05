package _0104;

import java.util.Scanner;

public class Null {
	public static void main(String[] args) {
		// Exam[] exams = new Exam[3];
		Exam_list list = new Exam_list();
		list.exams = new Exam[3];
		// exams[0]~exams[2]
		Scanner scan = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("----------------------------------------------------------");
			System.out.println("|         ���� �޴�                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. �����Է� ");
			System.out.println("\t2. ������� ");
			System.out.println("\t3. ���� ");
			System.out.println("\t����> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				input_list(list);
				break;
			case 2:
				print_list(list);
				break;
			case 3:

				break;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ� 1~3 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}

	private static void print_list(Exam_list list) {// ���
		System.out.println("----------------------------------------------------------");
		System.out.println("|           ���� ���                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		for (int i = 0; i < list.exams.length; i++) {
			Exam exam = list.exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			double avg = total / 3.0;

			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);

			System.out.printf("���� : %d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");
		}
	}

	private static void input_list(Exam_list list) { // �Է�
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         ���� �Է�                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {
			System.out.printf("���� : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
		} while (kor < 0 || 100 < kor);

		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("���� : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
		} while (eng < 0 || 100 < eng);
		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("���� : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
		} while (math < 0 || 100 < math);
		System.out.println("----------------------------------------------------------");

		Exam exam = new Exam();

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		if (list.exams.length == list.current) {
			Exam[] temp = new Exam[list.exams.length + 5];
			for (int i = 0; i < list.exams.length; i++) {
				temp[i] = list.exams[i];

			}
			list.exams = temp;
		}
		list.exams[list.current] = exam;
		list.current++;
	}
}
