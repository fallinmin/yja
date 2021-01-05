package _dd;

import java.util.Scanner;

public class class_main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("클래스");
		smartphone sc = new smartphone();
		System.out.println(sc.ap);
		
		boolean run = true;
		while(run) {
			int floor =1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1.한칸 올라가기 2.한칸내려가기 3.층수 정하기");
		int flo = sc1.nextInt();
		
		if(flo==1) {
			System.out.println(elevator.up(floor));
		}else if(flo==2){
			System.out.println(elevator.down(floor));
		}else if(flo==3){
			System.out.println("엘리베이터 층수를 고르세요");
			int aa= sc1.nextInt();
			System.out.println(elevator.sel(aa));;
		}

		
		
		}
	}

}
