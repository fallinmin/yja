package Chapter9;

import java.util.Scanner;

public class TV_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean turn =true;
		int power;
		int channel=0;
		int volume =20;
		System.out.println("TV 1.on 2.off");
		while(turn) {
			power = sc.nextInt();
			if(power ==2) {
				turn = !turn;
			}
			System.out.println("1.채널 선택 2.볼륨선택");
			int func = sc.nextInt();
			switch(func) {
			case 1:
				channel = Ch_select(channel);
				System.out.println(channel+"번 채널");
			
			break;
		case 2:
			volume = Vo_select(volume);
			System.out.println("볼륨:"+volume);
			break;
			}
		}
		
			
			
		}
	public static int Ch_select(int channel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널 선택 1.up 2.down 3.채널 선택");
		int func = sc.nextInt();
		switch(func) {
		case 1:
			channel = channel +1;
			if(channel>=100) {
				channel = 100;
			}
			break;
		case 2:
			channel = channel -1;
			if(channel<=0) {
				channel = 0;
			}
		case 3:
			System.out.println("채널 번호 입력");
			channel = sc.nextInt();
			break;
		}
		return channel;
	}
	public static int Vo_select(int volume) {
		Scanner sc = new Scanner(System.in);
		System.out.println("볼륨 선택 1.up 2.down");
		int func = sc.nextInt();
		switch(func) {
		case 1:
			volume = volume +1;
			if(volume>=100) {
				volume = 100;
			}
			break;
		case 2:  
			volume = volume-1;
			if(volume<=0) {
				volume = 0;
			}
			break;
		}
		return volume;
	}
	

}
