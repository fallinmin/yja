package Chapter5;

import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("������ �ܼ��� �Է��Ͻÿ�");
			int dansu = sc.nextInt();
			
			for(int i =1;i<=9;i++) {
				System.out.println(dansu+"X"+i+" = "+dansu*i );
			}
			System.out.println("����Ͻðڽ��ϱ�? 1��� 2.�ߴ�");
			int run_select = sc.nextInt();
			
			if(run_select==1) {
				System.out.println("���");
			}else {
				System.out.println("�ߴ�");
				 run = !run;
			}
			
		
		}
		
	}

}
