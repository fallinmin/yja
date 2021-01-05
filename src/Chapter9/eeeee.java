package Chapter9;

public class eeeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10;
		first2(10);
	}
	


	public static void first2(int i) {
		i = i+10; 
		first3(i);
	}
	public static void first3(int i) {
		i = i+10; 
		first4(i);
	}
	public static void first4(int i) {
		i = i+10; 
		System.out.println(i);
	}
	
}
