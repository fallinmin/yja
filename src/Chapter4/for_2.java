package Chapter4;

public class for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String str = "ABCDE";  
		
		char c= str.charAt(1); //index 0부터 시작. 문자 추출
		System.out.println("CharAt"+c);
		
		
		for(int i = 0;i<=str.length();i++) { //length 글자길이
			System.out.println(str.substring(i,i+1));
			
		}
		
	*/
		
		//실습
		
		String str1 = "ABC";
		String str2 ="abc";
		
		char c_1 = ' ';
		char c_2 = ' ';
		
		for(int i =0;i<str1.length();i++) {
			c_1 = str1.charAt(i);
		}
		
		for(int i = 0; i<str2.length();i++) {
			c_2 = str2.charAt(i);
		}
		System.out.println(c_1);
		System.out.println(c_2);
		
		System.out.println(c_1+c_2);
		
		int sum = c_1+c_2;
		System.out.println(sum);
		
	}

}
