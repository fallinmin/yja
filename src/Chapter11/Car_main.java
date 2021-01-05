package Chapter11;

public class Car_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("black",4000,4);
		
		car.setColor("yellow"); 
		System.out.println(car.color);
		car.setDollor(1000);
		System.out.println(car.dollor);
		car.setGaesoo(111);
		System.out.println(car.gaesoo);

		System.out.println(car.color+car.dollor+car.gaesoo); 
	}

} 

