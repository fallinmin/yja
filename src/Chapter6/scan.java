package Chapter6;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 문자를 입력하시오");
			String a = sc.nextLine();
			System.out.println("두번째 문자를 입력하시오");
			String b = sc.nextLine();
			
			if(a.equals(b)) {
				System.out.println("두개의 숫자가 같습니다");
			}else {
				System.out.println("두개의 숫자가 다릅니다");
			}
	}

}
