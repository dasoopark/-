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
public class Seontaeck_sort_01 {
	static int[] solution(int n, int[] arr)
	{
		for(int i=0; i<n-1;i++) //���� �������� �˾Ƽ� �� �����Ƿ� n-1 ���ָ� �˾Ƽ� �� 
		{
			int idx = i; //idx���� �ּҰ��� ����ִ� 
			for(int j=i+1 ; j<n ;j++) //j�� ���ư��鼭 Ȯ���Ѵ�
			{
				if(arr[j]<arr[idx])
				{
					idx = j;
				}
				
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
			}
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
