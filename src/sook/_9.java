package sook;

import java.util.Scanner;

public class _9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Ű����κ��� �Է¹ޱ� ���� ����
        Scanner input = new Scanner(System.in);
        // �߷� ���ӵ�
        double gravity = -9.81;
        // �������� �ð�
        double fallingTime = input.nextDouble();
        // �ʱ� ����
        double initialPosition = 1000.0;
        // x(t) = 0.5at^2 + v0t + x0
        
        
        double finalPosition = 0.0; /* �̺κ��� �����Ͽ� ���α׷��� �ϼ��ϼ��� */
        System.out.printf("%.2f �� ��, ��ü�� ���� %.2f m\n", fallingTime, finalPosition);
	}

}
