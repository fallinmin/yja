package Chapter8;

import java.util.Scanner;

public class Calc_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int result = 0;
		int a,b,c;

		while(run) {
			System.out.println("몇항을 계산하시겟습니까?");
			int seq = sc.nextInt();
			int num[] = new int[seq];
			for(int i =0;i<seq;i++) {
				System.out.println(i+1+"번째 숫자를 입력");
				num[i] = sc.nextInt();
			}
			System.out.println("기호를 입력하시오");
			String cal = sc.next();
			switch(cal) {
			case "+":
				for(int i=0;i<seq;i++) {
					if(i==0) {
						result = num[i];
					}else {
						result += num[i];
					}
				}
				System.out.println("결과값:"+result);
				break;
			case "-"	:
				for(int i=0;i<seq;i++) {
					if(i==0) {
						result = num[i];
					}else {
						result -= num[i];
					}
				}
				System.out.println("결과값:"+result);
				break;
			case "*"	:
				for(int i=0;i<seq;i++) {
					if(i==0) {
						result = num[i];
					}else {
						result *= num[i];
					}
				}
				System.out.println("결과값:"+result);
				break;
			case "/"	:
				for(int i=0;i<seq;i++) {
					if(i==0) {
						result = num[i];
					}else {
						result /= num[i];
					}
				}
				System.out.println("결과값:"+result);
				break;
			}
			
			
			
			
			
		}
	}

}
