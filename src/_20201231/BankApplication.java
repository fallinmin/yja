package _20201231;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("==================================");
			System.out.println("1.���� ���� 2.���¸�� 3.���� 4.��� 5.����");
			System.out.println("==================================");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			}else if(selectNo ==2) {
				AcoountList();
			}else if(selectNo ==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
		
	}
	private static void createAccount() {
		
	}
	private static void AcoountList() {
		
	}
	private static void deposit() {
		
	}
	private static void withdraw() {
		
	}
	
	private static Account findAccount(String ano) {
		//
	}
}