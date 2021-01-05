package Calc;

public class Calculater {

	public Calculater(int a, int b, String c) {
		// TODO Auto-generated constructor stub
		int result =0;
		switch(c) {
		case "+":
			result = a +b;
			break;
		case "-":
			result = a-b;
		case "*":
			result = a*b;
		case "/":
			if(a!=0&&a!=b)
			result = a/b;
		}
		
		System.out.println(result);
	}



}
