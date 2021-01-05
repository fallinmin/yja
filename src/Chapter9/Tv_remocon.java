package Chapter9;

import java.util.Scanner;
public class Tv_remocon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Turn (1. On/2. Off)");
		int turn = sc.nextInt();
		int channel = 0;
		switch(turn) {
		case 1: 
			System.out.println("📺");			
				System.out.println("1. Channel Select   2. Vol control");
				int function = sc.nextInt();
				switch(function) {
				case 1:
					channel = Channel_select(channel);
					System.out.println(channel);	
				}		
			break;
		case 2: 
			System.out.println("🏮");
			break;
		}	
	}
	public static int Channel_select(int channel) {
		Scanner sc = new Scanner (System.in);
		System.out.println("1 : up  2 : down  3 : Input Channel number");
		int function = sc.nextInt();
		switch(function) {
		case 1: 
			channel = channel+1;
			break;
		case 2: 
			channel = channel-1;
			break;
		case 3: 
			System.out.println("Input Channel number");
			channel = sc.nextInt();
			break;
		}
		return channel;
	}
}

