package login;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		data data = new data();
		System.out.println("ȸ������");
		System.out.println("=================================");
		System.out.println("ID�� �Է��ϼ���");
		String id = sc.next();
		if(id.length()<6) {
			data.setId(id);
		}else {
			System.out.println("���̵�� 6�� ���� �ٽ� �Է����ּ���");
		}
		
		System.out.println("�̸� �Է��ϼ���");
		String name = sc.next();

		if(name.length()<4) {
			data.setName(name);
		}else {
			System.out.println("�̸��� 4������ �ٽ� �Է����ּ���");
		}
		
		System.out.println("��й�ȣ�� �Է��ϼ���");
		int pass = sc.nextInt();
		
		String pass_str = String.valueOf(pass);
		if(pass_str.length()<8) {
			data.setPass(pass);
		}else {
			System.out.println("��й�ȣ�� 8������ �ٽ� �Է����ּ���");
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
