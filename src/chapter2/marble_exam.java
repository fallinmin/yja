package chapter2;

import java.util.Scanner;

public class marble_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주사위 2개를 굴리자
		double dice = Math.random(); //첫번째 주사위의 값 0.0 1.0사이의 실수
		double dice2 = Math.random();
		double Pangyo_dice3 = Math.random();//첫번째 주사위의 값 0.0 1.0사이의 실수
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위 면의 갯수를 골라주세요");
		int num = sc.nextInt(); //주사위 면의 갯수
		int sum = 0; //주사위의 합
		int dice_1; //주사위 1
		int dice_2; //주사위 2
		
		System.out.println(num+"면체 주사위를 굴립니다");
		
		
		int dice_num =(int)(dice*num)+1; //0.0*6 이 나오는 경우 0값이 나올수 있으므로 1을 더해준다 %(0~6)이므로%

		int dice_num2 =(int)(dice2*num)+1;

		if(dice_num >num) {
			System.out.println("주사위 1번 값은"+(dice_num-1));//1.0이 나왔을경우 1.0+1이면 7이나오므로 -1을 해준다 %(0~6)이므로%
			dice_1 = dice_num -1;
		}else {
			System.out.println("주사위 1번 값은"+dice_num);
			dice_1 = dice_num;
		}
		
		
		if(dice_num2 >num) {
			System.out.println("주사위 2번 값은"+(dice_num2-1));		
			dice_2 = dice_num2-1;
		}else {
			System.out.println("주사위 2번 값은"+dice_num2);
			dice_2 = dice_num2;
		}
		
		sum = dice_1 + dice_2;
		System.out.println("주사위의 합은"+sum);
		
		//부르마블 위치
		//부산2 울산34 대구56 대전78 판교9 10 서울11 12
		
		if(sum==2)
		{
			System.out.println("부산");
			System.out.println("■□□□□□");
		}
		if(sum==3||sum==4)
		{
			System.out.println("울산");
			System.out.println("□■□□□□");
		}
		if(sum==5||sum==6)
		{
			System.out.println("대구");
			System.out.println("□□■□□□");
		}
		if(sum==7||sum==8)
		{
			System.out.println("대전");
			System.out.println("□□□■□□");
		}
		if(sum==9||sum==10) //만약 판교가 걸리면 다시한번 주사위1개를 굴린다
		{
			System.out.println("판교");
			System.out.println("□□□□■□");
			System.out.println("판교가 걸렸습니다 다시 하나의 주사위를 굴립니다");
			int dice_re =(int)(Pangyo_dice3*num)+1;
			if(dice_re >num) {
				System.out.println("주사위 하나의 값은"+(dice_re-1));
			}else
			{
				System.out.println("주사위 하나의 값은"+dice_re);
			}
			int result = sum+dice_re;
			System.out.println("주사위 총점수:"+result);
		}
		if(sum==11||sum==12)
		{
			System.out.println("서울");
			System.out.println("□□□□□■");
		}
		
		
		
		
		
		
		
	}

}
