package _dd;

import java.util.Scanner;

public class class_main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Ŭ����");
		smartphone sc = new smartphone();
		System.out.println(sc.ap);
		
		boolean run = true;
		while(run) {
			int floor =1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1.��ĭ �ö󰡱� 2.��ĭ�������� 3.���� ���ϱ�");
		int flo = sc1.nextInt();
		
		if(flo==1) {
			System.out.println(elevator.up(floor));
		}else if(flo==2){
			System.out.println(elevator.down(floor));
		}else if(flo==3){
			System.out.println("���������� ������ ������");
			int aa= sc1.nextInt();
			System.out.println(elevator.sel(aa));;
		}

		
		
		}
	}

}
