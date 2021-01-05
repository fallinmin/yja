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
		System.out.println("|           ���� ���                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = exam.getKor() + exam.getEng() + exam.getMath()+ exam.getSci()+ exam.getSa();
		double avg = total / 3.0;

		System.out.printf("���� : %d\n", exam.getKor());
		System.out.printf("���� : %d\n", exam.getEng());
		System.out.printf("���� : %d\n", exam.getMath());
		System.out.printf("���� : %d\n", exam.getSci());
		System.out.printf("��ȸ : %d\n", exam.getSa());

		System.out.printf("���� : %d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {
		String korl = "����";
		String engl = "����";
		String maths = "����";
		String scis = "����";
		String sas = "��ȸ";
		String subject[] = {"����","����","����","����","��ȸ"};
		System.out.println("----------------------------------------------------------");
		System.out.println("|         ���� �Է�                    | ");
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
				System.out.println(str + " ������ 0~100������ ������ �Է����ּ���.");
		} while (num < 0 || 100 < num);
	
		System.out.println("----------------------------------------------------------");
	return num;	
	}

}
