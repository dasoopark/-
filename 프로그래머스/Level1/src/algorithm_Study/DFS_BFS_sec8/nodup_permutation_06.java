package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 10 ������ N���� �ڿ����� �־����� �� �� M���� �̾� �Ϸķ� �����ϴ� ����� ��� ����մϴ�.


�Է¼���
ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M (2<=M<=N)�� �־����ϴ�.
�� ��° �ٿ� N���� �ڿ����� ������������ �־����ϴ�.

��¼��� 
ù ��° �ٿ� ����� ����մϴ�.
��¼����� ���������� ������������ ����մϴ�.

�Է¿��� 1
3 2
3 6 9

��¿��� 1
3 6
3 9
6 3
6 9
9 3 
9 6
// ������ �ߺ��ؼ� ������ �� ��(3,3 x)


 */
public class nodup_permutation_06 {

	static int[] pm, ch, arr;
	static int n, m;
	static void DFS(int L)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i< n; i++)
		{
			arr[i] = kb.nextInt();
		}
		ch = new int[n];
		pm = new int[m];
		DFS(0);
	}

}
