package Chapter5;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sokdo_max = 200;
		int sokdo = 0;
		int sokdo_ee = 0;
		//����
		int porche =10;
		int benz = 8;
		int sonata = 5;
		int car=0;
		int car_select = 0;
		System.out.println("200KM �̻� �������� �������� �˴ϴ�");
		System.out.println("���� �����Ͽ� �ּ��� 1.������ 2.���� 3.�ҳ�Ÿ");
		car_select = sc.nextInt();
		switch(car_select) {
		case 1:
			car = porche;
			sokdo_max = 300;
			System.out.println("�������� �����ϼ̽��ϴ�");
			break;
		case 2:
			car = benz;
			sokdo_max = 250;
			System.out.println("������ �����ϼ̽��ϴ�");
			break;
		case 3:
			car = sonata;
			sokdo_max = 200;
			System.out.println("�ҳ�Ÿ�� �����ϼ̽��ϴ�");
			break;
		}
		
		System.out.println("��� �Ͻðڽ��ϱ�? 1 ��� 0 ����");
		int run = sc.nextInt();
		if(run==0) {
			System.out.println("������� �����̽��ϴ� ��������");
		}

		while(run==1) {
			System.out.println("������ �����Ͽ� �ּ���");
			System.out.println("1.���� 2.���� 3.����");
			sokdo_ee = sc.nextInt();
			if(sokdo_ee==1) {
				sokdo = sokdo +5+car;
				if(sokdo>=sokdo_max) {
					System.out.println("�����ϼ̽��ϴ� ��������.");
					sokdo = sokdo_max;
					run = (run = 0);
				}
				System.out.println("���� �ӵ� : "+sokdo+"KM");
			}else if(sokdo_ee==2) {
				sokdo = sokdo -5;
				if(sokdo<0) {
					System.out.println("�����ϼ̽��ϴ� ��������.");
					sokdo = 0;
					run = (run = 0);
				}System.out.println("���� �ӵ� : "+sokdo+"KM");
			}
			else if(sokdo_ee==3) {
						System.out.println("�����ϼ̽��ϴ� ��������.");
						run = (run = 0);
				System.out.println("���� �ӵ� : 0KM");
				
			}
		
			
			
		
		}
		
	}

}
