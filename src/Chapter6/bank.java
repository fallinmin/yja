package Chapter6;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hyun = 5000;
		int select = 0;
		int ipgum = 0;
		int chul = 0;
		boolean run = true;
		while(run) {
		System.out.println("���࿡ ���Ű��� ȯ���մϴ�");
		System.out.println("--------------------");
		System.out.println("���Ͻô� ������ �����ϼ���");
		System.out.println("1. �Ա�  2.���  3.��ȸ 4.����");
		select = sc.nextInt();
		if(select == 1) {
			System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
			ipgum = sc.nextInt();
			hyun = hyun + ipgum;
			System.out.println(ipgum+"�� �� �Ա��ϼ̽��ϴ�");
			System.out.println("�ܾ�:"+hyun+"��");
			System.out.println("--------------------");
		}else if(select == 2) {
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
			chul = sc.nextInt();
			hyun = hyun - chul;
			System.out.println("--------------------");
			if(hyun<=0) {
				System.out.println("�ܾ��� ���� ���̻� ����ϽǼ� �����ϴ�");
				hyun = 0;
			}else {
			System.out.println(chul+"�� ����ϼ̽��ϴ�");}
			System.out.println("�ܾ�:"+hyun+"��");
		}else if(select == 3) {
			System.out.println("��ȸ");
			System.out.println("�ܾ�:"+hyun+"��");
			System.out.println("--------------------");
		}else if(select == 4) {
			System.out.println("����");
			run = false;}
		else {
			System.out.println("�߸� �����ϼ̽��ϴ�");
		}
		
	}

}
}