package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.LinkedList;
import java.util.Queue;

/*
 ����

������ �۾����� �Ҿ���ȴ�. ������ �۾������� ��ġ�����Ⱑ �޷� �ִ�.

������ ��ġ�� �۾����� ��ġ�� ���������� ��ǥ ������ �־����� ������ ���� ��ġ���� �۾����� ��ġ���� ������ ���� ������� �̵��Ѵ�.
�۾����� �������� �ʰ� ���ڸ��� �ִ�.
������ ��ī�� ������ Ÿ�� ���µ� �� ���� ������ ������ 1, �ڷ� 1, ������ 5�� �̵��� �� �ִ�.
�ּ� �� ���� ������ ������ �۾����� ��ġ���� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ������ ��ġ S�� �۾����� ��ġ E�� �־�����. ������ ��ǥ ���� 1���� 10,000�����̴�.

���
������ �ּ�Ƚ���� ���Ѵ�. ���� 1�̻��̸� �ݵ�� �����մϴ�.

���� �Է� 1 
5 14

���� ��� 1
3
 */
public class find_cow_BFS_08 { //BFS ����!!!!!!!!!!!!!!!
	int answer = 0;
	static int[] dis = {1,-1,5};
	static int[] ch; //�ѹ� Q�� ���� (�ߺ� ��� ����)
	static Queue<Integer> Q = new LinkedList<>();
	
	static int BFS(int s, int e)
	{
			ch =  new int[10001]; //��ǥ�� 1���� 10.000 �����ϱ�
			ch[s] = 1;
			Q.offer(s); //������
			
			int L =0;
			while(!Q.isEmpty()) //��������� �����
			{
				int len = Q.size(); //������ �ִ� ������ ���� ,0 ���� �� 1�� , 1������ 3�� // ����Ʈ �׸� ����
				for(int i=0;i<len;i++)
				{
					int x = Q.poll(); //���� ����
					
					for(int j=0; j<3;j++)
					{
						int nx = x+dis[j]; //�ڽĳ�� 
						if(nx==e)
						{
							return L+1;
						}
						if(nx>=1 && nx<=10000 && ch[nx]==0) //ch�� 0�̸� �湮 ���Ѱ���
						{
							Q.offer(nx);
						}
					}
				}
				L++;
			}
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 5;
		int e = 14;
		System.out.println(BFS(s,e));
	}

}
