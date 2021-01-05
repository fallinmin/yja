package Chapter7;

import java.util.Scanner;

public class inter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();

		String[] array = new String[10];
		
		int k = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			String sub = str.substring(i, i+1);
			char ch = sub.charAt(0);
			
			String binaryString = Integer.toBinaryString(ch);
			
			System.out.println( ch + "에 대한 2진수 : " +binaryString);
			

			for(int j = 0; j < binaryString.length(); j++)
			{
				String sub_1 = binaryString.substring(j, j+1);
				
				char ch_1 = sub_1.charAt(0);
				
				if(ch_1 == 49)
				{
					System.out.print(" ! ");
				}
				else
				{
					System.out.print(" - ");
				}
			}
			System.out.println("");
		} 
	}
	

}
