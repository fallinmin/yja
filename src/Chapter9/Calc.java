package Chapter9;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("������ ����Ͻðڽ��ϱ�?");
		
		
		while(run) {
			System.out.println("����� �����ڸ� �Է��Ͻÿ�  +, -, * /");
			int giho = sc.nextInt();
			
			System.out.println("����� ���ڸ� �Է��Ͻÿ�");
			int number = sc.nextInt();
			
			switch(cal) {
			case("+"):
				for(int i =0;i<count;i++) {
					sum = plus(sum,num[i]);
				}
			case("-"):
				for(int i=0;i<count;i++) {
					sum = minus()
				}
			}
			 
		}
		
		
	}
	public static int plus(int sum, int num) {
		sum+=num;
		
		
		return sum;
	}
	
	private static int minus(int i,int sum,int num) {
		if(i==0) {
			sum = num;
		}else {
			sum -= num;
		}
		return sum;
	}

}
