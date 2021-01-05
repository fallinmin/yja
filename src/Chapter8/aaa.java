package Chapter8;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sum = 0;
		int sum_1 = 0;
		int num_1;

		int num_2;
		while (run) {
			if (sum_1 == 0) {
				System.out.println("첫번째 숫자를 입력해주세요");
				num_1 = sc.nextInt();
				sum += num_1;
				
			} else {
				System.out.println(sum);

				System.out.println("연산자를 입력하세요");
				System.out.println("1.+, 2.- 3.* 4./");
				int dl = sc.nextInt();

				switch (dl) {

				case 1:
					System.out.println("숫자를 입력하세요.");
					num_2 = sc.nextInt();
					sum += num_2;
					System.out.println("계산의합은" + sum);

					break;

				case 2:
					System.out.println("숫자를 입력하세요");
					int num_3 = sc.nextInt();
					sum -= num_3;
					System.out.println("계산의합은" + sum);
					break;
				case 3:
					System.out.println("숫자를 입력하세요");
					int num_4 = sc.nextInt();
					sum *= num_4;
					System.out.println("계산의합은" + sum);
					break;
				case 4:
					System.out.println("숫자를 입력하세요");
					double num_5 = sc.nextInt();
					sum /= num_5;
					System.out.println("계산의합은" + sum);
					break;

				default:
					run = false;
					System.out.println("다시 실행주세요");
					break;
				}
			}
			sum_1++;
		}
	}

}
