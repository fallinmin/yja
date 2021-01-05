package Test_1230_1;
import java.util.Scanner;
public class Coding_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("스마트폰");
		boolean run = true;
		Coding_8_1 scan = new Coding_8_1();
		while(run) {
			System.out.println("스마트폰에 오신것을 환영합니다");
			Coding_8_1 smart = new Coding_8_1();
			smart.Scan();
			Scanner sc = new Scanner(System.in);
			System.out.println("전원끄기는 1번 초기화면은 숫자 아무키나 누르세요");
			int power = sc.nextInt();
			if(power==1) {
				run = false;
			}	
			
			
			
		}
	}

}

