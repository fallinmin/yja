package sook;

public class _15 {

	    public static void printPay(double basePay, int hours) {
	        int pay = (int)basePay *hours;
	        if(hours>40) {
	        	pay += hours-40*basePay*15;
	        }
	        
	        if(basePay<8) {
	        	System.out.println("error: �����ñ� ������");
	        
	        }else {
	        	System.out.println(pay);
	        }
	        if(hours>60) {
	        	System.out.println("error: ���� �ٹ��ð� �ʰ�");
	        }else {
	        	System.out.println(pay);
	        }
	    }
	    public static void main(String[] args) {
	        printPay(7.50, 35);
	        printPay(8.20, 47);
	        printPay(10.00, 73);
	    }
	}


