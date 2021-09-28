package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 5. ������ȯ
����

������ ���� ���� ������ �������� �־��� ������ �Ž������� ���� ���� ���� �������� ��ȯ���ַ��� ��� �ָ� �Ǵ°�?
�� ������ ������ ������ �� �� �ִ�.


�Է�
ù ��° �ٿ��� ������ �������� N(1<=N<=12)�� �־�����. �� ��° �ٿ��� N���� ������ ������ �־�����,
�� �����ٿ� �Ž��� �� �ݾ� M(1<=M<=500)�� �־�����.�� ������ ������ 100���� ���� �ʴ´�.

���
ù ��° �ٿ� �Ž��� �� ������ �ּҰ����� ����Ѵ�.

���� �Է� 1 

3
1 2 5
15
���� ��� 1

3
��Ʈ

 */


public class coin_exchange_05 {
	static int n, m, answer = Integer.MAX_VALUE;
	static void DFS(int L, int sum, int[] arr)
	{
		if(sum>m)
		{
			return; //�������� �ȵ��� ���� ���
		}
		if(sum == m ) //m => �Ž��� �ִ�  �ݾ��� ���� ��
		{
			answer = Math.min(answer, L); //L�� sum�� ������ �����ǰ���, ������ ���� ������ �ٲ��ָ� �� 
		}
		else
		{
			for(int i=0; i<n; i++)
			{
				DFS(L+1, sum+arr[i], arr); //L+1 =>���� ���� �ϳ� ����ϴ°Ŵϱ� �������������
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			
			arr[i]=kb.nextInt();
		}
		m = kb.nextInt();
		DFS(0, 0, arr);
		System.out.println(answer);

	}

}
