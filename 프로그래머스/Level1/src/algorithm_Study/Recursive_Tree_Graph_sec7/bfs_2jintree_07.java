package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.LinkedList;
import java.util.Queue;

/*
  문제 one note 참고
     1
   2    3
  4 5  6 7
  아래 그림과 같은 이진트리를 레벨탐색 연습하세요.
  
  레벨 탐색 순회 출력 : 1 2 3 4 5 6 7 
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
public class bfs_2jintree_07 {
	Node root;
	void BFS(Node root)
	{
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty())
		{
			int len = Q.size();
			System.out.print(L+ " : "); //0 레벨 엔 어떤 원소~~ 1레벨엔 어떤 원소~~ 
			for(int i=0; i<len;i++)
			{
				Node cur = Q.poll(); //Q의 맨 앞에 있는게 나옴 
				System.out.print(cur.data+" ");
				if(cur.lt!=null)
				{
					Q.offer(cur.lt);
				}
				if(cur.rt!=null)
				{
					Q.offer(cur.rt);
				}
				
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bfs_2jintree_07 tree = new bfs_2jintree_07();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
		
		
	}

}
