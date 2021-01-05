package Chapter7;

import java.util.Scanner;

public class interstella_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하시오");
		char[] str = sc.next().toCharArray();

		for(int i =0;i<str.length();i++) 
			a= sip.charAt(i);
			int aa = ((int)a);
			String binaryString = Integer.toBinaryString(aa);
			
			System.out.println(binaryString);
			for(int i =0;i<binaryString.length();i++) {
				
				if(binaryString.charAt(i)==b) {
					System.out.print("-");
				}else {
					System.out.print("ㅇ");
				}
			}
			
		}

	}

	}

}
