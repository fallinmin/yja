package Test_1230_1;
import java.util.Scanner;
public class Coding_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ��");
		boolean run = true;
		Coding_8_1 scan = new Coding_8_1();
		while(run) {
			System.out.println("����Ʈ���� ���Ű��� ȯ���մϴ�");
			Coding_8_1 smart = new Coding_8_1();
			smart.Scan();
			Scanner sc = new Scanner(System.in);
			System.out.println("��������� 1�� �ʱ�ȭ���� ���� �ƹ�Ű�� ��������");
			int power = sc.nextInt();
			if(power==1) {
				run = false;
			}	
			
			
			
		}
	}

}

