package Chapter8;



		 import java.util.Scanner;

		 public class help {

		 	public static void main(String[] args) {
		 		// TODO Auto-generated method stub

		 		Scanner sc = new Scanner(System.in);
		 		boolean run = true;
		 		int volume = 0;
		 		String channel = "";

		 		System.out.println("1. Tv를 켠다.    2. Tv를 끈다.");
		 		int power = sc.nextInt();

		 		while (run) {

		 			switch (power) {

		 			case 1:
		 				System.out.println("1.[음량]  2.[채널]");
		 				int ri = sc.nextInt();

		 				if (ri == 1) {
		 					System.out.println(" [ + ]     [ - ] ");
		 					String vol = sc.next();

		 					if (vol.equals("+")) {
		 						volume++;

		 					} else if (vol.equals("-")) {
		 						volume--;
		 					}
		 					System.out.println("현재 음량은 :" + volume + "입니다.");
		 				}

		 				if (ri == 2) {

		 					System.out.println("1   2   3");
		 					System.out.println("4   5   6");
		 					System.out.println("7   8   9");
		 					System.out.println("    0    ");
		 					System.out.println("         ");
		 					System.out.println("[-]   [+]");
		 					System.out.println("         ");

		 					System.out.print("==>");

		 					String num = sc.next();
		 					int c = Integer.parseInt(num);
		 					if (c >= 0 && c <= 100) {
		 						channel = num;
		 						System.out.println("00000000");
		 					}
		 					System.out.println("010101010");
		 					switch (num) {
		 					case ("+"):
		 						System.out.println("1111111");
		 						if (channel.equals(null)) {
		 							System.out.println("222222222");
		 							channel = "0";
		 							System.out.println("3333333333");

		 						} else {
		 							System.out.println("4444444444");
		 							int num1 = Integer.parseInt(channel) + 1;
		 							System.out.println("555555555");

		 							channel = Integer.toString(num1);
		 							System.out.println(channel);
		 						}
		 					}

		 				}
		 				System.out.println("현재 채널은 " + channel + "번 입니다.");

		 			}

		 		}

		 	}
		 

	
		 	

}
