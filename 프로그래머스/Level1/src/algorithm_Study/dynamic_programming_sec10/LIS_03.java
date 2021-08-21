package algorithm_Study.dynamic_programming_sec10;

import java.util.Scanner;

/*
 �ִ� ���� ����
 
 3. �ִ� �κ� ��������
����

N���� �ڿ����� �̷���� ������ �־����� ��, �� �߿��� ���� ��� �����ϴ�(���� ������ ū ����) ���ҵ��� ������ ã�� ���α׷��� �ۼ��϶�.

���� ���, ���Ұ� 2, 7, 5, 8, 6, 4, 7, 12, 3 �̸� ���� ��� �����ϵ��� ���ҵ��� ���ʴ�� �̾Ƴ��� 2, 5, 6, 7, 12�� �̾Ƴ���

���̰� 5�� �ִ� �κ� ���������� ���� �� �ִ�.


�Է�
ù° ���� �ԷµǴ� �������� �� N(3��N��1,000, �ڿ���)�� �ǹ��ϰ�,

��° ���� N���� �Էµ����͵��� �־�����.


���
ù ��° �ٿ� �κ����������� �ִ� ���̸� ����Ѵ�.


���� �Է� 1 
8
5 3 7 8 6 2 9 4

���� ��� 1
4
 */
public class LIS_03 {

		static int [] dy;
		static int solution(int[] arr)
		{
			int answer =0;
			dy=new int[arr.length];
			dy[0] = 1;
			
			for(int i=1;i<arr.length;i++)
			{
				int max = 0;
				for(int j=i-1; j>=0;j--)
				{	//�ٷ� �տ� ��
					if(arr[j]<arr[i] && dy[j]>max)
					{
						max=dy[j];
					}
					dy[i]=max+1;
					answer=Math.max(answer, dy[i]);
				} 
			}
			
			return answer;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(arr));

	}

}
