package test;

public class _4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	int x;
		boolean y, powerOn;
		char ch;
		if(x>10&&x<20) {
			y = true;
		}
		if(ch!=' '&&ch!='	') {
			y = true;
		}
		if(ch=='x'||ch==' x') {
			y = true;
		}
		if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||) {
			y = true;
		}
	
		if(year%400=0||year%4=0&&year%100!=0) {
			y = true;
		}
		if(powerOn==false) {
			y = true;
		}
		if(str.equals("yes")) {
			y = true;
		}
*/	
		int hap=0;
		for(int i =1;i<=20;i++) {
			if(i%2!=0&&i%3!=0) {
				hap +=i;
			}
		}
		System.out.println(hap);
			
	}

}
 