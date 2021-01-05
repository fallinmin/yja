package moonjae;

class Car {
	protected String color;
	int speed;

}

class Sedan extends Car {
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void setolor(String color) {
		this.color = color;
	}

}

public class Ex_441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();

		sedan1.setSpeed(300);
		sedan1.setolor("»¡°­");
		System.out.println("½Â¿ëÂ÷ ¼Óµµ ==>" + sedan1.speed);
		System.out.println("½Â¿ëÂ÷ »ö»ó ==>" + sedan1.color);
	}

}
