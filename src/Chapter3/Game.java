package Chapter3;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int monster_hp = 100;
		int Sword_Attk = 10;
		int Axe_Attk = 8;
		int Hamm_Attk = 6;
		int posion = -2;
		int poison_select;
		double hit_per = Math.random();
		int hit_num =(int)(hit_per*100);
		int hit_num2 =(int)(hit_per*100);
		int Attk_Select;
		
		String Wepon;
		String Sword= "Sword";
		String Axe = "Axe";
		String Hamm = "Hamm";
		//첫번째 공격
		System.out.println("무기 선택");
		System.out.println("Sword");
		System.out.println("Axe");
		System.out.println("Hmm");
		System.out.println("입력");
		Wepon = sc.next();
		System.out.println("독을 바르시겠습니까? 1.바름 2.바르지않음");
		poison_select = sc.nextInt();
		System.out.println("무기 적중확률: "+hit_num);
		if(Wepon.equals(Sword)&&hit_num>20)
		{
			if(poison_select==2) {
			monster_hp -= Sword_Attk;
			System.out.println("몬스터 데미지는"+monster_hp);
			}else if(poison_select==1) {
				monster_hp -= Sword_Attk - posion;
				System.out.println("몬스터 데미지는"+monster_hp);
			}
		}else if(hit_num<20){
			System.out.println("공격실패");
		}
		
		
		
		
		
		if(Wepon.equals(Axe)&&hit_num>20)
		{if(poison_select==2) {
			monster_hp -= Axe_Attk;
			System.out.println("몬스터 데미지는"+monster_hp);
			}else if(poison_select==1) {
				monster_hp -= Axe_Attk - posion;
				System.out.println("몬스터 데미지는"+monster_hp);
			}
		}else if(hit_num<20){
			System.out.println("공격실패");
		}
		
		
		
		
		
		
		
		if(Wepon.equals(Hamm)&&hit_num>20)
		{if(poison_select==2) {
			monster_hp -= Hamm_Attk;
			System.out.println("몬스터 데미지는"+monster_hp);
			}else if(poison_select==1) {
				monster_hp -= Hamm_Attk - posion;
				System.out.println("몬스터 데미지는"+monster_hp);
			}
		}else if(hit_num<20){
			System.out.println("공격실패");
		}
		
		System.out.println("1.공격 2.방어");
		Attk_Select = sc.nextInt();
		
		if(Attk_Select==1) {
			System.out.println("무기 선택");
			System.out.println("Sword");
			System.out.println("Axe");
			System.out.println("Hamm");
			System.out.println("입력");
			Wepon = sc.next();
			System.out.println("무기 적중확률: "+hit_num2);
			if(Wepon.equals(Sword)&&hit_num2>20)
			{if(poison_select==2) {
				monster_hp -= Sword_Attk;
				System.out.println("몬스터 데미지는"+monster_hp);
				}else if(poison_select==1) {
					monster_hp -= Sword_Attk - posion;
					System.out.println("몬스터 데미지는"+monster_hp);
				}
			}else if(hit_num2<20){
				System.out.println("공격실패");
			}
			if(Wepon.equals(Axe)&&hit_num2>20)
			{
				if(poison_select==2) {
					monster_hp -= Axe_Attk;
					System.out.println("몬스터 데미지는"+monster_hp);
					}else if(poison_select==1) {
						monster_hp -= Axe_Attk - posion;
						System.out.println("몬스터 데미지는"+monster_hp);
					}
			}else if(hit_num2<20){
				System.out.println("공격실패");
			}
			if(Wepon.equals(Hamm)&&hit_num2>20)
			{
				if(poison_select==2) {
					monster_hp -= Hamm_Attk;
					System.out.println("몬스터 데미지는"+monster_hp);
					}else if(poison_select==1) {
						monster_hp -= Hamm_Attk - posion;
						System.out.println("몬스터 데미지는"+monster_hp);
					}
			}else if(hit_num2<20){
				System.out.println("공격실패");
			}
		}else if(Attk_Select==2){
			System.out.println("방어!");
		}else {
			System.out.println("올바른 명령어를 입력하세요");
		}
		
		
		
	}

}