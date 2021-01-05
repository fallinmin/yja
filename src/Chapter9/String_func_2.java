package Chapter9;

import java.util.Random;
import java.util.Scanner;

public class String_func_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		int a = sc.nextInt();
		dice(a);
		int dice = rdm.nextInt(5)+1;
		System.out.println(dice);

		
		
		
	}
	
	public static int dice(int a){
		Random rdm = new Random();
		int gap[] = new int[a];
		int dice = rdm.nextInt(5)+1; 
		for(int i=0;i<gap.length;i++) {
			gap[i] = dice;
		}
	}
	
	public static int dice_2(int a, int b) {
		
	}

}
