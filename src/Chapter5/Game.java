package Chapter5;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean start_Game = true; // �������� ����
		Random rdm = new Random(); // math.random �� �ƴ� java.util �� �ִ� random �Լ� ���
		while (start_Game) { // �������� ����

			boolean character_set = true; // �÷��̾� ���� ���� ����
			int character_set_flag = 0; // �÷��̾� ���� ���� flag
			boolean tour = true; // �޽� ����
			int tour_flag = 0;
			boolean monster_attack = true; // ���� ���� ����
			int monster_attack_flag = 0; // ���� ���� flag
 
			/* ���� ���� �ֻ��� */
			int dice_encounter = 8; // ���� ���� Ȯ�� �ֻ���
			int dice_kind = 5; // ���� ���� �ֻ���
			int hitratting_dice = 10;
			/* �÷��̾� ���� �ʱ�ȭ */
			String p_name = ""; // �÷��̾� �̸�
			int p_job = 0; // �÷��̾� ����
			int p_level = 1; // �÷��̾� ����
			int p_hp = 0; // �÷��̾� ü��
			int p_hp_p = p_hp; //�޽��� ü�� �����
			int p_weapon = 0; // �÷��̾� ����
			String weapon_name = ""; // �÷��̾� ����
			int weapon_dice = 0; // �÷��̾� ���ݷ� �ֻ���
			int p_attk = 0; // �÷��̾��� ���ݷ�
			int p_str = 0; // �÷��̾��� ��
			int p_dex = 0; // �÷��̾��� ��ø��
			
			boolean run = true;
			
			/* ���� �ɷ�ġ �ʱ�ȭ */
			String monster_name = ""; // ���� �̸�
			int monster_HP = 0; // ���� ü��
			int monster_weapon = 0; // ���� ����
			String m_weapon_name = ""; // ���� �����
			int m_weapon_dice = 0; // ���� ���ݷ� �ֻ���
			int monster_attk = 0; // ���� ���ݷ�
			int monster_str = 0; // ���� ��
			int monster_dex = 0; // ���� ��ø��
			int monster_level = 0; // ���� ����

			/* �÷��̾� ���� ���� ���� */
			while (character_set) {
				/* �÷��̾� �ɷ�ġ ���� */
				Scanner sc = new Scanner(System.in); // �÷��̾� ������ ��ĳ�� ȣ��

				System.out.println("����� �̸��� �Է��ϼ���.");
				p_name = sc.nextLine();
				System.out.println("---------------------------------------------");
				System.out.println(p_name + " �� ������ �������ּ���.");
				System.out.println("1. ����		2. ������		3. ��ɲ�");
				p_job = sc.nextInt();

				System.out.println("---------------------------------------------");
				System.out.println("���⸦ �������ּ���.");
				System.out.println("---------------------------------------------");
				switch (p_job) {
				case 1: // ���� ����
					p_hp = 200;
					p_str = 20;
					p_dex = 10;
					System.out.println("����� ���� ���⸦ ������ �� �ֽ��ϴ�.");
					System.out.println("1. Sword  2. Bastard Sword");
					p_weapon = sc.nextInt();
					if (p_weapon == 1) {
						weapon_name = "Sword";
						weapon_dice = 8;
					} else if (p_weapon == 2) {
						weapon_name = "Bastard Sword";
						weapon_dice = 10;
						p_dex = p_dex - 2; // ���Է� ���� ��ø�� ����
					}
					break;

				case 2: // ������ ����
					p_hp = 100;
					p_str = 8;
					p_dex = 9;
					System.out.println("������� ���� ���⸦ ������ �� �ֽ��ϴ�.");
					System.out.println("1. Staff    2. Magic Mace");
					p_weapon = sc.nextInt();
					if (p_weapon == 1) {
						weapon_name = "Staff";
						weapon_dice = 4;
					} else if (p_weapon == 2) {
						weapon_name = "Magic Mace";
						weapon_dice = 6;
						p_dex = p_dex - 1; // ���Է� ���� ��ø�� ����
					}
					break;

				case 3: // ��ɲ� ����
					p_hp = 150;
					p_str = 14;
					p_dex = 20;
					System.out.println("��ɲ��� ���� ���⸦ ������ �� �ֽ��ϴ�.");
					System.out.println("1. Long Bow    2. Bolt");
					p_weapon = sc.nextInt();
					if (p_weapon == 1) {
						weapon_name = "Long Bow";
						weapon_dice = 6;
					} else if (p_weapon == 2) {
						weapon_name = "Bolt";
						weapon_dice = 8;
						p_dex = p_dex - 2; // ���Է� ���� ��ø�� ����
					}
					break;
				}

//				System.out.println(p_hp);
//				System.out.println(p_str);
//				System.out.println(p_dex);
				System.out.println("-------------------------------------------------------");
				System.out.printf("* " + weapon_name + " * ��/�� �����ϼ̽��ϴ�. ���� �� " + weapon_dice + " ��ü �ֻ����� �����ϴ�. \n ");
				System.out.println("-------------------------------------------------------");
				System.out.println("���������� " + p_name + " ���� �ɷ�ġ�� ���ϰڽ��ϴ�.");
				System.out.println("10��ü �ֻ��� �ΰ��� �����ϴ�. �ΰ��� �տ� ���� �ɷ��� �������ϴ�.");
				System.out.println("-------------------------------------------------------");

				int dice_10_1 = rdm.nextInt(10);
				int dice_10_2 = rdm.nextInt(10);
				int dice_10_sum = dice_10_1 + dice_10_2;

				System.out.println("ù��° �ֻ����� " + dice_10_1);
				System.out.println("�ι�° �ֻ����� " + dice_10_2);

				if (dice_10_sum >= 15) {
					// �� ���� �⺻ �ɷ�ġ �״��
				} else if (dice_10_sum >=8 && dice_10_sum < 15) { // �ɷ�ġ 10% ����
					p_hp = p_hp - ((p_hp * 10) / 100);
					p_str = p_str - ((p_str * 10) / 100);
					p_dex = p_dex - ((p_dex * 10) / 100);
				} else if (dice_10_sum < 8 ) { // �ɷ�ġ 20% ����
					p_hp = p_hp - ((p_hp * 20) / 100);
					p_str = p_str - ((p_str * 20) / 100);
					p_dex = p_dex - ((p_dex * 20) / 100);
				}
				
				p_hp_p = p_hp; //�޽��� ü�¿�
				System.out.println("-------------------------------------------------------");
				System.out.printf(p_name + " �� ����� �ɷ�ġ �Դϴ�. \n" + "ü�� : " + p_hp + " \n" + "�� : " + p_str + " \n"
						+ "��ø : " + p_dex + " \n" + "���� :" + weapon_name + " \n");
				System.out.println("-------------------------------------------------------");
				System.out.println(p_name + " �� �̴�� �����Ͻðڽ��ϱ�? (1. YES   2. NO)");
				System.out.println("-------------------------------------------------------");

				character_set_flag = sc.nextInt();
				switch (character_set_flag) {
				case 1:
					character_set = false;
					break;

				case 2:
					character_set = true;
					System.out.println("---------------------------------------------");
					break;
				}
			}
			/* �÷��̾� ���� ���� ���� */

			/* ���� ���� ���� ���� ���� */
			while (tour) {
				Scanner sm = new Scanner(System.in); // ���� ���� �� ���ο� ��ĳ�� ȣ��
				int monster_encounter = 0; // ���Ϳ� ����
				int monster_kind = 0; // ������ ��

				System.out.printf(
						p_name + " ���� ������ ������ �������ϴ�. \n" + " 1 �� �����Ͻø�, ��� ������ ���ư��ϴ�." + " 2 �� �����Ͻø�, �޽��� ���մϴ�.");

				tour_flag = sm.nextInt();
				if(p_hp<=((p_hp*50)/100)) {
					System.out.println("ü���� �ʹ� �����ϴ� �޽��� �����մϴ�");
				}
				switch (tour_flag) {
				case 1:
					System.out.println("----------------------------------------------------------");
					System.out.println(p_name + " �� ��ô�� �������ϴ�. (�ֻ����� �����ϴ�.)");
					monster_encounter = rdm.nextInt(dice_encounter); // �ֻ����� ���� ���� ���� Ȯ���� ����
					System.out.println(monster_encounter + "  ���Խ��ϴ�.");
					if (monster_encounter > 4) {
						System.out.println("-----------------------------------------------------");
						System.out.println("�ƹ� �͵� �����ϴ�. ��� ������ �����ϴ�.");
					} else if (monster_encounter <= 4) {
						System.out.println("-----------------------------------------------------");
						System.out.printf("���Ͱ� �ִ� �� �����ϴ�. \n" 
										+ "�ֻ����� �����ϴ�. \n");

						monster_kind = rdm.nextInt(dice_kind); // �ֻ����� ���� ���� ������ ��

						/* ���� ���� ���� */
						switch (monster_kind) {
						case 1:
							monster_name = "Kobold"; // ���� �̸�
							monster_HP = 100; // ���� ü��
							m_weapon_name = "Dangger"; // ���� �����
							m_weapon_dice = 4; // ���� ���ݷ� �ֻ���
							monster_str = 10; // ���� ��
							monster_dex = 8; // ���� ��ø��
							monster_level = 1; // ���� ����
							break;

						case 2:
							monster_name = "Ork"; // ���� �̸�
							monster_HP = 150; // ���� ü��
							m_weapon_name = "Stick"; // ���� �����
							m_weapon_dice = 6; // ���� ���ݷ� �ֻ���
							monster_str = 14; // ���� ��
							monster_dex = 7; // ���� ��ø��
							monster_level = 2; // ���� ����
							break;
							
						case 3:
							monster_name = "Ork leader"; // ���� �̸�
							monster_HP = 200; // ���� ü��
							m_weapon_name = "Mace"; // ���� �����
							m_weapon_dice = 8; // ���� ���ݷ� �ֻ���
							monster_str = 15; // ���� ��
							monster_dex = 9; // ���� ��ø��
							monster_level = 3; // ���� ����
							break;
							
						case 4:
							monster_name = "Ogre"; // ���� �̸�
							monster_HP = 300; // ���� ü��
							m_weapon_name = "Stick"; // ���� �����
							m_weapon_dice = 6; // ���� ���ݷ� �ֻ���
							monster_str = 18; // ���� ��
							monster_dex = 10; // ���� ��ø��
							monster_level = 4; // ���� ����
							break;
							
						case 5:
							monster_name = "Fallen knight"; // ���� �̸�
							monster_HP = 200; // ���� ü��
							m_weapon_name = "Bastard Sword"; // ���� �����
							m_weapon_dice = 8; // ���� ���ݷ� �ֻ���
							monster_str = 18; // ���� ��
							monster_dex = 12; // ���� ��ø��
							monster_level = 5; // ���� ����
							break;
							
						}
						
						System.out.println("-----------------------------------------------------");
						System.out.println(m_weapon_name + " ���� ������  " + monster_name + "�Դϴ�.");
					/*	System.out.println(monster_HP);
						System.out.println(m_weapon_dice);
						System.out.println(monster_str); 
						System.out.println(monster_dex);
						System.out.println(monster_level);*/
						boolean monster_battle = true;
						while(monster_battle) {
							int hitrating = rdm.nextInt(hitratting_dice);
							System.out.println("---------------------------------------------");
							System.out.println(hitrating+"�� ���Խ��ϴ�");
							if(hitrating>5) {
								System.out.println("-------------------------------------------");
								System.out.println("����� �����Դϴ�");
								
								p_attk = rdm.nextInt(weapon_dice)+p_str; //�÷��̾� ���ݷ�
								System.out.println(p_name+"����"+monster_name+"����"+p_attk+"�� ������");
								monster_HP = monster_HP-p_attk;
								if(monster_HP<=0) {
									System.out.println("���͸� �����ƽ��ϴ�");
									monster_battle = false;
							}else if(hitrating<=5) {
								monster_attk = rdm.nextInt(m_weapon_dice)+monster_str;
								System.out.println(monster_name+"��"+p_name+"����"+monster_attk+"�� �������� �־����ϴ�");
								p_hp=p_hp - monster_attk;
								if(p_hp<=0) {
									System.out.println("����� ����Ͽ����ϴ�");
									monster_battle = false;
								}
							}
								
							}
							
							
							
						}
					}
					break;

				case 2:
					System.out.printf(
							"--------------------------------------------- \n" + 
							"���� ��ϴ�.  zzzzzzzzzzzzzzzzzzzzzzzzzzzzz \n"
							+ "ü���� ȸ���Ǿ����ϴ�. \n");
					p_hp = p_hp_p;
					
					
					break;
				}

			}
		}
	}
}
