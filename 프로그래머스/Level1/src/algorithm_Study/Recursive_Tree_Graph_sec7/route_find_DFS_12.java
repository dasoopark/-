package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.Scanner;

/*
 ����׷����� �־����� 1�� �������� n�� �������� ���� ��� ����� ���� ���� ����ϴ�
 ���α׷��� �ۼ��ϼ���. �Ʒ��׷������� 1�� �������� 5�� �������� ���� ���� ����
 
 
 ���� �׷��� �׸��� OneNote �������ּ���
 
 1 2 3 4 5
 1 2 5
 1 3 4 2 5
 1 3 4 5
 1 4 2 5
 1 4 5
 �� 6���� �Դϴ�. 
 
 �Է¼���
 ù° �ٿ��� ������ �� N(1<=N<=20)�� ������ �� M�� �־�����. �� �������� M�ٿ� ���� ���������� �־�����.
 �׷������� ��δ�, �ѹ� �湮�� ���� �ٽ� �湮�ؼ��� �ȵȴ�.!!!!!!!!!!!!!!!!!!!!!!1
 
 ��¼���
 �� �������� ����Ѵ�.
 
 �Է¿��� 1.
 5 9 
 1 2   //1������ 2������ ����
 
 1 3
 1 4
 2 1
 2 3
 2 5
 3 4
 4 2
 4 5
 

 ��¿���1.
 6
 */

public class route_find_DFS_12 {
	static int n, m, answer = 0;
	static int [][] graph;
	static int[] ch;
	
	static void DFS(int v)
	{
		if(v==n)
		{
			answer++;
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				if(graph[v][i]==1 && ch[i]==0) //v:���� ���� , [v][i]==1(����� �ִ���?), ch[i] => �湮�������� 0�̴ϱ�
				{
					ch[i] =1; //�ѹ� �ǳ����� �ߺ�üũ ������� 
					DFS(i);
					ch[i] = 0; //���ư����� �ߺ� üũ Ǯ����� �ٽ� dfs�Ҽ� ����
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //������ ����
		m = kb.nextInt(); //������ ���� 
		graph = new int[n+1][n+1]; // n+1�� ������ : 1���ε������� n�� �ε������� ������ ���;� �ϴϱ�
		ch = new int[n+1]; //üũ�� 1������ n������ �ؾ��ϴϱ� 
		for(int i=0; i<m;i++)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b]= 1; //���� �׷��� ���� -> 1���̸� ����� ��
		}
		ch[1] = 1; //1����� (������� ������ üũ)
		DFS(1);
		System.out.println(answer);
		

	}

}
