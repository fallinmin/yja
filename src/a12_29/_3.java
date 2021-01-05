package a12_29;

import java.util.Scanner;

public class _3 {
	static int money = 10000;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ATM에 오신것을 환영합니다");
		boolean run = true;
		_3_1 money = new _3_1();

		while (run) {
			int minus = 0;
			int plus = 0;
			System.out.println("1. 조회 2. 출금 3. 입금");
			int start = scan.nextInt();
			if (start == 1) {
				check(money);
			} else if (start == 2) {
				CG(money);
			} else if (start == 3) {
				ig(money);
			}
		}
		
	}

	public static void check(_3_1 money) {
		System.out.println("잔액을 조회합니다");
		System.out.println("===========================");
		System.out.println("잔액은" + money.money + "원입니다");
	}

	public static void CG(_3_1 money) {
		System.out.println("출금합니다");
		System.out.println("===========================");
		System.out.println("얼마를 출금하시겠습니까?");
		System.out.print("원:");
		money.minus = scan.nextInt();
		money.money -= money.minus;
	}

	public static void ig(_3_1 money) {
		System.out.println("입금합니다");
		System.out.println("===========================");
		System.out.println("얼마를 입금하시겠습니까?");
		System.out.print("원:");
		money.plus = scan.nextInt();
		money.money += money.plus;
	} 

}
