package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		File file = new File("c:\\number.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[] = str.split("-| |@");
			for(int i =0;i<array.length;i++) {
				System.out.println(array[i]+"X"+array[i+1]+"="+array[i+2]);
			i+=2;}
		}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
