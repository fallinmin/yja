package Chapter6;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
			String a = sc.nextLine();
			System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
			String b = sc.nextLine();
			
			if(a.equals(b)) {
				System.out.println("�ΰ��� ���ڰ� �����ϴ�");
			}else {
				System.out.println("�ΰ��� ���ڰ� �ٸ��ϴ�");
			}
	}

}
