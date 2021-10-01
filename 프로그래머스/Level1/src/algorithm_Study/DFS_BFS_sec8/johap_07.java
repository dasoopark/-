package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 7. ������ ����(�޸������̼�)
����

Image1.jpg�� ����մϴ�.

������ �������� �� ������ �����ʰ� ���� ������ ����Ͽ� ��͸� �̿��� ���ռ��� �����ִ� ���α׷��� �ۼ��ϼ���.

Image1.jpg
nCr =  n-1Cr-1 + n-1Cr
�Է�
ù° �ٿ� �ڿ��� n(3<=n<=33)�� r(0<=r<=n)�� �Էµ˴ϴ�.


���
ù° �ٿ� ���ռ��� ����մϴ�.


���� �Է� 1 
5 3
���� ��� 1

10
���� �Է� 2 

33 19
���� ��� 2
818809200
 */
public class johap_07 {
	static int[][] dy = new int[35][35]; //�޸��� ��	�̼�
	static int DFS(int n, int r)
	{
		if(dy[n][r]>0) return dy[n][r];//������ �ִٸ� �������ƶ�
		if(n==r || r==0) 
		{
			return 1;
		}
		else
		{
			return dy[n][r] =  DFS(n-1, r-1)+ DFS(n-1,r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(DFS(n,r));
	}

}
