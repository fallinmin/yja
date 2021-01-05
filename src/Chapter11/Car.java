package Chapter11;

public class Car {
	String color = "";
	int dollor = 0;
	int gaesoo =0;
	
	public Car(String color,int dollor,int gaesoo) {
		this.color = color;
		this.dollor =dollor;
		this.gaesoo = gaesoo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDollor() {
		return dollor;
	}

	public void setDollor(int dollor) {
		this.dollor = dollor;
	}

	public int getGaesoo() {
		return gaesoo;
	}

	public void setGaesoo(int gaesoo) {
		this.gaesoo = gaesoo;
	}
	
}
