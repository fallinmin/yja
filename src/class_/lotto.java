package class_;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdm = new Random();
		String sc[] = new String[6];

		
		dang(sc,dice);
		System.out.println(dice);
		
		
	}
	
	public static String[] dang(String[] sc, String dice) {
		for(int i =0;i<sc.length;i++) {
			
			sc[i] = dice;
		}
		return sc;					 		
	}
	
	
	
	
}
