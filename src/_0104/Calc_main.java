package _0104;

import java.util.Scanner;

public class Calc_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����");
		boolean run = true;

	}

	private static void input_operator(Calc_A nums) {
		Scanner sc= new Scanner(System.in);
		System.out.println("� ������ �Ͻðڽ��ϱ�?");
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
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		int num_1=sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		int num_2 = sc.nextInt();
		System.out.println("����° ���� �Է��Ͻÿ�");
		int num_3 = sc.nextInt();
		
		Calc_A num1 = new Calc_A();
		num1.num_1 = num_1;
		num1.num_2 = num_2; 
		num1.num_3 = num_3;
		
		nums[i]=num_1;
		
		}
	}

}
