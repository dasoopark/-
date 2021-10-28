package algorithm_Study.two_pointer_slidingwin_sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 2. ������� ���ϱ�
 
����
A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.

�� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.

�� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.

�� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.

�� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.


���
�� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.


���� �Է� 1 
5
1 3 9 5 2
5
3 2 5 7 8

���� ��� 1
2 3 5
 */

public class same_element_02 {
	static public ArrayList<Integer> solution(int n, int m, int[] a, int []b)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(a);  //�������� ����
		Arrays.sort(b); //b
		
		int p1=0, p2=0; //�������� ����
		
		while(p1<n && p2< m)
		{
			if(a[p1] == b[p2])
			{
				answer.add(a[p1++]);
				p2++; //������ ����
			}
			
			else if(a[p1]<b[p2])
			{
				p1++;
			}
			else
			{
				p2++;
			}
		
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int []b = new int[m];
		
		for(int i=0; i<m; i++)
		{
			b[i] = kb.nextInt();
		}
		
		for(int x : solution(n,m,a,b))
		{
			System.out.println(x+" ");
		}
	}

}
