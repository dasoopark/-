package jinsscoding;

import java.util.Scanner;

public class recursiv_sum {

	public static int calAccSum(int start, int end) {
		
		if(start==end) {
			return end;
		}
		//end ���� 1�� �پ����
		return end + calAccSum(start, end-1);
		// 
	}
	public static void main(String[] args) {
		// ������ ��� ver
		// �Էµ� �� �� ������ ���� ���Ͻÿ� (����Լ��� �̿� �Ͻÿ�)
		// 1 4 �Է�
		// => 1+2+3+4 => 10 
	
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		
		start = scan.nextInt();
		end = scan.nextInt();
		
		int ans = 0;
		ans = calAccSum(start, end);
		System.out.println(ans);
		
		
	}

}
