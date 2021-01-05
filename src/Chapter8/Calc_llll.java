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
				System.out.println("첫번째 숫자 입력");
				number_f = sc.nextInt();
				sum += number_f;
			}else {
				System.out.println(sum);
				System.out.println("연산자를 입력하시오");
				giho = sc.next();
				switch (giho) {

				case "+":
					System.out.println("숫자를 입력하세요.");
					int num_2 = sc.nextInt();
					sum += num_2;
					System.out.println(sum);

					break;

				case "-":
					System.out.println("숫자를 입력하세요");
					int num_3 = sc.nextInt();
					sum -= num_3;
					System.out.println(sum);
					break;
				case "*":
					System.out.println("숫자를 입력하세요");
					int num_4 = sc.nextInt();
					sum *= num_4;
					System.out.println(sum);
					break;
				case "/":
					System.out.println("숫자를 입력하세요");
					double num_5 = sc.nextInt();
					sum /= num_5;
					System.out.println(sum);
					break;

				default:
					run = false;
					System.out.println("총 계산의합은" + sum);
					
					break;
			}
			}
			sum_first++;
			
			
			
		}
		
	}

}
