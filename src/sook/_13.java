package sook;

import java.util.Scanner;

public class _13 {


	public static String getRole(int age) {
		   String aa ="";
				if(age>=18) {
					aa = "����";
		        }else if(age>=13) {
		        	aa = "û�ҳ�";
		        }else if(age>=6) {
		        	aa = "���";
		        }else if(age<=5) {
		        	aa = "����";
		        	
		        }
		   return aa;
	}
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int age = input.nextInt();
		 String role = getRole(age);
		 System.out.println(role);
	}
//	����: �� 18�� �̻�
//	û�ҳ�: �� 13�� �̻�
//	���: �� 6�� �̻�
//	����: �� 5�� ����

}
