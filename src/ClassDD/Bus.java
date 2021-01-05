package ClassDD;

public class Bus {
	 static int discount = 1200;
	public Bus() {
		
	}

	
	public static int Reader(int bus_card){
		bus_card = bus_card-discount;
		
		System.out.println("비용은"+bus_card+"원 입니다");
		return bus_card;
	}
}
