package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.Scanner;

/*
����

N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�����ϴ� ����� ���������Դϴ�.


�Է�
ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.

�� ��° �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµ˴ϴ�. �� �ڿ����� ������ ���� �ȿ� �ֽ��ϴ�.


���
������������ ���ĵ� ������ ����մϴ�.


���� �Է� 1 

6
13 5 11 7 23 15
���� ��� 1

5 7 11 13 15 23

*/

public class insert_sort_03 {
	static int[] solution(int n, int[] arr)
	{
		for(int i=1;i<n;i++) //1���ε��� ���� ����
		{
			int tmp = arr[i], j;
			for(j=i-1; j>=0 ; j--) //i-1���� 0���� ���鼭 ���ƺ�
			{
				if(arr[j]>tmp)
				{
					arr[j+1] = arr[j];
				}
				else
				{
					break;
				}
				
			}
			arr[j+1] = tmp; // ����κ�
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i<n ; i++)
		{
			arr[i] = kb.nextInt();
		}
		
		for(int x : solution(n,arr))
		{
			System.out.print(x+ " ");
		}

	}

}
