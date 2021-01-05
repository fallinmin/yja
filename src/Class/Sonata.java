package Class;

public class Sonata {
	int km = 200;
	String name = "Sonata";
	String brand = "Hyundai";
	boolean tune = true;
	
	public Sonata(int km, boolean tune){
		this.km = 300;
		this.tune = false;
		run(km, tune);
	}
	
	public static void run(int km, boolean tune) {
		System.out.println("차의 최고속도는"+km);
	}
	
	
}
