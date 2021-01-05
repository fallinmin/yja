package Chapter3;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double d = Math.random();
		double e = Math.random();
		
		int aa = (int)(Math.random()*45+1);
		int bb = (int)(Math.random()*45+1);
		int cc = (int)(Math.random()*45+1);
		int dd = (int)(Math.random()*45+1);
		int ee = (int)(Math.random()*45+1);
		int ff = (int)(Math.random()*45+1);
		
		int aaa;
		int bbb;
		int ccc;
		int ddd;
		int eee;
		int fff;
		
		/*
		if((aa!=bb)&&(bb!=cc)&&(cc!=dd)&&(ee!=ff)) {
			System.out.println(aa+", "+bb+", "+cc+", "+dd+", "+ee+", "+ff);
			
		}else {
			System.out.println("동일숫자가 있어 다시돌립니다");
		}
		*/
		
		
		//로또 번호 표시 시작
		System.out.print(aa+", "); //1번쨰 숫자
		
		if(aa!=bb) {				//2번쨰 숫자
			System.out.print(bb+", ");
		}
		if((aa!=cc)&&(bb!=cc)) {		//3번쨰 숫자
			System.out.print(cc+", ");
		}
		if((aa!=cc)&&(bb!=cc)&&(cc!=dd)&&(aa!=dd)&&(bb!=dd)) {		//4번쨰 숫자
			System.out.print(dd+", ");
		}
		if((aa!=cc)&&(bb!=cc)&&(cc!=dd)&&(aa!=dd)&&(bb!=dd)&&(aa!=ee)&&(bb!=ee)&&(cc!=ee)&&(dd!=ee)) {		//5번쨰 숫자
			System.out.print(ee+", ");
		}
		if((aa!=cc)&&(bb!=cc)&&(cc!=dd)&&(aa!=dd)&&(bb!=dd)&&(aa!=ee)&&(bb!=ee)&&(cc!=ee)&&(dd!=ee)&&(aa!=ff)&&(bb!=ff)&&(cc!=ff)&&(dd!=ff)&&(ee!=ff)) {		//6번쨰 숫자 		
			System.out.print(ff);
		}
		//로또 번호 표시 끝
		
		
		
	}

}
