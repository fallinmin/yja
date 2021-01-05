package Chapter4;

import java.util.Scanner;

public class for_exa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String ss="";
		String ii = "";
		String jj="";
		String kk="";
		String str ="YangJung";
/*		
		if(str.contains("Yang")) {
			System.out.println("contain 대소문자 구분");
		}
		if(str.contains("yang")){
			System.out.println("contain 대소문자 구분 못함");
		}
		
		int i= str.indexOf("!");
		System.out.println("indexof의 인덱스 값"+i);

		boolean con = str.contains("Yang");
*/
		String str_1 = "AB1123";
		String str_2 = "AB34B";
		
		String StrNum = "";
		String StrNum2 = "";
		for(int i =0;i<str_1.length();i++) {
			ss = str_1.substring(i,i+1);
			
			if(ss.equals("1")||ss.equals("2")||ss.equals("3")||ss.equals("4")||ss.equals("5")||ss.equals("6")||ss.equals("7")||ss.equals("8")||
				ss.equals("9")){
					ii = ii+ss;
					
				}else {
					jj = jj+ss;
				}
		}System.out.println(ii);
		System.out.println(jj);
		
		
		
		
		for(int i=0;i<str_2.length();i++) {
			char c = str_2.charAt(i);
			int num = c;
				if(num>48&&num<57) {
					StrNum = StrNum + Character.toString(c);
				}else {
					kk = kk+c;
				}
				
		}System.out.println("\n"+StrNum);
		System.out.println(kk);
		
		
		
		
		
		
		
	}

}
