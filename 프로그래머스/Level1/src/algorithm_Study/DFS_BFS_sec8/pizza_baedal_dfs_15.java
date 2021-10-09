package algorithm_Study.DFS_BFS_sec8;

import java.util.ArrayList;
import java.util.Scanner;

/*
 14. ���� ��� �Ÿ�(�Ｚ SW������ ���⹮�� : DFSȰ��)
����

N��N ũ���� ���������� �ֽ��ϴ�. ���������� 1��1ũ���� ����ĭ���� �̷���� �ֽ��ϴ�.

�� ����ĭ���� 0�� ��ĭ, 1�� ��, 2�� ���������� ǥ���˴ϴ�. �� ����ĭ�� ��ǥ(���ȣ, �� ��ȣ)�� ǥ���˴ϴ�.

���ȣ�� 1������ N�������̰�, �� ��ȣ�� 1���� N�����Դϴ�.

���ÿ��� �� ������ �����ڹ�ްŸ����� �Ҵµ� �� ���� ���ڹ�ްŸ��� �ش� ���� ������ �����ϴ�

����������� �Ÿ� �� �ּҰ��� �ش� ���� �����ڹ�ްŸ������ �Ѵ�.

���� �������� ���ڹ�ްŸ��� |x1-x2|+|y1-y2| �̴�.

���� ���, ������ ������ �Ʒ��� ���ٸ�

Image1.jpg

(1, 2)�� �ִ� ���� (2, 3)�� �ִ� ���������� ���� ��� �Ÿ��� |1-2| + |2-3| = 2�� �ȴ�.

�ֱ� ���ð� �Ұ�⿡ ������ �����׼� ����� ���������� �Ļ��ϰ� �ֽ��ϴ�.

���� ������ ���ÿ� �ִ� ������ �� M���� �츮�� �������� �������� �ְ� �����Ű���� �մϴ�.

������ �츮���� �ϴ� ������ M���� �����ϴ� �������� ������ ���ڹ�ްŸ��� �ּҰ� �Ǵ� M���� �������� �����Ϸ��� �մϴ�.

������ ���� ��� �Ÿ��� �� ������ ���� ��� �Ÿ��� ���� ���� ���մϴ�.


�Է�
ù° �ٿ� N(2 �� N �� 50)�� M(1 �� M �� 12)�� �־�����.

��° �ٺ��� ���� ������ �Էµȴ�.


���
ù° �ٿ� M���� �������� ���õǾ��� �� ������ �ּ� ���ڹ�ްŸ��� ����Ѵ�.


���� �Է� 1 

4 4
0 1 2 0
1 0 2 1
0 2 1 2
2 0 1 2
���� ��� 1

6
 */

class Point3
{
	public int x, y;
	Point3(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class pizza_baedal_dfs_15 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point3> pz, hs;
	static void DFS(int L, int s)
	{
		if(L==m)
		{
			for(int x : combi)
			{
				System.out.print(x+ " ");
			}
			System.out.println();
		}
		else
		{
			for(int i = s; i<len;i++) //������ �̱�
			{
				combi[L] = i; 
				DFS(L+1, i+1); 
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				int tmp = kb.nextInt();
				if(tmp==1)
				{
					hs.add(new Point3(i, j)); //���϶� �߰�
				}
				else if(tmp==2)
				{
					pz.add(new Point3(i, j)); //�������϶� �߰�
				}
			}
		}
		len = pz.size();
			combi = new int[m];	//���ϰ��� �ϴ� �� : lenCm
			DFS(0,0);
		System.out.println(answer);
	}

}
