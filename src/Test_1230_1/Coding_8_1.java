package Test_1230_1;

import java.util.Scanner;

public class Coding_8_1 {

	public static void Scan() {
		System.out.println("1.전화번호부 2.전화걸기 3.시간 확인 4.인터넷 검색");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		if (menu == 1) {
			book();
		} else if (menu == 2) {
			System.out.println("전화를 거실분의 이름을 입력하세요");
			String men = sc.next();
			call(men);
		} else if (menu == 3) {
			clock();
		} else if (menu == 4) {
			internet();
		}
	}

	public static void book() {
		Scanner sc = new Scanner(System.in);
		String books[] = { "이창민", "홀길동", "김철수" };
		System.out.println("1.전화번호부 확인 2.나가기"); 
		int call = sc.nextInt();
		if (call == 1) {
			for (int i = 0; i < books.length; i++) {
				System.out.println(books[i]);
			}
		}

	}

	public static void call(String men) {
		System.out.println(men + "님에게 전화를 겁니다");

	}

	public static void clock() {
		System.out.println("현재시각은 10시10분입니다");
	}

	public static void internet() {
		System.out.println("구글");
	}

}
