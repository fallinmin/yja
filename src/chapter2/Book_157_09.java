package chapter2;

import java.util.Scanner;

public class Book_157_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int bill_o = 0;
		
		System.out.println("## 교환할 돈은?");
		int bill = sc.nextInt();
				
				
		System.out.print("오백원짜리 ==>");
		bill_o = bill / 500;
		System.out.println(bill_o+"원");
		bill = bill%500; 
		System.out.print("백원짜리 ==>");
		bill_o = bill / 100;
		System.out.println(bill_o+"원");
		bill = bill%100; 
		System.out.print("오십원짜리 ==>");
		bill_o = bill / 50;
		System.out.println(bill_o+"원");
		bill = bill%50; 
		System.out.print("십원짜리 ==>");
		bill_o = bill / 10;
		System.out.println(bill_o+"원");
		bill = bill%10; 
		System.out.print("거스름돈 ==>");
		System.out.println(bill+"원");
		
	}

}
