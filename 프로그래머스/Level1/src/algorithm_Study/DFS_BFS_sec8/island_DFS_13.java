package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 13. ������ ���Ϸ���
����

N*N�� ������ ���Ϸ����� ������ �������� ������ �־����ϴ�.

�� ���� 1�� ǥ�õǾ� �����¿�� �밢������ ����Ǿ� ������, 0�� �ٴ��Դϴ�.

������ ���Ϸ��忡 �� ���� ���� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.

Image1.jpg

���� ���� ���ٸ� ���� ������ 5���Դϴ�.


�Է�
ù ��° �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.

�� ��° �ٺ��� ������ ������ �־�����.


���
ù ��° �ٿ� ���� ������ ����Ѵ�.


���� �Է� 1 

7
1 1 0 0 0 1 0
0 1 1 0 1 1 0
0 1 0 0 0 0 0
0 0 0 1 0 1 1
1 1 0 1 1 0 0
1 0 0 0 1 0 0
1 0 1 0 1 0 0
���� ��� 1

5
 */
public class island_DFS_13 {
	static int answer =0, n;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static void DFS(int x, int y, int[][] board)
	{
		
	}
	static void solution(int[][] board)
	{
		for(int i=0; i<n ; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(board[i][j]==1)
				{
					answer++;
					DFS(i, j, board);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[][] arr = new int[n][n];
		

	}

}
