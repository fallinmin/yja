package Chapter4;

public class for_exa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num_str = "AB345";
		
		String num_str1 = "12BCD";		
		String Num_char = "ABC";
		
		
		
		String alpa = num_str.substring(0,2);
		String alpa2 = num_str1.substring(2,5);
		String alpa3 = Num_char.substring(2,3);
		System.out.println(alpa+alpa2);
		
		int a = Integer.parseInt(num_str.substring(2,5));
		int b = Integer.parseInt(num_str1.substring(0,2));
		System.out.println(a);
		System.out.println(b);
		System.out.println(alpa3);
		
	}

}
