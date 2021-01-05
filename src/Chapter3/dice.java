package Chapter3;

import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double diceRan = Math.random();
		double diceRan2 = Math.random();
		
		int dice1 =(int)(diceRan*6)+1;
		int dice2 =(int)(diceRan2*6)+1;
		
		
		
		int don;
		
		System.out.println("돈을 거시오");
		don = sc.nextInt();
		System.out.println("주사위 2개를 굴립니다");
		System.out.println(dice1);
		System.out.println(dice2);
		
		if(dice1>6) {
			dice1 = dice1 -1;
		}
		if(dice2>6) {
			dice2 = dice1 -1;
		}
		
		if(dice1==1&&dice2==1) {
			don = don*2;
			System.out.println("가지고 있는 돈의 2배 상승");
		}else if(dice1==2&&dice2==6) {
			don = don*4;
			System.out.println("가지고 있는 돈의 4배상승");
		}else if(dice1==6&&dice2==6) {
			don = don/2;
			System.out.println("가지고 있는 돈의 2배 감소");
		}
		System.out.println(don+"원이 남았습니다");
		
	}

}
