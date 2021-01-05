package chapter2;

import java.util.Scanner;

public class If_marble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dice = Math.random();
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위를 골라주세요");
		int num = sc.nextInt();
		
		
		System.out.println(num+"면체 주사위를 굴립니다");
		
		int dice_num =(int)(dice*num)+1;
		
		if(dice_num >num) {
			System.out.println("주사위 값은"+(dice_num-1));		
		}else {
			System.out.println("주사위값은"+dice_num);
		}
	}

}



