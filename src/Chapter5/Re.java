package Chapter5;

import java.util.Scanner;

public class Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("나의 영문이름:");
		String name = in.next();
		int sum = 0;
		char name_hap = ' ';
		for(int i = 0;i<name.length();i++) {
			name_hap += name.charAt(i);
			int sum_s += name_hap;
		}
		System.out.println(name_hap);
	}

}
