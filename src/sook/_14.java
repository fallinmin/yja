package sook;

import java.util.Scanner;

public class _14 {
	 public static double calculateBMI(double weight, double tall) {
	        double bmi = weight/(tall*tall);
	        return bmi;
	    }
	    public static void printBMIClassification(double bmi) {
	        if(bmi>30) {
	        	System.out.println("비만");
	        }else if(bmi>=25&&bmi<=30) {
	        	System.out.println("과체중");
	        }else if(bmi>=18.5&&bmi<=20) {
	        	System.out.println("정상");
	        }else if(bmi<18.5) {
	        	System.out.println("저체중");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double weight = input.nextDouble();
	        double tall = input.nextDouble();
	        // BMI 지수 계산
	        double bmi = calculateBMI(weight, tall);
	        // BMI 지수를 입력하여 비만도 결과 출력
	        printBMIClassification(bmi);
	    }
}
