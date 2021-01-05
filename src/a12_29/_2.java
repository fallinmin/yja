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
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = exam.kor + exam.eng + exam.math;
		double avg = total / 3.0;

		System.out.printf("국어 : %d\n", exam.kor);
		System.out.printf("영어 : %d\n", exam.eng);
		System.out.printf("수학 : %d\n", exam.math);

		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(_2_1 exam) {
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (kor < 0 || 100 < kor);

		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("영어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (eng < 0 || 100 < eng);
		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("수학 성적은 0~100까지의 범위만 입력해주세요.");
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
				System.out.println(str + "성적은 0~100까지의 범위만 입력해주세요.");
		} while (num < 0 || 100 < num);

		System.out.println("----------------------------------------------------------");
		return num;
	}

}
