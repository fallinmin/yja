package sook;

public class _11 {
	  public static void printSquare(int x) {
	        System.out.println(x * x);
	    }
		    public static void main(String[] args) {
		        printSquare("hello"); // Compile Error <==PrintSquare함수는 매개변수를 정수형으로 선언하였지만 이 두 함수 호출은 문자열 실수형으로 자료형이 달라 들어갈수 없다
		        printSquare(5.5); // Compile Error
		    }
	}

}
