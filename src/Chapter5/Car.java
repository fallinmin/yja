package Chapter5;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sokdo_max = 200;
		int sokdo = 0;
		int sokdo_ee = 0;
		//차종
		int porche =10;
		int benz = 8;
		int sonata = 5;
		int car=0;
		int car_select = 0;
		System.out.println("200KM 이상 과속으로 운행중지 됩니다");
		System.out.println("차를 선택하여 주세요 1.포르쉐 2.벤츠 3.소나타");
		car_select = sc.nextInt();
		switch(car_select) {
		case 1:
			car = porche;
			sokdo_max = 300;
			System.out.println("포르쉐를 선택하셨습니다");
			break;
		case 2:
			car = benz;
			sokdo_max = 250;
			System.out.println("벤츠를 선택하셨습니다");
			break;
		case 3:
			car = sonata;
			sokdo_max = 200;
			System.out.println("소나타를 선택하셨습니다");
			break;
		}
		
		System.out.println("출발 하시겠습니까? 1 출발 0 멈춤");
		int run = sc.nextInt();
		if(run==0) {
			System.out.println("출발하지 않으셨습니다 운행중지");
		}

		while(run==1) {
			System.out.println("주행을 선택하여 주세요");
			System.out.println("1.가속 2.감속 3.중지");
			sokdo_ee = sc.nextInt();
			if(sokdo_ee==1) {
				sokdo = sokdo +5+car;
				if(sokdo>=sokdo_max) {
					System.out.println("과속하셨습니다 운행종료.");
					sokdo = sokdo_max;
					run = (run = 0);
				}
				System.out.println("현재 속도 : "+sokdo+"KM");
			}else if(sokdo_ee==2) {
				sokdo = sokdo -5;
				if(sokdo<0) {
					System.out.println("정지하셨습니다 운행종료.");
					sokdo = 0;
					run = (run = 0);
				}System.out.println("현재 속도 : "+sokdo+"KM");
			}
			else if(sokdo_ee==3) {
						System.out.println("정지하셨습니다 운행종료.");
						run = (run = 0);
				System.out.println("현재 속도 : 0KM");
				
			}
		
			
			
		
		}
		
	}

}
