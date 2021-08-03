package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.LinkedList;
import java.util.Queue;

/*
Tree ���� �������� ���� ª�� ���

�Ʒ� �׸��� ���� ����Ʈ������ ��Ʈ ��� 1���� ���ܳ������� ���� �� ���� ª�� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���.
�� ����� ���̴� ��Ʈ��忡�� ���ܳ����� ���µ� �̵��ϴ� Ƚ���� �� ����(����)�� ������ ���̷� �ϰڽ��ϴ�.

  1
 2  3
4 5

 ���� ª�� ���̴� 3�� �������� ������ 1�̴�. 
 
 //���� ��� = > �ڽ��� �ƿ� ���� ��� 

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

public class shortest_treepath_bfs_10 { // �̹����� BFS�� Ǫ�°� �°� 09���� Ǭ�� DFS�� ���� ���ظ� �ϱ� ���� Ǭ ����

	//������ BFS�� ���� Ž���� �ϴ°� ����
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
				if(cur.lt==null && cur.rt==null) //���� ��� �϶�
				{
					return L;
				}
				if(cur.lt!=null) // ���� ��尡 �ƴ� ��
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
