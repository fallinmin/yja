package book;

import java.util.Scanner;

public class mee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		book bo = new book(title, 30);
		for(int i=0;i<bo.note.length();i++) {
			String sub = bo.note.substring(i,i+1);
			System.out.println(sub);
		}
		for(int i =1;i<=bo.page;i++) {
			System.out.println(bo.title+i+"페이지");
		}
		System.out.println("다읽었다");
		System.out.println(bo.note);
	}
}

