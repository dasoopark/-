package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 14. ������ ���Ϸ���
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
class Point4
{
	int x, y;
	Point4(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
}
public class island_BFS_14 {
	static int answer =0, n;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; //�ð� �������� 8����
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static void DFS(int x, int y, int[][] board)
	{
		for(int i=0; i<8 ; i++)
		{
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx >=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1)
			{
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
		
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
					board[i][j] = 0; //����� 0���� �ٲ����!!!! ���� 1�̶�� ! (üũ�ϴ� ������)
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
		for(int i=0; i<n ; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = kb.nextInt();
			}
		}
		solution(arr);
		
		System.out.println(answer);

	}

}
