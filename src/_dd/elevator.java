package _dd;

public class elevator {


	public static int up(int floor) {
		
		System.out.println("�ö󰩴ϴ�");
		floor++;
		return floor;
	}
	public static int sel(int aa2) {
		System.out.println("�ö󰡽� ������ �����̽��ϴ�");
		System.out.println(aa2+"������ �ö󰩴ϴ�");
		return aa2;
		
	}
	public static int down(int floor) {
		System.out.println("�������ϴ�");
		floor--;
		if(0<=floor) {
			floor = 1;
		}
		return floor;
	}
}
