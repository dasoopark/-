package algorithm_Study.DFS_BFS_sec8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 1. �̷��� �ִܰŸ� ���(BFS)
����

7*7 ������ �̷θ� Ż���ϴ� �ִܰ���� ���̸� ����ϴ� ���α׷��� �ۼ��ϼ���.

����� ���̴� ��������� ���������� ���µ� �̵��� Ƚ���� �ǹ��Ѵ�.

������� ������ (1, 1) ��ǥ�̰�, Ż�� �������� (7, 7)��ǥ�̴�. �������� 1�� ���̰�, 0�� �����̴�.

�������� �������� �����¿�θ� �����δ�. �̷ΰ� ������ ���ٸ�

Image1.jpg

���� ���� ��ΰ� �ִ� ����� ���̴� 12�̴�.


�Է�
ù ��° �ٺ��� 7*7 ������ ������ �־����ϴ�.


���
ù ��° �ٿ� �ִ����� ������ ĭ�� ���� ����Ѵ�. ������ �� ������ -1�� ����Ѵ�.


���� �Է� 1 

0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0
���� ��� 1

12

 */

class Point
{
	public int x, y;
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class shortest_mirror11 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	static void BFS(int x, int y)
	{
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		board[x][y] = 1; //�����
		while(!Q.isEmpty())
		{
			Point tmp = Q.poll(); //BFS �� ���� ������ �� - �ַ��
			for(int i=0; i<4; i++) //�����¿� 4�� ��
			{
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0)
				{
					board[nx][ny]=1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny]=dis[tmp.x][tmp.y]+1; //��������
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for(int i=1; i<=7; i++)
		{
			for(int j=1;j<=7;j++)
			{
				board[i][j] = kb.nextInt();
			}
		}
		BFS(1,1);
		if(dis[7][7]==0)
		{
			System.out.println(-1); //�������϶�
		}
		else
		{
			System.out.println(dis[7][7]);
		}
	}

}
