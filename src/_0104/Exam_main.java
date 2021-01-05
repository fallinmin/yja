package _0104;

import java.util.Scanner;

public class Exam_main {
	public static void main(String[] args) {
		Exam exam = new Exam();
//		exam.kor = 30;
//		exam.eng = 40;
//		exam.math = 50;
		input(exam);
		print(exam);
	}

	public static void print(Exam exam) {
		System.out.println("----------------------------------------------------------");
		System.out.println("|           ���� ���                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = exam.kor + exam.eng + exam.math;
		double avg = total / 3.0;

		System.out.printf("���� : %d\n", exam.kor);
		System.out.printf("���� : %d\n", exam.eng);
		System.out.printf("���� : %d\n", exam.math); 

		System.out.printf("���� : %d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {
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

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}
}
