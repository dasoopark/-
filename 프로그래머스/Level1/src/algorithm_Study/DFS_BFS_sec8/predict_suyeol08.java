package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 8. ���� �����ϱ�
����

���� ���ٿ� 1���� N������ ���ڰ� �� ���� ���� �ִ�. �׸��� ��° �ٺ��� ���ʴ�� �Ľ�Į�� �ﰢ��ó�� ���� �ΰ��� ���� ���� ����ǰ� �ȴ�.

���� ��� N�� 4 �̰� ���� �� �ٿ� 3 1 2 4 �� �ִٰ� ���� ��, ������ ���� �ﰢ���� �׷�����.

Image1.jpg

N�� ���� �ؿ� �ִ� ���ڰ� �־��� ���� �� ���� ���ٿ� �ִ� ���ڸ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

��, ���� ���������� ������ ��쿡�� ���������� ���� �տ� ���� ���� ����Ͽ��� �Ѵ�.


�Է�
ù° �ٿ� �ΰ��� ���� N(1��N��10)�� F�� �־�����.

N�� ���� ���ٿ� �ִ� ������ ������ �ǹ��ϸ� F�� ���� �ؿ� �ٿ� �ִ� ���� 1,000,000 �����̴�.


���
ù° �ٿ� �ﰢ������ ���� ���� �� N���� ���ڸ� �� ĭ�� ���̿� �ΰ� ����Ѵ�.

���� �������� �ʴ� ���� �Է����� �־����� �ʴ´�.


���� �Է� 1 

4 16
���� ��� 1

3 1 2 4 
 */
public class predict_suyeol08 {
	static int[] b, p, ch;
	static int n, f;
	boolean flag = false;
	static int[][] dy = new int[35][35];
	static int combi(int n, int r)
	{
		if(dy[n][r]>0)
		{
			return dy[n][r];
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for(int i=0;i<n;i++)
		{
			b[i] = combi(n-1, i);
		}
	}

}
