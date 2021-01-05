package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tuksoo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\number_1.txt");
		try {
		
		Scanner sc = new Scanner(file);
		
		String tuksoo= sc.nextLine();
		
		String ss = "";
		String dd = "";
	/*	String ss[] = tuksoo.split("\\+|\\-|\\*");
		for(int i =0;i<ss.length;i++) {
			System.out.println(ss[i]);
		}
	*/	
		int io = tuksoo.indexOf("+");
		String plus = tuksoo.substring(io,io+1);
		String sub_1 = tuksoo.substring(0,io);
		String sub_2 = tuksoo.substring(io+1,tuksoo.length());
		
		System.out.println(sub_1+sub_2);
		

		
		
		
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}

}
