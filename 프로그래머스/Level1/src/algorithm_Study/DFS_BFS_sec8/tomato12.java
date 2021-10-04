 	package algorithm_Study.DFS_BFS_sec8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 	 12. �丶��(BFS Ȱ��)
����

������ �丶�� ���忡���� �丶�並 �����ϴ� ū â�� ������ �ִ�.

�丶��� �Ʒ��� �׸��� ���� ���� ��� ������ ĭ�� �ϳ��� �־ â�� �����Ѵ�.

Image1.jpg

â�� �����Ǵ� �丶��� �߿��� �� ���� �͵� ������, ���� ���� ���� �丶��鵵 ���� �� �ִ�. ���� �� �Ϸ簡 ������,

���� �丶����� ������ ���� �ִ� ���� ���� �丶����� ���� �丶���� ������ �޾� �Ͱ� �ȴ�.

�ϳ��� �丶���� ������ ���� ����, ������, ��, �� �� ���⿡ �ִ� �丶�並 �ǹ��Ѵ�. �밢�� ���⿡ �ִ� �丶��鿡�Դ� ������ ���� ���ϸ�,

�丶�䰡 ȥ�� ������ �ʹ� ���� ���ٰ� �����Ѵ�. ������ â�� ������ �丶����� ��ĥ�� ������ �� �Ͱ� �Ǵ���, �� �ּ� �ϼ��� �˰� �;� �Ѵ�.

�丶�並 â�� �����ϴ� ���ڸ���� ���ڵ��� ũ��� ���� �丶���� ���� ���� �丶����� ������ �־����� ��,

��ĥ�� ������ �丶����� ��� �ʹ���, �� �ּ� �ϼ��� ���ϴ� ���α׷��� �ۼ��϶�. ��, ������ �Ϻ� ĭ���� �丶�䰡 ������� ���� ���� �ִ�.


�Է�
ù �ٿ��� ������ ũ�⸦ ��Ÿ���� �� ���� M, N�� �־�����. M�� ������ ���� ĭ�� ��,

N �� ������ ���� ĭ�� ���� ��Ÿ����. ��, 2 �� M, N �� 1,000 �̴�.

��° �ٺ��ʹ� �ϳ��� ���ڿ� ����� �丶����� ������ �־�����.

��, ��° �ٺ��� N���� �ٿ��� ���ڿ� ��� �丶���� ������ �־�����.

�ϳ��� �ٿ��� ���� �����ٿ� ����ִ� �丶���� ���°� M���� ������ �־�����.

���� 1�� ���� �丶��, ���� 0�� ���� ���� �丶��, ���� -1�� �丶�䰡 ������� ���� ĭ�� ��Ÿ����.


���
�������� �丶�䰡 ��� ���� �������� �ּ� ��¥�� ����ؾ� �Ѵ�.

����, ����� ������ ��� �丶�䰡 �;��ִ� �����̸� 0�� ����ؾ� �ϰ�,

�丶�䰡 ��� ������ ���ϴ� ��Ȳ�̸� -1�� ����ؾ� �Ѵ�.


���� �Է� 1 

6 4
0 0 -1 0 0 0
0 0 1 0 -1 0
0 0 -1 0 0 0
0 0 0 0 -1 1

���� ��� 1
4
 	 */
 	
class Point2
 	{
 		public int x, y;
 		Point2(int x, int y)
 		{
 			this.x = x;
 			this.y = y;
 		}
 	}
 	
public class tomato12 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	static int n, m;
	static Queue<Point2> Q = new LinkedList<>(); //���ι����� ����ؾ��ϹǷ� �ۿ� ����
	
	static void BFS()
	{
		while(!Q.isEmpty())
		{
			Point2 tmp = Q.poll(); //BFS �� ���� ������ �� - �ַ��
			for(int i=0; i<4; i++) //�����¿� 4�� ��
			{
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0)
				{
					board[nx][ny]=1;
					Q.offer(new Point2(nx, ny));
					dis[nx][ny]=dis[tmp.x][tmp.y]+1; //��������
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner kb = new Scanner(System.in);
				m = kb.nextInt(); //��
				n = kb.nextInt(); //��
				board = new int[n][m];
				dis = new int[n][m];
				for(int i=0; i<n; i++)
				{
					for(int j=0;j<m;j++)
					{
						board[i][j] = kb.nextInt();
						if(board[i][j]==1)
						{
							Q.offer(new Point2(i,j));
						}
					}
				}
				BFS();
				boolean flag = true;
				int answer = Integer.MIN_VALUE;
				
				for(int i=0; i<n ;i++)
				{
					for(int j=0; j<m ; j++)
					{
						if(board[i][j]==0)
						{
							flag = false;
						}
					}
				}
				
				if(flag) //���� �丶��� 
				{
					for(int i=0; i<n ;i++)
					{
						for(int j=0; j<m ; j++)
						{
							answer = Math.max(answer, dis[i][j]);
						}
					}
					System.out.println(answer);
				}
				else
				{
					System.out.println(-1);
				}
			

	}

}
