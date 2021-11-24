package algorithm_Study.arrays_1_2space_sec2;

import java.util.Scanner;

/*
 8. ������ϱ�
����

N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.

���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.

�� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.


�Է�
ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.


���
�Էµ� ������� ����� ����Ѵ�.


���� �Է� 1 

5
87 89 92 100 76
���� ��� 1

4 3 2 1 5
 */
public class your_rank_08 {
	static int[] solution(int n, int[] arr)
	{
		int [] answer = new int[n];
		
		for(int i=0; i<n;i++)
		{
			int cnt = 1;
			for(int j=0; j<n ; j++)
			{
				if(arr[j]>arr[i])
				{
					cnt++;
				}
				
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n ; i++)
		{
			arr[i] = kb.nextInt();
		}
		for(int x : solution(n, arr))
		{
			System.out.println(x+ " ");
		}

	}

}
