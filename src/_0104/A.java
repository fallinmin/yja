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
			System.out.println("|         ���� �޴�                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. �����Է� ");
			System.out.println("\t2. ������� ");
			System.out.println("\t3. ���� ");
			System.out.println("\t����> ");
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
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ� 1~3 ������ ���ڸ� �Է����ּ���.");
			}
		}
		
		private static void input_list(Exam[] exams) { // �Է�
			int kor;
			int eng;
			int math;
			Scanner scan1 = new Scanner(System.in);
			System.out.println("----------------------------------------------------------");
			System.out.println("|         ���� �Է�                    | ");
			System.out.println("----------------------------------------------------------");
			System.out.println();
			
			for (int i = 0; i < 3; i++) {

				do {
					System.out.printf("���� : ");
					kor = scan1.nextInt();
					if (kor < 0 || 100 < kor)
						System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
				} while (kor < 0 || 100 < kor);

				System.out.println("----------------------------------------------------------");
				
				do {
					System.out.printf("���� : ");
					eng = scan1.nextInt();
					if (eng < 0 || 100 < eng)
						System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
				} while (eng < 0 || 100 < eng);
				System.out.println("----------------------------------------------------------");

				do {
					System.out.printf("���� : ");
					math = scan1.nextInt();
					if (math < 0 || 100 < math)
						System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
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
