package Chapter7;

import java.util.Random;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdm = new Random();
		Scanner sc = new Scanner(System.in);
		int speed = rdm.nextInt(50)+100;
		int ball = 0;
		int strike =0;
		int out = 0;
		boolean run = true;
		
		System.out.println("�߱����ӿ� ���Ű��� ȯ���մϴ�");
		while(run) {
		int dice_10_1 = rdm.nextInt(13)+1;
		System.out.println("������ ���� ������ �����Ͻð� ����ּ���");
		System.out.println("-------------------------------");
		System.out.println("|                             |");
		System.out.println("|  1          2           3   |");
		System.out.println("|                             |");
		System.out.println("|  4          5           6   |");
		System.out.println("|                             |");
		System.out.println("|  7          8           9   |");
		System.out.println("|                             |");
		System.out.println("-------------------------------");
		System.out.print("����: ");
		int select = sc.nextInt();
		System.out.println("�����ӵ��� ����ּ���");
		int select_speed = sc.nextInt();
		System.out.println("������ �������� "+dice_10_1+"�� �����Դϴ�");

		
		if(dice_10_1>9) {
			System.out.println("���Դϴ�");
			ball++;
		}
		if(ball>=4) {
			System.out.println("���� ����");
			ball = 0;
		}
		if(strike>2) {
			System.out.println("���� �ƿ�");
			strike = 0;
			out++;
		}
		if(out>=3) {
			
			System.out.println("���� ����");
			run = !run;
		}
		
		if(dice_10_1 ==select){
			System.out.println("�ƽ��ϴ�!!!!");
			if(speed==select_speed)  {
				System.out.println("Ȩ���Դϴ�!!!");
		}else {
			System.out.println("������ ���߽��ϴ�");
			System.out.println("��Ʈ����ũ!"
					+ "");
			strike++;
		}
		}
		
		
		System.out.println("-------------------------------");
		System.out.println("��"+ball+"��Ʈ����ũ"+strike+"�ƿ�"+out);
		System.out.println("-------------------------------");
		
		
		
		
		}
		
		
	}
}
