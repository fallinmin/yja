package Chapter7;

import java.util.Scanner;

public class ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ܹ��� �ֹ� �޴�");
		Scanner sc = new Scanner(System.in);
		int select, set_select, burger_select, side_select = 0;
		int all_sum =0;
		
		boolean run = true;
		int S_wopper =5000;
		int S_c_wopper =6000;
		int S_bigmac = 5000;
		int S_b_buck = 4000;
		
		int wopper =2000;
		int c_wopper =3000;
		int bigmac = 2000;
		int b_buck = 1000;
		
		int ch_ball = 1000;
		int gamtui = 1500;
		int hashb = 2000;
		int ch_stick = 1000;
		
		
		while(run) {
		System.out.println("1.��Ʈ 2.���� 3.���̵�޴� 4.����");
		select = sc.nextInt();
			
			while(select==1) {	
				System.out.println("1.���ۼ�Ʈ 5000��");
				System.out.println("2.ġ����ۼ�Ʈ 6000��");
				System.out.println("3.��Ƽ�Ʈ 5000��");
				System.out.println("4.�Ұ����ż�Ʈ 4000��");
				System.out.println();
				System.out.println();
				System.out.println("��Ʈ�� �����Ͽ� �ּ���");
				set_select = sc.nextInt();
					if(set_select==1) {
						all_sum+=S_wopper;
					}else if(set_select==2) {
						all_sum+=S_c_wopper;
					}else if(set_select==3) {
						all_sum+=S_bigmac;
					}else if(set_select==4) {
						all_sum+=S_b_buck;
					}
				System.out.println("���� �޴��� �������ּ���");
				System.out.println("2.�ܹ���, 3.���̵� 0.���ÿϷ�");
				select=sc.nextInt();
				
			}
			while(select==2) {
				System.out.println("1.���� ");
				System.out.println("2.ġ�����");
				System.out.println("3.���");
				System.out.println("4.�Ұ��");
				System.out.println("�ܹ��Ÿ� �����Ͽ� �ּ���");
				burger_select =sc.nextInt();
				if(burger_select==1) {
					all_sum+=wopper;
				}else if(burger_select==2) {
					all_sum+=c_wopper;
				}else if(burger_select==3) {
					all_sum+=S_c_wopper;
				}else if(burger_select==4) {
					all_sum+=b_buck;
				}
				System.out.println("1.��Ʈ 2.�ܹ���, 3.���̵� 0.���ÿϷ�");
				select = sc.nextInt();
				
			}
			while(select==3) {
				System.out.println("1.ġ�");
				System.out.println("2.����Ƣ��");
				System.out.println("3.�ؽ�����");
				System.out.println("4.ġ�ƽ");
				System.out.println("���̵带 �����Ͽ� �ּ���");
				side_select =sc.nextInt();
				if(side_select==1) {
					all_sum+=ch_ball;
				}else if(side_select==2) {
					all_sum+=gamtui;
				}else if(side_select==3) {
					all_sum+=hashb;
				}else if(side_select==4) {
					all_sum+=ch_stick;
				}
				System.out.println("1.��Ʈ 2.�ܹ���, 3.���̵� 0.���ÿϷ�");
				select = sc.nextInt();
			}
			if(select==0) {
				System.out.println("����Ͻ� ���� "+all_sum+"�Դϴ�");
				
				run= !run;
			}

			
		}
		
		
		
	}

}
