package Chapter8;

import java.util.Scanner;

public class Calc_llll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int sum_2 =0;
		int sum_f =0;
		String giho = "";
		int number_f = 0;
		int sum_first = 0;
		boolean run = true;
		while(run) {
			if(sum_first ==0) {
				System.out.println("ù��° ���� �Է�");
				number_f = sc.nextInt();
				sum += number_f;
			}else {
				System.out.println(sum);
				System.out.println("�����ڸ� �Է��Ͻÿ�");
				giho = sc.next();
				switch (giho) {

				case "+":
					System.out.println("���ڸ� �Է��ϼ���.");
					int num_2 = sc.nextInt();
					sum += num_2;
					System.out.println(sum);

					break;

				case "-":
					System.out.println("���ڸ� �Է��ϼ���");
					int num_3 = sc.nextInt();
					sum -= num_3;
					System.out.println(sum);
					break;
				case "*":
					System.out.println("���ڸ� �Է��ϼ���");
					int num_4 = sc.nextInt();
					sum *= num_4;
					System.out.println(sum);
					break;
				case "/":
					System.out.println("���ڸ� �Է��ϼ���");
					double num_5 = sc.nextInt();
					sum /= num_5;
					System.out.println(sum);
					break;

				default:
					run = false;
					System.out.println("�� ���������" + sum);
					
					break;
			}
			}
			sum_first++;
			
			
			
		}
		
	}

}
