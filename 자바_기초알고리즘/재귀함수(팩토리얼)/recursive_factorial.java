package jinsscoding;

import java.util.Scanner;

public class recursive_factorial {

	
	public static int calFact(int i)
	{
		
		if(i == 1) {
			return 1;
		}
		return i * calFact(i-1); //������ ���� ���� �� ��
		
		
	}
	
	
	
	public static void main(String[] args) {
		// �Էµ� ���� ���丮���� ���Ͻÿ� �ݺ��� ������ �ƴ� ����� �������� Ǯ ��
		// 5
		// ����: 120
		
		int input;
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		int ans = 0;
		
		ans = calFact(input);
		
		System.out.println(ans);
	}

}
