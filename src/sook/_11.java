package sook;

public class _11 {
	  public static void printSquare(int x) {
	        System.out.println(x * x);
	    }
		    public static void main(String[] args) {
		        printSquare("hello"); // Compile Error <==PrintSquare�Լ��� �Ű������� ���������� �����Ͽ����� �� �� �Լ� ȣ���� ���ڿ� �Ǽ������� �ڷ����� �޶� ���� ����
		        printSquare(5.5); // Compile Error
		    }
	}

}
