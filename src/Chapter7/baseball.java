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
		
		System.out.println("야구게임에 오신것을 환영합니다");
		while(run) {
		int dice_10_1 = rdm.nextInt(13)+1;
		System.out.println("투수가 던질 방향을 생각하시고 골라주세요");
		System.out.println("-------------------------------");
		System.out.println("|                             |");
		System.out.println("|  1          2           3   |");
		System.out.println("|                             |");
		System.out.println("|  4          5           6   |");
		System.out.println("|                             |");
		System.out.println("|  7          8           9   |");
		System.out.println("|                             |");
		System.out.println("-------------------------------");
		System.out.print("선택: ");
		int select = sc.nextInt();
		System.out.println("던질속도를 골라주세요");
		int select_speed = sc.nextInt();
		System.out.println("투수가 던진곳은 "+dice_10_1+"번 방향입니다");

		
		if(dice_10_1>9) {
			System.out.println("볼입니다");
			ball++;
		}
		if(ball>=4) {
			System.out.println("주자 진출");
			ball = 0;
		}
		if(strike>2) {
			System.out.println("주자 아웃");
			strike = 0;
			out++;
		}
		if(out>=3) {
			
			System.out.println("게임 종료");
			run = !run;
		}
		
		if(dice_10_1 ==select){
			System.out.println("쳤습니다!!!!");
			if(speed==select_speed)  {
				System.out.println("홈런입니다!!!");
		}else {
			System.out.println("맞추지 못했습니다");
			System.out.println("스트라이크!"
					+ "");
			strike++;
		}
		}
		
		
		System.out.println("-------------------------------");
		System.out.println("볼"+ball+"스트라이크"+strike+"아웃"+out);
		System.out.println("-------------------------------");
		
		
		
		
		}
		
		
	}
}
