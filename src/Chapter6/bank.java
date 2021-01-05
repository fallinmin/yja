package Chapter6;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hyun = 5000;
		int select = 0;
		int ipgum = 0;
		int chul = 0;
		boolean run = true;
		while(run) {
		System.out.println("은행에 오신것을 환영합니다");
		System.out.println("--------------------");
		System.out.println("원하시는 업무를 선택하세요");
		System.out.println("1. 입금  2.출금  3.조회 4.종료");
		select = sc.nextInt();
		if(select == 1) {
			System.out.println("얼마를 입금하시겠습니까?");
			ipgum = sc.nextInt();
			hyun = hyun + ipgum;
			System.out.println(ipgum+"원 을 입금하셨습니다");
			System.out.println("잔액:"+hyun+"원");
			System.out.println("--------------------");
		}else if(select == 2) {
			System.out.println("얼마를 출금하시겠습니까?");
			chul = sc.nextInt();
			hyun = hyun - chul;
			System.out.println("--------------------");
			if(hyun<=0) {
				System.out.println("잔액이 없어 더이상 출금하실수 없습니다");
				hyun = 0;
			}else {
			System.out.println(chul+"을 출금하셨습니다");}
			System.out.println("잔액:"+hyun+"원");
		}else if(select == 3) {
			System.out.println("조회");
			System.out.println("잔액:"+hyun+"원");
			System.out.println("--------------------");
		}else if(select == 4) {
			System.out.println("종료");
			run = false;}
		else {
			System.out.println("잘못 선택하셨습니다");
		}
		
	}

}
}