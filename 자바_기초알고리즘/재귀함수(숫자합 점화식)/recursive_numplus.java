package jinsscoding;

import java.util.Scanner;

public class recursive_numplus {

	static int cache[] = new int[1000];
	
	public static int doFunc(int n)
	{
		if(cache[n] != 0) {
			return cache[n];
		}
		
		return cache[n] = doFunc(n-1) + doFunc(n-2) + doFunc(n-3);
		// n=5�϶�    5           4(ȣ��)           3(����)        2(����)
		// n=4�϶�    4            3(����)          2(����)         1(����)
		//�ٽ� n=5�� ���� ���ƿͼ� doFunc 5 ����
	}
	public static void main(String[] args) {
		/*
		  ���� 4�� 1,2,3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.
		 1+1+1+1
		 1+1+2
		 1+2+1
		 2+1+1
		 2+2
		 1+3
		 3+1 
		 ���� n�� �־����� ��, n�� 1,2,3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		 
		 �����Է�:
		 4
		 7
		 10
		 ���
		 7
		 44
		 274
		 
		 [n] = [n-1] + [n-2] + [n-3] ��ȭ��
		 */
		
	int n;
	cache[1] = 1;
	cache[2] = 2;
	cache[3] = 4;  //��ȭ���� ����ϱ� ���ؼ� 1,2,3���� �ʿ��ϹǷ� ���� �ϵ��ڵ�
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	System.out.println(doFunc(n));
		

	}

}
