package Test_1230_1;

import java.util.Scanner;

public class Coding_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("tv");
		boolean run = true;
		int ch =1;
		int vo =1;
		
		while(run) {
			System.out.println("�޴��� �����Ͽ� �ּ���");
			System.out.println("============================");
			System.out.println("1.ä�μ��� 2.�������� 3.TV���� Ű��");
			System.out.println("============================");
			System.out.print("����: ");
			int select = sc.nextInt();
			if(select ==1) {
				System.out.println("ä���� �����մϴ�");
				System.out.print("����: ");
				int ch_select = sc.nextInt();
				ch =ch_select;
				System.out.println(ch_select+"������ ä���� ���õǾ����ϴ�");
				
			}else if(select ==2) {
				System.out.println("������ �����մϴ�");
				System.out.print("����: ");
				int vo_select = sc.nextInt();
				vo = vo_select;
				System.out.println(vo);
			}else if(select ==3) {
				System.out.println("TV����");
				System.out.println("�����Ϸ��� 1���� �����ּ���");
				int power = sc.nextInt();
				if(power ==1) {
					run = false;
				}
			}
				
			
		}
	}

}
