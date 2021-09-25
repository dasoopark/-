package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 3. �ִ����� ���ϱ�(DFS)
����

�̹� �����ø��ǾƵ��ȸ���� ���� ������ ���� ���Ͽ� ������ �������� �ֽ� N���� ������ Ǯ���� �մϴ�.

�� ������ �װ��� Ǯ���� �� ��� ������ Ǫ�µ� �ɸ��� �ð��� �־����� �˴ϴ�.

���ѽð� M�ȿ� N���� ���� �� �ִ������� ���� �� �ֵ��� �ؾ� �մϴ�.

(�ش繮���� �ش�ð��� �ɸ��� Ǫ�� �ɷ� �����Ѵ�, �� ������ �Ѱ��� Ǯ �� �ֽ��ϴ�.)


�Է�
ù ��° �ٿ� ������ ����N(1<=N<=20)�� ���� �ð� M(10<=M<=300)�� �־����ϴ�.

�� ��° �ٺ��� N�ٿ� ���� ������ Ǯ���� ���� ������ Ǫ�µ� �ɸ��� �ð��� �־����ϴ�.


���
ù ��° �ٿ� ���� �ð��ȿ� ���� �� �ִ� �ִ� ������ ����մϴ�.


���� �Է� 1 

// ����   ��
5 20 
10 5
25 12
15 8
6 3
7 4
���� ��� 1

41
 */

public class best_score_03 {
	
	static int answer = Integer.MIN_VALUE, n, m;
	boolean flag = false;	
	static void DFS(int L, int sum, int time , int[] ps, int[] pt) //ps : ����� ���ھ�, ����� Ÿ��
	{
		if(time>m) return;
		if(L==n)
		{
			answer=Math.max(answer,sum);
			
		}
		else
		{
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
			DFS(L+1, sum, time, ps, pt);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		int [] arr = new int[n];
		int [] b = new int[n];
		
		for(int i = 0; i<n ; i++)
		{
			arr[i] = kb.nextInt();
			b[i] = kb.nextInt();
		}
		DFS(0,0,0,arr,b);
		System.out.println(answer);

	}

}
