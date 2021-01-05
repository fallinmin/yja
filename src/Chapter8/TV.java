package Chapter8;

import java.util.Scanner;

public class TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Ch_up, Ch_down;
		int state_Ch =1;
		int state_Vo = 10;
		int TV = 0;
		int Ch = 0;
		int Vo_up, Vo_down;
		boolean Stanby = true;
		int Stanby_num = 0;
		boolean code = true;
		while(code) {
			System.out.println("1. tv켜기 2. 코드뽑기");
			TV = sc.nextInt();
			if(TV==2) {
			System.out.println("코드뽑힘");
				code = !code;
			}
		while(TV==1) {
			System.out.println("전원 켬");
			System.out.println("현재채널: "+state_Ch+"   현재볼륨: "+state_Vo);
			System.out.println();
			System.out.println();
			System.out.println();
			while(Stanby) {
			System.out.println("1.채널up 2.채널down 3.볼륨up 4.볼륨down 5.채널선택 6.TV끔");
			Stanby_num = sc.nextInt();
			
			
			if(Stanby_num==1) {
				state_Ch++;
				if(state_Ch>=100) {
					state_Ch = 100;
				}
				System.out.println("-------------------------------------");
				System.out.println("현재채널: "+state_Ch+"   현재볼륨: "+state_Vo);
				System.out.println();
				System.out.println();
				System.out.println();
				
			}else if(Stanby_num==2) {
				state_Ch--;
				if(state_Ch<=0) {
					state_Ch = 1;
				}
				System.out.println("-------------------------------------");
				System.out.println("현재채널: "+state_Ch+"   현재볼륨: "+state_Vo);
				System.out.println();
				System.out.println();
				System.out.println();
				
			}else if(Stanby_num==3) {
				state_Vo++;
				if(state_Vo>=40) {
					state_Vo = 40;
				}
				System.out.println("-------------------------------------");
				System.out.println("현재채널: "+state_Ch+"   현재볼륨: "+state_Vo);
				System.out.println();
				System.out.println();
				System.out.println();
				
			}else if(Stanby_num==4) {
				state_Vo--;
				if(state_Vo<0) {
					state_Vo = 0;
				}
				System.out.println("-------------------------------------");
				System.out.println("현재채널: "+state_Ch+"   현재볼륨: "+state_Vo);
				System.out.println();
				System.out.println();
				System.out.println();
				
			}else if(Stanby_num==5) {
				Ch = sc.nextInt();
				state_Ch = Ch;
				if(state_Ch>100) {
					System.out.println("100보다 큰 채널은 돌릴수 없습니다");
					state_Ch =Ch;
					
				}
				System.out.println("-------------------------------------");
				System.out.println("현재채널: "+state_Ch+"   현재볼륨: "+state_Vo);
				System.out.println();
				System.out.println();
				System.out.println();
				
			}else if(Stanby_num==6) {
				Stanby = !Stanby;
				System.out.println("전원 끔");
			}
			
			}
		}
		
		}
		
	}

}
