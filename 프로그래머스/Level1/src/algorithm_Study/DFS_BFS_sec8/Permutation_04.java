package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 * 
 1���� N���� ��ȣ�� ���� ������ �ֽ��ϴ�. �� �� �ߺ��� ����Ͽ� M���� �̾� �Ϸķ� �����ϴ� ����� ��� ����մϴ�.

�Է¼���
ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־����ϴ�.

��¼���
ù ��° �ٿ������ ����մϴ�.
��¼����� ���������� ������������ ����մϴ�.

�Է¿��� 1
3 2

��¿��� 1
1 1
1 2
1 3
2 1
2 2
2 3 
3 1

 */
public class Permutation_04 {
	static int[] pm;
	static int n, m;
	static void DFS(int L)
	{
		if(L==m)
		{
			for(int x : pm)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				pm[L] = i;
				DFS(L+1);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		DFS(0);

	}

}
