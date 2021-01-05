import java.util.Scanner;

public class Hello_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f;
		
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		
		System.out.println("첫번째 숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		b = sc.nextInt();
		System.out.println("세번째 숫자를 입력하시오");
		c = sc.nextInt();
		System.out.println("네번째 숫자를 입력하시오");
		d = sc.nextInt();
		
		int x = a+b;
		int y = c -d;
		
		System.out.println("앞의 두숫자를 더함 = "+x);
		System.out.println("뒤의 두 숫자를 뺌 = "+y);
		
		
	}
}

