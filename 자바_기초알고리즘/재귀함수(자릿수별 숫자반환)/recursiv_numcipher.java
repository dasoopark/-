package jinsscoding;

import java.util.Scanner;

public class recursiv_numcipher {
	
	public static void extract(int N)
	{
		//123 => 12 => 1
		if(N/10==0) {
			System.out.println(N);
			return;
		}
		extract(N/10);
		System.out.println(N%10);
			
	}

	public static void main(String[] args) {
		// �Էµ� ���� ���� �ڸ��� ���� ����Ͻÿ�
		// 2312    
		// ����:
		/*
		  2 
		  3
		  1
		  2
		 */
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		extract(input);

	}

}
