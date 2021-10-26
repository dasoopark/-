package algorithm_Study.two_pointer_slidingwin_sec3;

import java.util.ArrayList;
import java.util.Scanner;

/*
 1. �� �迭 ��ġ��
����

������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.

�� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�.

�� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.

�� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�.

�� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.


���
������������ ���ĵ� �迭�� ����մϴ�.


���� �Է� 1 

3
1 3 5
5
2 3 6 7 9
���� ��� 1

1 2 3 3 5 6 7 9
 */
public class two_pointer_algorithm {
	
	static public ArrayList<Integer> solution(int n, int m, int []a, int[] b)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 =0, p2 =0; //������
		
		while(p1<n && p2<m)
		{
			if(a[p1]<b[p2])
			{
				answer.add(a[p1++]); //�ļ��� ������, p1�� ����Ű�� ���� �ֵ��ϰ� 1������!!!!!!!!!!!!!!!!!!!!!!
			}
			
			else
			{
				answer.add(b[p2++]);
			}
			
		}
		
		while(p1<n) //���������� �����͸� �̵��ϸ鼭 �־���
		{
			answer.add(a[p1++]);
		}
		
		while(p2<m)
		{
			answer.add(b[p2++]);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++)
		{
			b[i] = kb.nextInt();
		}
		for(int x : solution(n,m,a,b))
		{
			System.out.print(x + " ");
		}
	}

}
