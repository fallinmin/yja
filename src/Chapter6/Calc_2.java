package Chapter6;

import java.util.Scanner;

public class Calc_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ù��°���� �Է��Ͻÿ�");
		int a1 = sc.nextInt();
		System.out.println("���� �ι�°���� �Է��Ͻÿ�");
		int a2 = sc.nextInt();
		
		int hap = a1*a2;
		
		if(hap%2==0) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
	}

}
