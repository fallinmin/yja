package Burger;

public class men {
	 static int discount = 1200;
		public men() {
			
		}

		
		public static int Reader(int bus_card){
			bus_card = bus_card-discount;
			
			System.out.println("�����"+bus_card+"�� �Դϴ�");
			return bus_card;
		}
}
