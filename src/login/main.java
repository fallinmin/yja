package login;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		data data = new data();
		System.out.println("회원가입");
		System.out.println("=================================");
		System.out.println("ID를 입력하세요");
		String id = sc.next();
		if(id.length()<6) {
			data.setId(id);
		}else {
			System.out.println("아이디는 6자 이하 다시 입력해주세요");
		}
		
		System.out.println("이름 입력하세요");
		String name = sc.next();

		if(name.length()<4) {
			data.setName(name);
		}else {
			System.out.println("이름은 4자이하 다시 입력해주세요");
		}
		
		System.out.println("비밀번호를 입력하세요");
		int pass = sc.nextInt();
		
		String pass_str = String.valueOf(pass);
		if(pass_str.length()<8) {
			data.setPass(pass);
		}else {
			System.out.println("비밀번호는 8자이하 다시 입력해주세요");
		}
		System.out.println("=================================");
		System.out.print("Id: ");
		System.out.println(data.getId());
		System.out.print("Pass: ");
		System.out.println(data.getPass());
		System.out.print("Name: ");
		System.out.println(data.getName());
		
	}

}
