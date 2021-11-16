package algorithm_Study.arrays_1_2space_sec2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 1. ū �� ����ϱ�
����

N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

(ù ��° ���� ������ ����Ѵ�)


�Է�
ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.


���
�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.


���� �Է� 1 

6
7 3 9 5 6 12

���� ��� 1
7 9 6 12

 */
public class big_number_01 {
	static ArrayList<Integer> solution(int n, int[] arr)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i<n; i++) //�տ� ���ں��� ����ؾ� �� ����
		{
			if(arr[i]>arr[i-1])
			{
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n = kb. nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++)
		{
			arr[i] = kb.nextInt();
		}
		
		for(int x: solution(n, arr))
		{
			System.out.println(x +" ");
		}

	}

}
