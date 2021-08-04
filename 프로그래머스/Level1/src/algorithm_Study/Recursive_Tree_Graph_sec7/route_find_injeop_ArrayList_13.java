package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.ArrayList;
import java.util.Scanner;


//���� �����մϴ� _12�� ����Ʈ ����


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
1 2   
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

//���� ����Ʈ�� Ǯ���~~ _12���� ���� ��ķ� Ǯ���� �ִ°���
// ��������Ʈ  ���� ���:  �����Ǽ�(N)�� 1~10000 ó�� �� �ְų� ���� ū ���, ��������Ʈ�� �� ȿ������


public class route_find_injeop_ArrayList_13 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	static void DFS(int v)
	{
		if(v==n)
		{
			answer++;
		}
		else
		{
			for(int nv : graph.get(v))
			{
				if(ch[nv]==0) //�湮 ���߳�?
				{
					ch[nv] =1; //�湮�ߴٰ� üũ
					DFS(nv);
					ch[nv] = 0; //ȣ���ϰ� �����Ҷ� �湮�Ѱ� ������ 
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //������ ����
		m = kb.nextInt(); //������ ���� 
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<=n ;i++)	//��ü ���� �ʼ�!!!!!!!!!!!!
		{
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i =0;i<m;i++)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1] =1;
		DFS(1);
		System.out.println(answer);
		
		// TODO Auto-generated method stub

	}

}
