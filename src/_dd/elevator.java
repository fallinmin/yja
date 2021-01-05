package _dd;

public class elevator {


	public static int up(int floor) {
		
		System.out.println("올라갑니다");
		floor++;
		return floor;
	}
	public static int sel(int aa2) {
		System.out.println("올라가실 층수를 누르셨습니다");
		System.out.println(aa2+"층으로 올라갑니다");
		return aa2;
		
	}
	public static int down(int floor) {
		System.out.println("내려갑니다");
		floor--;
		if(0<=floor) {
			floor = 1;
		}
		return floor;
	}
}
