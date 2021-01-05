package sook;

import java.util.Scanner;

public class _13 {


	public static String getRole(int age) {
		   String aa ="";
				if(age>=18) {
					aa = "성인";
		        }else if(age>=13) {
		        	aa = "청소년";
		        }else if(age>=6) {
		        	aa = "어린이";
		        }else if(age<=5) {
		        	aa = "유아";
		        	
		        }
		   return aa;
	}
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int age = input.nextInt();
		 String role = getRole(age);
		 System.out.println(role);
	}
//	성인: 만 18세 이상
//	청소년: 만 13세 이상
//	어린이: 만 6세 이상
//	유아: 만 5세 이하

}
