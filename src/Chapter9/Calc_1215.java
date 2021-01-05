package Chapter9;

public class Calc_1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10;
		one(i);
	}
	
	public static int one(int i) {
		i = i+10;
		two(i);
		return i;
	}
	
	public static int two(int i) {
		i = i+10;
		three(i);
		return i;
	}
	public static int three(int i) {
		i = i+10;
		four(i);
		return i;
	}
	
	public static int four(int i) {
		i = i+10;
		
		System.out.println(i);
		return i;
	}

}
