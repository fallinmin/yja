package Chapter9;

import java.util.Scanner;

public class TV_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("TV On_Off");
		int turn = sc.nextInt();
		int Ch_up, Ch_down;
		int state_Ch =1;
		int state_Vo = 10;
		int TV = 0;
		int channel;
		int volume;
		int Vo_up, Vo_down;
		boolean Stanby = true;
		int Stanby_num = 0;
		boolean code = true;
		boolean power = true;
		while(power) {
		switch(turn) {
		case 1: 
			System.out.println("1.채널선택 2.볼륨선택2.채널선택 4.끝");
			int func = sc.nextInt();
			switch(func) {
			case 1:
				tv_ch(func);
					
				break;
			case 2:
				
				tv_vol(func);
				break;
				
			case 3:
				tv_ch_s();
				break;
			case 4:
				power = !power;
				System.out.println("TV 끝");
			}
		}
		}
	}

	
	public static int tv_ch(int state_Ch) {
		Scanner sc = new Scanner(System.in);
		int state_Ch =1;
		System.out.println("채널 메뉴");
		System.out.println("1. Ch_up 2.Ch_down");
		int turn_2 = sc.nextInt();
		if(turn_2 ==1) {
			state_Ch++;
			System.out.println("현재 채널"+state_Ch);
			if(state_Ch>=100) {
				state_Ch = 100;
			}
			
		}else if(turn_2 ==2) {
			state_Ch--;
			System.out.println("현재 채널"+state_Ch);
			if(state_Ch<=0) {
				state_Ch = 1;
			}
			
		}
		return 0;
	}
	public static int tv_vol(int turn) {
		int state_Vo = 10;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("볼륨 메뉴");
		System.out.println("1. Vo_up 2. Vo_down");
		int turn_2 = sc.nextInt();
		if(turn_2 ==1) {
			state_Vo++;
			System.out.println("현재 볼륨"+state_Vo);
			if(state_Vo>=40) {
				state_Vo = 40;
			}
		}else if(turn_2 ==2) {
			state_Vo--;
			System.out.println("현재 볼륨"+state_Vo);
			if(state_Vo<0) {
				state_Vo = 0;
			}
		}
		return state_Vo;
	}
	
	
	public static int tv_ch_s() {
		int state_Ch =1;
		Scanner sc = new Scanner(System.in);
		int Ch = 0;
		System.out.println("채널 선택");
		Ch = sc.nextInt();
		state_Ch = Ch;
		System.out.println(state_Ch);
		
		return state_Ch;
	}

}
