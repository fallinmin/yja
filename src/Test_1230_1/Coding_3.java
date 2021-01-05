package Test_1230_1;

import java.util.Random;
import java.util.Scanner;

public class Coding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
		
		Random ran = new Random(10);
		int d = (int)ran.nextInt(26);
		int e = c*d;
		System.out.println(e);
	}

}
