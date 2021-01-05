package Chapter7;

import java.util.Scanner;

public class ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("햄버거 주문 메뉴");
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
		System.out.println("1.세트 2.버거 3.사이드메뉴 4.음료");
		select = sc.nextInt();
			
			while(select==1) {	
				System.out.println("1.와퍼세트 5000원");
				System.out.println("2.치즈와퍼세트 6000원");
				System.out.println("3.빅맥세트 5000원");
				System.out.println("4.불고기버거세트 4000원");
				System.out.println();
				System.out.println();
				System.out.println("세트를 선택하여 주세요");
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
				System.out.println("다음 메뉴를 선택해주세요");
				System.out.println("2.햄버거, 3.사이드 0.선택완료");
				select=sc.nextInt();
				
			}
			while(select==2) {
				System.out.println("1.와퍼 ");
				System.out.println("2.치즈와퍼");
				System.out.println("3.빅맥");
				System.out.println("4.불고기");
				System.out.println("햄버거를 선택하여 주세요");
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
				System.out.println("1.세트 2.햄버거, 3.사이드 0.선택완료");
				select = sc.nextInt();
				
			}
			while(select==3) {
				System.out.println("1.치즈볼");
				System.out.println("2.감자튀김");
				System.out.println("3.해쉬브라운");
				System.out.println("4.치즈스틱");
				System.out.println("사이드를 선택하여 주세요");
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
				System.out.println("1.세트 2.햄버거, 3.사이드 0.선택완료");
				select = sc.nextInt();
			}
			if(select==0) {
				System.out.println("계산하실 돈은 "+all_sum+"입니다");
				
				run= !run;
			}

			
		}
		
		
		
	}

}
