package Chapter9;

public class string_func_1215 {

		public static void main(String[] args) {
			String str = "ABCDEFG";
			int length = leng(str); // 길이 체크
			String str_array[] = new String[length];
			str_array = sub(length, str);
			print(str_array);
		}

		public static int leng(String s) {
			int count = s.length();
			return count;
		}

		public static String[] sub(int length, String str) {
			String str_array[] = new String[length];
			for (int i = 0; i < length; i++) { 	
				str_array[i] = str.substring(i, i + 1);
			}
			return str_array;
		}

		public static void print(String array[]) {
			for (String k : array) {
				System.out.println(k);
			}
		}
	
}