package jinsscoding;

import java.util.Scanner;

public class recursiv_2jinsoo {
	
	public static void decToBin(int num)
	{
		
		if(num==1) {
			System.out.println(num);
			return;
		}
		/*
		 17 / 2 = 8 - 1   (1)   (10) ���� - �� => 1��ȯ
		 8  / 2 = 4  - 0   (2)  (9) ����
		 4  / 2 = 2  - 0   (3)  (8) ����
		 2  / 2 = 1  - 0   (4)  (7) ����
		 1  / 2 = 0  - 1   (5)����  (6) ����
		 */
		decToBin(num/2);
	    System.out.println(num%2);
		
	}

	public static void main(String[] args) {
		// 2���� ��ȯ(��� ����)
		// �Էµ� ���� �������� ��ȯ�ϼ���
		// �Է�:17 
		// ���� 10001
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		decToBin(input);
	}

}
