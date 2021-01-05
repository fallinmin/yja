package Chapter5;

import java.util.Scanner;

public class Car_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("차량을 선택하여 주세요 1.포르쉐 2.벤츠 3.소나타");
		int car_num = sc.nextInt();
		String car_name = "";
		int acc_speed = 0;
		int break_speed =0;
		int max_speed =200;
		
		
		
		
		
		switch() {
		case:1
			car_name = "포르쉐";
			acc_speed = 5;
			break_speed
			max_speed
			break;
	}
		
		System.out.println(car_name+"을 선택하셨네요");
		System.out.println("-------------------------------------------");
		System.out.println("어떻게 하시겠습니까?(1.가속 2.감속");
		int status = sc.nextInt();
		switch(status) {
		case 1:
			speed = speed +acc_speed;
			System.out.println("현재속도는"+speed);
		}
}
