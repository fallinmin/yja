package a12_29;

import java.util.Scanner;

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2_1 exam = new _2_1();
//		exam.kor = 30;
//		exam.eng = 40;
//		exam.math = 50;
		input(exam);
		print(exam);
	}

	public static void print(_2_1 exam) {
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

	public static void input(_2_1 exam) {
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

		exam.kor = do_process(kor);
		exam.eng = do_process(eng);
		exam.math = do_process(math);
	}

	public static int do_process(String str) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.printf(str + " : ");
			num = scan.nextInt();
			if (num < 0 || 100 < num)
				System.out.println(str + "������ 0~100������ ������ �Է����ּ���.");
		} while (num < 0 || 100 < num);

		System.out.println("----------------------------------------------------------");
		return num;
	}

}
