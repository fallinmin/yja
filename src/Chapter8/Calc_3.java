package Chapter8;

import java.util.Scanner;

public class Calc_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//�װ����� ����
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		boolean run = true;
		int re=0;
		String giho= "";
		while(run) {
		System.out.println("���� ����Ͻðڽ��ϱ�?");
		a = sc.nextInt();
		int num[] = new int[a];
		for(int i =0;i<a;i++) {
			System.out.println(i+1+"��° ���ڸ� �Է�");
			num[i] = sc.nextInt();
			
		}
		System.out.println("��ȣ�� �Է��Ͻÿ�.");
		giho = sc.next();
		
		for(int i =0;i<a;i++) {
			if(i==0) {
				b = num[i];
			}else {
			if(giho.equals("+")) {
				b += num[i];
			}else if(giho.equals("-")) {
				b -= num[i];
			}else if(giho.equals("*")) {
				b *= num[i];
			}else if(giho.equals("/")) {
				b /= num[i];
			}
			}
		}

		if(giho.equals("=")){
			System.out.println("�����: "+b);
		}
		System.out.println("�ٽ� ����Ͻðڽ��ϱ�? 1.���� 2.����");
			re= sc.nextInt();
			
			if(re==1) {
			b = 0;
			}else if(re==2) {
				run =!run;
				System.out.println("�����Ͽ����ϴ�.");
				
			}
		}
		
	}

}
