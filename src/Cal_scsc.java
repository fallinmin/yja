import java.util.Scanner;

public class Cal_scsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int j = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요");
		int k = sc.nextInt();
		int l = i*j;
		
		System.out.println(l);
		System.out.println((k/l)*100);
	}

}
