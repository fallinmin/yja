package Chapter8;

import java.util.Scanner;

public class Calc_lll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=0,b,c;
		String giho = "";
		boolean run = true;
		boolean b_giho = false;
		int summary = 0;
		while(run) {
			if(b_giho==false) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
			a = sc.nextInt();
			System.out.println("�����ڸ� �Է��Ͻÿ�");
			giho = sc.next();
			System.out.println("�ι�°���ڸ� �Է��Ͻÿ�");
			b = sc.nextInt();
			

			switch(giho) {
			case "+":
				summary = a+b;
				break;
			case "-":
				summary = a-b;
				break;
			case "*":
				summary = a*b;
				break;
			case "/":
				summary = a/b;
				break;
			}
			}
			else {
				System.out.println("�ι�° �Է°�");
				b = sc.nextInt();
			
			System.out.println("�����ڸ� �Է��Ͻÿ�");
			giho = sc.next();
			switch(giho) {
			case "+":
				System.out.println(summary+b);
				summary = a+b;
				break;
			case "-":
				System.out.println(summary-b);
				summary = a-b;
				break;
			case "*":
				System.out.println(summary*b);
				summary = a*b;
				break;
			case "/":
				System.out.println(summary/b);
				summary = a/b;
				break;
			case "=":
				run =!run;
				System.out.println(summary+"�Դϴ�");
				break;
			}
			}
		}b_giho = true;
		b = summary;
			
		
	}

}
