package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 10. �̷�Ž��(DFS)
����

7*7 ������ �̷θ� Ż���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.

������� ������ (1, 1) ��ǥ�̰�, Ż�� �������� (7, 7)��ǥ�̴�. �������� 1�� ���̰�, 0�� ����̴�.

�������� �������� �����¿�θ� �����δ�. �̷ΰ� ������ ���ٸ�

Image1.jpg

���� �������� ��������� ���������� �� �� �ִ� ����� ���� 8�����̴�.


�Է�
7*7 �������� ������ �־����ϴ�.


���
ù ��° �ٿ� ����� �������� ����Ѵ�.


���� �Է� 1 

0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0

���� ��� 1
8

 */
public class mirror_search_10 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board;
	static int answer = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		

	}

}
