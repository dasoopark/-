package algorithm_Study.Greedy_Algorithm_sec9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
//문제 OneNote 참고하세요 Greedy_algo => 5.다익스트라 알고리즘
/*
 입력예제 
 6정점(n) 9 (간선m)
 6 9
 1 2 12
 1 3 4
 2 1 2
 2 3 5
 2 5 5
 3 4 5
 4 2 2
 4 5 5
 6 4 5
 
 출력예제
 2 : 11
 3 : 4
 4 : 9
 5 : 14
 6 : impossible
 
 */
class Edge implements Comparable<Edge>
{
	public int vex; //정점 저장
	public int cost; //비용 , 값 저장
	Edge(int vex, int cost)
	{
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge ob)
	{
		return this.cost-ob.cost; //가장 작은값 우선 오름차순 
	}
}
public class Dijkstra_algorithm_05 {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int [] dis;
	
	static void solution(int v) //v에 1넘어옴
	{
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v, 0)); //처음에 1,0 => 1번정점까지 가는데 비용이 0이다
		dis[v] = 0;
		
		while(!pQ.isEmpty())
		{
			Edge tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost>dis[now])
			{
				continue;
			}
			for(Edge ob : graph.get(now))
			{
				if(dis[ob.vex]>nowCost+ob.cost)
				{
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		
		graph = new ArrayList<ArrayList<Edge>>();
		
		for(int i = 0; i<= n ;i++)
		{
			graph.add(new ArrayList<Edge>());
		}
		
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE); //무한대 값으로 채워넣음
		for(int i =0; i<m; i++)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c));
		}
		solution(1);
		for(int i=2; i<=n ; i++)
		{
			if(dis[i]!=Integer.MAX_VALUE)
			{
				System.out.println(i+" : "+dis[i]);
			}
			else
			{
				System.out.println(i+" : impossible");
			}
		}
	}
}
