package Chapter7;

import java.util.Scanner;

public class Sook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		
		System.out.println("���ڸ� �Է����ּ���");
		String gul = sc.nextLine();
		int leng = gul.length();
		
		String number[]= {"1","2","3","4","5","6","7","8","9","10"};
		
		boolean issame = true;
		
		int cnt = 0;
		
		
		for(int i =0;i<leng;i++) {
			for(int j =0;j<number.length;j++) {
				if(str_array[i].equals(number[j])) {
					cnt++;
					System.out.println(cnt);
					
					System.out.println("�� �߸��Է�");
					issame = false;
					break;
				}if(cnt<=9) {
					cnt =0;
				}else if(cnt==10) {
					System.out.println("�� ���� �Է¾���");
					break;
				}
			}
		}
		
		
		
	}

}
