package ClassDD;

public class Bus {
	 static int discount = 1200;
	public Bus() {
		
	}

	
	public static int Reader(int bus_card){
		bus_card = bus_card-discount;
		
		System.out.println("�����"+bus_card+"�� �Դϴ�");
		return bus_card;
	}
}
