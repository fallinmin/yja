import java.util.Scanner;

public class Cal_sc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int j = sc.nextInt();

		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println((double)i / (double)j);
		System.out.println();
	}

}
