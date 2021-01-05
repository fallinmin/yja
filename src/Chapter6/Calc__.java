package Chapter6;

import java.util.Scanner;

public class Calc__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		String nn[] = new String[5];

		int johui = 0;
		boolean run =true;
		int in =0;
		
		while(run) {
		System.out.println("첫번째 숫자를 입력하시오");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		num2 = sc.nextInt();
		System.out.println("연산할 기호를 입력하시오");
		String num_kiho = sc.next();

		switch(num_kiho) {
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				nn[in] = "";
				nn[in] +=String.valueOf(num1)+num_kiho+String.valueOf(num2)+"="+String.valueOf(num1+num2);
				in++;
				break;
			case "-":
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				nn[in] = "";
				nn[in] +=String.valueOf(num1)+num_kiho+String.valueOf(num2)+"="+String.valueOf(num1-num2);
				in++;
				break;
			case "*":
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				nn[in] = "";
				nn[in] +=String.valueOf(num1)+num_kiho+String.valueOf(num2)+"="+String.valueOf(num1*num2);
				in++;
				break;
			case "/":
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				nn[in] = "";
				
				nn[in] +=String.valueOf(num1)+num_kiho+String.valueOf(num2)+"="+String.valueOf(num1/num2);
				in++;
				break;
		}
		

			System.out.println("조회하시겠습니까?1. 조회 2.조회안함 3.끝내기");
			johui = sc.nextInt();
			if(johui ==1) {
				for(int i =0;i<nn.length;i++) {
					System.out.println(nn[i]);
					//nn[i] = String.valueOf(num1)+num_kiho+String.valueOf(num2);
					//System.out.println(nn[i]);
				}
			}else if(johui==2){
				System.out.println("조회하지 않으셨습니다.");
				run = !run;
			}else if(johui==3){
				System.out.println("끝내기");
				run = !run;
			}
		}
			
		
		
		
		
		
	}

}
