package Chapter9;

import java.util.Scanner;

public class cine {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie_title[] =new String[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("�帣 1.SF 2.Action 3.Mello");
		int genre = sc.nextInt();
		
		switch(genre) {
		case 1:
			System.out.println("��ȭ�� �������ּ���");
			int a = sc.nextInt();
			sf(a);
			break;
		case 2:
			System.out.println("��ȭ�� �������ּ���");
			int b = sc.nextInt();
			act(b);
		case 3:
			System.out.println("��ȭ�� �������ּ���");
			int c = sc.nextInt();
			mello(c);
		}
	}
	
	public static String[] sf(int i) {
		
		String title[] = {"���ͽ��ڶ�","����","sf1"};
		
		return title;
	}
	
	public static String[] act(int i) {
		String title[] = {"�׼�1","�׼�2","�׼�3"};
		
		return title;
		
	}
	public static String[] mello(int i) {
		String title[] = {"���1","���2","���3"};
		
		return title;
	}

}
