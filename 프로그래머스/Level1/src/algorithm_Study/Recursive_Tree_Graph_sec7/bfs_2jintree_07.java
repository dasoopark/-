package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.LinkedList;
import java.util.Queue;

/*
  ���� one note ����
     1
   2    3
  4 5  6 7
  �Ʒ� �׸��� ���� ����Ʈ���� ����Ž�� �����ϼ���.
  
  ���� Ž�� ��ȸ ��� : 1 2 3 4 5 6 7 
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
			System.out.print(L+ " : "); //0 ���� �� � ����~~ 1������ � ����~~ 
			for(int i=0; i<len;i++)
			{
				Node cur = Q.poll(); //Q�� �� �տ� �ִ°� ���� 
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
