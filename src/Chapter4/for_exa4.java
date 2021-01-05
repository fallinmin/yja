package Chapter4;

public class for_exa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1234";
		char c = 'E';
		int sum = 0;
		int str_lang = str.length();
		for(int i =0;i<str.length();i++) {
			String sub = str.substring(i,i+1);
			int sub_pars = Integer.parseInt(sub);
			
			int multi = sub_pars * c;
			sum +=  multi;
			
			System.out.println("총합은"+sum);
		}
	
	}

}
