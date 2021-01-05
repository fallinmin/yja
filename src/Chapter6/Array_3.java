package Chapter6;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longest = 0;
		String word = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter String of Text");
		String b = sc.nextLine();
		String c[] = b.split("@");
		System.out.println(c.length);
		System.out.println(c[0]);
		System.out.println(c[1]);
		for(int i =0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
