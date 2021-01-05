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
			System.out.println("메뉴를 선택하여 주세요");
			System.out.println("============================");
			System.out.println("1.채널선택 2.볼륨조절 3.TV끄고 키기");
			System.out.println("============================");
			System.out.print("선택: ");
			int select = sc.nextInt();
			if(select ==1) {
				System.out.println("채널을 선택합니다");
				System.out.print("선택: ");
				int ch_select = sc.nextInt();
				ch =ch_select;
				System.out.println(ch_select+"번으로 채널이 선택되었습니다");
				
			}else if(select ==2) {
				System.out.println("볼륨을 선택합니다");
				System.out.print("선택: ");
				int vo_select = sc.nextInt();
				vo = vo_select;
				System.out.println(vo);
			}else if(select ==3) {
				System.out.println("TV전원");
				System.out.println("종료하려면 1번을 눌러주세요");
				int power = sc.nextInt();
				if(power ==1) {
					run = false;
				}
			}
				
			
		}
	}

}
