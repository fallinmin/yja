package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\text.txt");
		File file_1 = new File("C:\\test.txt");
		try(FileWriter fileWriter = new FileWriter(file)) {
			Scanner sc = new Scanner(file_1);
			String str = "";
			String array[]=null;
			while(sc.hasNextLine()) {
				str = sc.nextLine();
				array = str.split("-|@| ");
			}
			PrintWriter pw= new PrintWriter(fileWriter);
			for(int i = 0;i<array.length;i++) {
				pw.print(array[i]);
			}
			pw.print("hello");
/*			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split("-|@");
				
				PrintWriter  pw = new PrintWriter(fileWriter);
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
					pw.print(array[i]);
					
				}
	*/		
			
		
			
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}

}
