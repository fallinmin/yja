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
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				num_1 = sc.nextInt();
				sum += num_1;
				
			} else {
				System.out.println(sum);

				System.out.println("�����ڸ� �Է��ϼ���");
				System.out.println("1.+, 2.- 3.* 4./");
				int dl = sc.nextInt();

				switch (dl) {

				case 1:
					System.out.println("���ڸ� �Է��ϼ���.");
					num_2 = sc.nextInt();
					sum += num_2;
					System.out.println("���������" + sum);

					break;

				case 2:
					System.out.println("���ڸ� �Է��ϼ���");
					int num_3 = sc.nextInt();
					sum -= num_3;
					System.out.println("���������" + sum);
					break;
				case 3:
					System.out.println("���ڸ� �Է��ϼ���");
					int num_4 = sc.nextInt();
					sum *= num_4;
					System.out.println("���������" + sum);
					break;
				case 4:
					System.out.println("���ڸ� �Է��ϼ���");
					double num_5 = sc.nextInt();
					sum /= num_5;
					System.out.println("���������" + sum);
					break;

				default:
					run = false;
					System.out.println("�ٽ� �����ּ���");
					break;
				}
			}
			sum_1++;
		}
	}

}
