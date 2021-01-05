package Chapter9;

import java.util.Scanner;

public class cine {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie_title[] =new String[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("장르 1.SF 2.Action 3.Mello");
		int genre = sc.nextInt();
		
		switch(genre) {
		case 1:
			System.out.println("영화를 선택해주세요");
			int a = sc.nextInt();
			sf(a);
			break;
		case 2:
			System.out.println("영화를 선택해주세요");
			int b = sc.nextInt();
			act(b);
		case 3:
			System.out.println("영화를 선택해주세요");
			int c = sc.nextInt();
			mello(c);
		}
	}
	
	public static String[] sf(int i) {
		
		String title[] = {"인터스텔라","마션","sf1"};
		
		return title;
	}
	
	public static String[] act(int i) {
		String title[] = {"액션1","액션2","액션3"};
		
		return title;
		
	}
	public static String[] mello(int i) {
		String title[] = {"멜로1","멜로2","멜로3"};
		
		return title;
	}

}
