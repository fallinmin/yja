package moonjae;

abstract class Car{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
}


class Sedan extends Car{
	
}

class Truck extends Car{
	
}

public class ex_448_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super.
		Sedan sedan1 = new Sedan();
		System.out.println("�¿��� �ν��Ͻ� ����~~~");
		Truck truck1 = new Truck();
		System.out.println("Ʈ�� �ν��Ͻ� ����");
	}

}
