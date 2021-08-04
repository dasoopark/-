package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.ArrayList;
import java.util.Scanner;


//문제 동일합니다 _12번 원노트 참고


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
1 2   
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

//인접 리스트로 풀어보기~~ _12번은 인접 행렬로 풀어져 있는거임
// 인접리스트  쓰는 경우:  정점의수(N)가 1~10000 처럼 돼 있거나 존나 큰 경우, 인접리스트가 더 효율적임


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
				if(ch[nv]==0) //방문 안했냐?
				{
					ch[nv] =1; //방문했다고 체크
					DFS(nv);
					ch[nv] = 0; //호출하고 리턴할때 방문한거 돌려줌 
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //정점의 개수
		m = kb.nextInt(); //간선의 개수 
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<=n ;i++)	//객체 생성 필수!!!!!!!!!!!!
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
