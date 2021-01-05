package _0104;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam[] exams = new Exam[3];
		Scanner scan = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("----------------------------------------------------------");
			System.out.println("|         메인 메뉴                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				input_list(exams);
				break;
			case 2:
				print_list(exams);
				break;
			case 3:
				
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다 1~3 까지의 숫자를 입력해주세요.");
			}
		}
		
		private static void input_list(Exam[] exams) { // 입력
			int kor;
			int eng;
			int math;
			Scanner scan1 = new Scanner(System.in);
			System.out.println("----------------------------------------------------------");
			System.out.println("|         성적 입력                    | ");
			System.out.println("----------------------------------------------------------");
			System.out.println();
			
			for (int i = 0; i < 3; i++) {

				do {
					System.out.printf("국어 : ");
					kor = scan1.nextInt();
					if (kor < 0 || 100 < kor)
						System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");
				} while (kor < 0 || 100 < kor);

				System.out.println("----------------------------------------------------------");
				
				do {
					System.out.printf("영어 : ");
					eng = scan1.nextInt();
					if (eng < 0 || 100 < eng)
						System.out.println("영어 성적은 0~100까지의 범위만 입력해주세요.");
				} while (eng < 0 || 100 < eng);
				System.out.println("----------------------------------------------------------");

				do {
					System.out.printf("수학 : ");
					math = scan1.nextInt();
					if (math < 0 || 100 < math)
						System.out.println("수학 성적은 0~100까지의 범위만 입력해주세요.");
				} while (math < 0 || 100 < math);
				System.out.println("----------------------------------------------------------");

				Exam exam = new Exam();

				exam.kor = kor;
				exam.eng = eng;
				exam.math = math;

				exams[i] = exam;
			}
		}
	}

	public static void print(Exam exam) {

	}

	public static void input(Exam exam) {
		
	}

	public static int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public static int minus(int a, int b) {
		int sum = a-b;
		return sum;
	}
}
