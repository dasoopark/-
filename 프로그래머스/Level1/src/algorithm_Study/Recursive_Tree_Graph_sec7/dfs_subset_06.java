package algorithm_Study.Recursive_Tree_Graph_sec7;

/*
 �ڿ��� N�� �־�����, 1���� N������ ���Ҹ� ���� ������ �κ������� ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
 
 �Է¼���
 ù ��° �ٿ�, �ڿ��� N(1<=N<=10)�� �־����ϴ�.
 
 ��¼���
 ù �� ° �ٺ��� �� �ٿ� �ϳ��� �κ������� �Ʒ��� ��¿����� ���� ������ ����Ѵ�.
 �� �������� ������� �ʽ��ϴ�.
 
 �Է¿���1
 3
 
 ��¿���1
 1 2 3
 1 2
 1 3
 1
 2 3
 2
 3
 
 */

/*
 Ǯ��
  2^n��  => �κ������� �� ����
 */
public class dfs_subset_06 {
	static int n;
	static int[] ch; // üũ ��
	
	static void DFS(int L)
	{
		if(L==n+1)
		{
			String tmp="";
			for(int i=1; i<=n;i++)
			{
				if(ch[i]==1)
				{
					tmp+=(i+" ");
				}

			}
			if(tmp.length()>0)
			{
				System.out.println(tmp);
			}
		}
		else
		{
			ch[L]=1; //����ϸ� 1
			DFS(L+1); //�� ������ ����
			ch[L]=0; //��� ���ϸ� 0
			DFS(L+1); //���������� ����
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 3;
		ch = new int[n+1]; 
		DFS(1);
	}

}
