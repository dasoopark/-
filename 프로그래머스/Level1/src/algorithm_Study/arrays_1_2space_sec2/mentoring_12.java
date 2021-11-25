package algorithm_Study.arrays_1_2space_sec2;

import java.util.Scanner;

/*
 12. ���丵
����

������ �� �������� �� �л����� ���������� ����Ű�� ���� ���丵 �ý����� ������� �մϴ�.

���丵�� ����(�����ִ� �л�)�� ��Ƽ(������ �޴� �л�)�� �� ¦�� �Ǿ� ���䰡 ��Ƽ�� ���а��θ� �����ִ� ���Դϴ�.

�������� M���� �����׽�Ʈ ����� ������ ����� ��Ƽ�� ���մϴ�.

���� A�л��� �����̰�, B�л��� ��Ƽ�� �Ǵ� ¦�� �Ǿ��ٸ�, A�л��� M���� �����׽�Ʈ���� ��� B�л����� ����� �ռ��� �մϴ�.

M���� ���м����� �־����� ����� ��Ƽ�� �Ǵ� ¦�� ���� �� �ִ� ��찡 �� �� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� �� �л� �� N(1<=N<=20)�� M(1<=M<=10)�� �־�����.

�� ��° �ٺ��� M���� �ٿ� ���� �����׽�Ʈ ����� �л���ȣ�� �־�����. �л���ȣ�� ���� �տ������� 1��, 2��, ...N�� ������ ǥ���ȴ�.

���� �� �ٿ� N=4�̰�, �׽�Ʈ ����� 3 4 1 2�� �ԷµǾ��ٸ� 3�� �л��� 1��, 4�� �л��� 2��, 1�� �л��� 3��, 2�� �л��� 4���� �ǹ��մϴ�.


���
ù ��° �ٿ� ¦�� ���� �� �ִ� �� ��츦 ����մϴ�.


���� �Է� 1 

4 3
3 4 1 2
4 3 2 1
3 1 4 2
���� ��� 1

3
��Ʈ

��¼���


 */
public class mentoring_12 {
	static int solution(int n, int m, int[][] arr)
	{
		int answer =0; 
		for(int i=1; i<=n ; i++) // ����
		{
			for(int j=1; j<=n ; j++) // ��Ƽ
			{
				int cnt =0;
				for(int k=0; k<m; k++)
				{
					int pi =0, pj =0; //0��
					for(int s=0; s<n; s++)
					{
						if(arr[k][s]==i) pi = s;
						if(arr[k][s]==j) pj = s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m)
				{
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(solution(n,m,arr));

	}

}
