package jinsscoding;

import java.util.Scanner;

public class recursiv_fibo {
	
	public static int pibo(int num)
	{
		if(num==1)
			return 1;
		if(num==2)
			return 1;
		
		return pibo(num-1) + pibo(num-2);
		//p(5)+p(4)   p(
		
	}

	public static void main(String[] args) {
		// �Ǻ���ġ ���
		// �Էµ� ���� �Ǻ���ġ ���� ���Ͻÿ�
		// �Է�: 6
		// ����: 8 (1->1->2->3->5->8)

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int ans = pibo(num);
		
		System.out.println(ans);
		
	}

}
