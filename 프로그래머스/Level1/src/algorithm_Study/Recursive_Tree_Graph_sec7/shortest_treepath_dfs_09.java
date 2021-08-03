package algorithm_Study.Recursive_Tree_Graph_sec7;

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

public class shortest_treepath_dfs_09 { //dfs 왼쪽 자식 오른쪽 자식 탐색하면서 root가 가리키는게 바뀜!!!!!!ㄱ
	//트리 문제는 BFS 로 활용하는게 나음 - 그림, 스택으로 원리 이해 하기
		Node root;
		static int DFS(int L, Node root)
		{
			if(root.lt==null && root.rt==null)
			{
				return L; //마지막 말단노드면 레벨을 반환 L!
			}
			else // 말단노드가 아니면 뻗어나가야함 
			{
				return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shortest_treepath_dfs_09 tree = new shortest_treepath_dfs_09();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		System.out.println(DFS(0,tree.root));

	}

}
