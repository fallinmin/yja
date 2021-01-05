package moonjae;

import java.util.Random;

public class dice {
	private int dice1;
	
	public int play_dice(int no) {
		Random rdm = new Random();
		int dice = rdm.nextInt();
		
		
		return dice;
	}

	public int getDice1() {
		return dice1;
	}

	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}
	
	
	
	
}
