package Chapter6;

import java.util.Scanner;

public class ArrayCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		String str[] = new String[5];
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("���ڸ� �Է��ϼ���");
			int a = sc.nextInt();

			System.out.printf("�����ڸ� �Է��ϼ���\n1.+ 2.- 3.* 4./");
			int b = sc.nextInt();
			System.out.println("����� ���ڸ� �Է��ϼ���");
			int c = sc.nextInt();
			int sum = a + c;
			int min = a - c;
			int dou = a * c;
			int per = a / c;

			switch (b) {
			case 1:
				System.out.println(a + "+" + c + "=" + (a + c));
				break;
			case 2:
				System.out.println(a + "-" + c + "=" + (a - c));
				break;
			case 3:
				System.out.println(a + "*" + c + "=" + (a * c));
				break;
			case 4:
				if (b == 4) {
					double d = (double) a;
					double e = (double) c;

					System.out.println(a + "+" + c + "=" + (d / e));
					break;
				}
			}

			String sum1 = Integer.toString(sum);
			String min1 = Integer.toString(min);
			String dou1 = Integer.toString(dou);
			String per1 = Integer.toString(per);

			if (b == 1) {

				str[i] = sum1;
				System.out.println("����� �� ����");
				i++;
			}
			//
			// }
			if (b == 2) {
				str[i] = min1;
				System.out.println("����� �� ����");
				i++;

			}
			if (b == 3) {
				str[i] = dou1;
				System.out.println("����� �� ����");
				i++;
			}
			if (b == 4) {
				str[i] = per1;
				System.out.println("����� �� ����");
				i++;
			}
			System.out.println("����� ���� ��ȸ �Ͻðڽ��ϱ�?\n 1. �� 2. �ƴϿ�");
			int f = sc.nextInt();
			if (f == 1) {
				System.out.println("����� ����");
				for (j = 0; j < i; j++) {
					System.out.println(str[j]);
				}
			}

		}

	}

}