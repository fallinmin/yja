package sook;

import java.util.Scanner;

public class _7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int euro = sc.nextInt();
		int dollar = sc.nextInt();
		
		double eurRate = 1320.48026;
		double dollarRate = 1063.82979;
		
		int won = (int)(eurRate+dollar*dollarRate);
		System.out.println(won+"¿ø");
		
	}

}
