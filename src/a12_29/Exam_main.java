package a12_29;

import java.util.Scanner;

public class Exam_main {


	public static void main(String[] args) {
		Exam exam = new Exam();
		input(exam);
		print(exam);
	}

	public static void print(Exam exam) {
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = exam.getKor() + exam.getEng() + exam.getMath()+ exam.getSci()+ exam.getSa();
		double avg = total / 3.0;

		System.out.printf("국어 : %d\n", exam.getKor());
		System.out.printf("영어 : %d\n", exam.getEng());
		System.out.printf("수학 : %d\n", exam.getMath());
		System.out.printf("과학 : %d\n", exam.getSci());
		System.out.printf("사회 : %d\n", exam.getSa());

		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {
		String korl = "국어";
		String engl = "영어";
		String maths = "수학";
		String scis = "과학";
		String sas = "사회";
		String subject[] = {"국어","영어","수학","과학","사회"};
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		exam.setKor(do_process(korl));
		exam.setEng(do_process(engl));
		exam.setMath(do_process(maths));
		exam.setSci(do_process(scis));
		exam.setSa(do_process(sas));
		
		for(int i=0;i<subject.length;i++) {
			if(i==0) {
				exam.setKor(do_process(subject[i]));
			}else if(i==1) {
				exam.setEng(do_process(subject[i]));
			}else if(i==2) {
				exam.setMath(do_process(subject[i]));
			}else if(i==3) {
				exam.setSci(do_process(subject[i]));
			}else if(i==4) {
				exam.setSa(do_process(subject[i]));
			}
		}
	}
	
	public static int do_process(String str) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.printf(str + " : ");
			num = scan.nextInt();
			if (num < 0 || 100 < num)
				System.out.println(str + " 성적은 0~100까지의 범위만 입력해주세요.");
		} while (num < 0 || 100 < num);
	
		System.out.println("----------------------------------------------------------");
	return num;	
	}

}
