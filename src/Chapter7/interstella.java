package Chapter7;

import java.util.Scanner;

public class interstella {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하시오");
		String sip = sc.nextLine();
		String binaryString = "";
		char a =' ';
		char b =' ';

		for(int i =0;i<sip.length();i++) {
		a= sip.charAt(i);
		int aa = ((int)a);
		binaryString = Integer.toBinaryString(aa);
		System.out.println(binaryString);
		for(int j =0;j<binaryString.length();j++) {
			if(	binaryString.charAt(j)=='0') {
				System.out.print("-");
			}else {
				System.out.print("ㅇ");
			}
			
		}
		}

		
	
		
	}

}
