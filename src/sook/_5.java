package sook;

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int donPr = 8000;
        int kalPr = 10000;
        int kingPr = 5000;
        int donNu = 16;
        int kalNu = 8;
        int kingNu = 1;
        // ��� ���    
        System.out.printf("%s x %2d = %6d\n", "������", donNu, donPr * donNu);
        System.out.printf("%s x %2d = %6d\n", "Į����", kalNu, kalPr * kalNu);
        System.out.printf("%s x %2d = %6d\n", "�ո���", kingNu, kingPr * kingNu);
        System.out.println("===================");
        int sum = donPr * donNu + kalPr * kalNu + kingPr * kingNu;
        System.out.printf("%s: %d\n", "����", sum);
	}

}
