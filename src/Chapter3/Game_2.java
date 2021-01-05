package Chapter3;

import java.util.Scanner;

public class Game_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int warrior, elf, magic;
		String s_a, s_b, s_c; 
		int poison = -2;
		
		System.out.println("직업을 선택하여 주세요");
		System.out.println("1.전사 , 2.엘프 , 3.마법사");
		int career = sc.nextInt();
		switch(career) {
		case 1:
			System.out.println("전사를 선택하셨습니다");
			break;
		case 2:
			System.out.println("엘프를 선택하셨습니다");
			break;
		case 3:
			System.out.println("마법사를 선택하셧습니다");
			break;
		}
		
		System.out.println("무기를 입력하시오");
		System.out.println("1.칼, 2.도끼, 3.망치");
		int wepon = sc.nextInt();
		
		switch(wepon) {
		case 1:
			System.out.println("칼을 선택하셨습니다");
			break;
		case 2:
			System.out.println("또끼를 선택하셨습니다");
			break;
		case 3:
			System.out.println("망치를 선택하셨습니다");
			break;
		}
		
		System.out.println("독을 바르시겠습니까?");

		System.out.println("1.독을 바른다 2. 바르지않는다");
		int poison_pp = sc.nextInt();
		
		
		
		
		
		
		
	}

}
