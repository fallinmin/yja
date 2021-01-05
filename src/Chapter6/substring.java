package Chapter6;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String gj[] = new String[5];
		int j =0;
		System.out.println("글자를 입력하여 주세요");
		String aa = sc.nextLine();
		String bb= "";
		
		System.out.println(aa.length());
		if(aa.length()%2 ==1) {
		aa= aa+" ";
		}
		System.out.println(aa.length());
		for(int i=0;i<aa.length();i++) {
			bb = aa.substring(i,i+2);
			gj[j] = bb;
			i++;
			System.out.println(gj[j]);
			j++;
		}
		
	}

}
