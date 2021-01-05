package Chapter8;

import java.util.Random;
import java.util.Scanner;

public class Chyar_rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		
		System.out.println("만들 글자 갯수를 입력");
		int gul = sc.nextInt();
		int run =0;
		int ac =0;
		String gatsoo[] = new String[gul];
	while(run<gul) {
		String dd[] = new String[gul];
		String randomStr = String.valueOf((char) ((int) (rdm.nextInt(26)) + 65));
		
		System.out.println(randomStr);
		run++;
		}
		
		
	}

}
