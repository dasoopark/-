package algorithm_Study.Recursive_Tree_Graph_sec7;

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

public class shortest_treepath_dfs_09 { //dfs ���� �ڽ� ������ �ڽ� Ž���ϸ鼭 root�� ����Ű�°� �ٲ�!!!!!!��
	//Ʈ�� ������ BFS �� Ȱ���ϴ°� ���� - �׸�, �������� ���� ���� �ϱ�
		Node root;
		static int DFS(int L, Node root)
		{
			if(root.lt==null && root.rt==null)
			{
				return L; //������ ���ܳ��� ������ ��ȯ L!
			}
			else // ���ܳ�尡 �ƴϸ� ��������� 
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
