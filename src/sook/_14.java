package sook;

import java.util.Scanner;

public class _14 {
	 public static double calculateBMI(double weight, double tall) {
	        double bmi = weight/(tall*tall);
	        return bmi;
	    }
	    public static void printBMIClassification(double bmi) {
	        if(bmi>30) {
	        	System.out.println("��");
	        }else if(bmi>=25&&bmi<=30) {
	        	System.out.println("��ü��");
	        }else if(bmi>=18.5&&bmi<=20) {
	        	System.out.println("����");
	        }else if(bmi<18.5) {
	        	System.out.println("��ü��");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double weight = input.nextDouble();
	        double tall = input.nextDouble();
	        // BMI ���� ���
	        double bmi = calculateBMI(weight, tall);
	        // BMI ������ �Է��Ͽ� �񸸵� ��� ���
	        printBMIClassification(bmi);
	    }
}
