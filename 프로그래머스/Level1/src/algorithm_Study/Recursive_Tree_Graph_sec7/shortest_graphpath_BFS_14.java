package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
 
 문제 그림 OneNote 참고 하세용 _14번
 
 입력설명 
 첫째 줄에는 정점의수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 
 출력설명
 1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.
 
 입력예제 1
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
 
 출력예제 1
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
		ch[v] = 1; //출발지 체크 
		dis[v] = 0; 
		queue.offer(v); //1번 정점 대입
		
		while(!queue.isEmpty())
		{
			int cv = queue.poll();
			for(int nv : graph.get(cv))
			{
				if(ch[nv]==0) //방문안했을때
				{
					ch[nv] = 1; //방문하고 체크해주고 
					queue.offer(nv); //넣어주고
					dis[nv] = dis[cv]+1; //해당 간선에서 온값 +1 onenote참고
				}
			}
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //정점의 개수
		m = kb.nextInt(); //간선의 개수 
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<=n ;i++)	//객체 생성 필수!!!!!!!!!!!!
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
		for(int i=2; i<=n; i++) // 2번부터 출력
		{
			System.out.println(i+" : "+dis[i]);
		}
	}

}
