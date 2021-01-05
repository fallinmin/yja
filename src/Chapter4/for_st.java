package Chapter4;

import java.util.Scanner;

public class for_st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int i =0;
		int dan = 0;
		
		
		System.out.println("몇단을 하시겠습니까?");
		dan = in.nextInt();
		
		for(i =1;i<=9;i++) {
			System.out.println(dan+" X "+i+" = "+dan*i);
		}
		System.out.println();
		System.out.println();
		for(i =9;i>=1;i--) {
			System.out.println(dan+" X "+i+" = "+dan*i);
		}
		
		
	}

}
