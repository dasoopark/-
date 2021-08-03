package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.LinkedList;
import java.util.Queue;

/*
Tree 말단 노드까지의 가장 짧은 경로

아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 갯수를 길이로 하겠습니다.

  1
 2  3
4 5

 가장 짧은 길이는 3번 노드까지의 길이인 1이다. 
 
 //말단 노드 = > 자식이 아예 없는 노드 

*/


class Node{
	int data;
	Node lt, rt;
	public Node(int val)
	{
		data = val;
		lt=rt=null;
	}
}

public class shortest_treepath_bfs_10 { // 이문제는 BFS로 푸는게 맞고 09에서 푼건 DFS에 대한 이해를 하기 위해 푼 것임

	//정석은 BFS로 레벨 탐색을 하는게 맞음
	Node root;
	static int BFS(Node root)
	{
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		
		while(!Q.isEmpty())
		{
			int len = Q.size();
			for(int i=0; i< len; i++)
			{
				Node cur = Q.poll();
				if(cur.lt==null && cur.rt==null) //말단 노드 일때
				{
					return L;
				}
				if(cur.lt!=null) // 말단 노드가 아닐 때
				{
					Q.offer(cur.lt);
				}
				if(cur.rt!=null)
				{
					Q.offer(cur.rt);
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		shortest_treepath_bfs_10 tree = new shortest_treepath_bfs_10();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(BFS(tree.root));
		
	}

}
