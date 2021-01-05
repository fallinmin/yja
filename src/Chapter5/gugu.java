package Chapter5;

import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("구구단 단수를 입력하시오");
			int dansu = sc.nextInt();
			
			for(int i =1;i<=9;i++) {
				System.out.println(dansu+"X"+i+" = "+dansu*i );
			}
			System.out.println("계속하시겠습니까? 1계속 2.중단");
			int run_select = sc.nextInt();
			
			if(run_select==1) {
				System.out.println("계속");
			}else {
				System.out.println("중단");
				 run = !run;
			}
			
		
		}
		
	}

}
