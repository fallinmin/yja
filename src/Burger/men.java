package Burger;

public class men {
	 static int discount = 1200;
		public men() {
			
		}

		
		public static int Reader(int bus_card){
			bus_card = bus_card-discount;
			
			System.out.println("비용은"+bus_card+"원 입니다");
			return bus_card;
		}
}
