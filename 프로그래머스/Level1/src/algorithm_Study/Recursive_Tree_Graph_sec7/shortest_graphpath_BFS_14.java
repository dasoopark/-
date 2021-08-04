package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 ���� �׷������� 1�� �������� �� �������� ���� �ּ� �̵� �������� ����ϼ���.
 
 ���� �׸� OneNote ���� �ϼ��� _14��
 
 �Է¼��� 
 ù° �ٿ��� �����Ǽ� N(1<=N<=20)�� ������ �� M�� �־�����. �� �������� M�ٿ� ���� ���������� �־�����.
 
 ��¼���
 1�� �������� �� �������� ���� �ּ� �������� 2�� �������� ���ʴ�� ����ϼ���.
 
 �Է¿��� 1
 6 9
 1 3
 1 4
 2 1
 2 5
 3 4
 4 5 
 4 6
 6 2
 6 5
 
 ��¿��� 1
 2 : 3
 3 : 1
 4 : 1
 5 : 2
 6 : 2
 
 */
public class shortest_graphpath_BFS_14 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[]ch, dis;
	static void BFS(int v)
	{
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1; //����� üũ 
		dis[v] = 0; 
		queue.offer(v); //1�� ���� ����
		
		while(!queue.isEmpty())
		{
			int cv = queue.poll();
			for(int nv : graph.get(cv))
			{
				if(ch[nv]==0) //�湮��������
				{
					ch[nv] = 1; //�湮�ϰ� üũ���ְ� 
					queue.offer(nv); //�־��ְ�
					dis[nv] = dis[cv]+1; //�ش� �������� �°� +1 onenote����
				}
			}
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //������ ����
		m = kb.nextInt(); //������ ���� 
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<=n ;i++)	//��ü ���� �ʼ�!!!!!!!!!!!!
		{
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		
		for(int i=0; i<m; i++)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		
		BFS(1);
		for(int i=2; i<=n; i++) // 2������ ���
		{
			System.out.println(i+" : "+dis[i]);
		}
	}

}
