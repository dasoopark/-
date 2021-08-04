package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.Scanner;

/*
 방향그래프가 주어지면 1번 정점에서 n번 정점으로 가는 모든 경로의 가지 수를 출력하는
 프로그램을 작성하세요. 아래그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
 
 
 문제 그래프 그림은 OneNote 참고해주세용
 
 1 2 3 4 5
 1 2 5
 1 3 4 2 5
 1 3 4 5
 1 4 2 5
 1 4 5
 총 6가지 입니다. 
 
 입력설명
 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 그래프에서 경로는, 한번 방문한 것을 다시 방문해서는 안된다.!!!!!!!!!!!!!!!!!!!!!!1
 
 출력설명
 총 가지수를 출력한다.
 
 입력예제 1.
 5 9 
 1 2   //1번에서 2번으로 간다
 
 1 3
 1 4
 2 1
 2 3
 2 5
 3 4
 4 2
 4 5
 

 출력예제1.
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
				if(graph[v][i]==1 && ch[i]==0) //v:시작 정점 , [v][i]==1(연결돼 있는지?), ch[i] => 방문안했을때 0이니깐
				{
					ch[i] =1; //한번 건넜을땐 중복체크 해줘야함 
					DFS(i);
					ch[i] = 0; //돌아갈때는 중복 체크 풀어줘야 다시 dfs할수 있음
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //정점의 개수
		m = kb.nextInt(); //간선의 개수 
		graph = new int[n+1][n+1]; // n+1을 한이유 : 1번인덱스부터 n번 인덱스까지 정정이 나와야 하니깐
		ch = new int[n+1]; //체크도 1번부터 n번까지 해야하니깐 
		for(int i=0; i<m;i++)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b]= 1; //방향 그래프 설정 -> 1번이면 연결된 거
		}
		ch[1] = 1; //1번노드 (출발지는 무조건 체크)
		DFS(1);
		System.out.println(answer);
		

	}

}
