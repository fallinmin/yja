package _0104;

import java.util.Scanner;

public class Calc_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("계산기");
		boolean run = true;

	}

	private static void input_operator(Calc_A nums) {
		Scanner sc= new Scanner(System.in);
		System.out.println("어떤 연산을 하시겠습니까?");
		String str = sc.nextLine();
		
		switch(str) {
		case "+":
			plus(nums);
			break;
		case "-":
			minus(nums);
			break;
		case "*":
			multiple(nums);
			break;
		case "/":
			divi(nums);
			break;
			
		}
	}
	private static void plus(Number[] nums) {
		for(int i=0;i<2;i++) {
			nums[i].sum = num_1+num_2+num_3+num_4;
		}
	}
	
	
	private static void input_num(Number[] nums) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
		System.out.println("첫번째 값을 입력하시오");
		int num_1=sc.nextInt();
		System.out.println("두번째 값을 입력하시오");
		int num_2 = sc.nextInt();
		System.out.println("세번째 값을 입력하시오");
		int num_3 = sc.nextInt();
		
		Calc_A num1 = new Calc_A();
		num1.num_1 = num_1;
		num1.num_2 = num_2; 
		num1.num_3 = num_3;
		
		nums[i]=num_1;
		
		}
	}

}
