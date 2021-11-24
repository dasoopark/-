package algorithm_Study.arrays_1_2space_sec2;

import java.util.Scanner;

/*
 9. ������ �ִ���
����

5*5 �����ǿ� �Ʒ��� ���� ���ڰ� �����ֽ��ϴ�.

Image1.jpg

N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.


�Է�
ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)

�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.


���
�ִ����� ����մϴ�.


���� �Է� 1 

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
���� ��� 1

155
 */
public class cross_maxsum_09 {
	static int solution(int n , int[][] arr)
	{
		int answer = Integer.MIN_VALUE;
		int sum1,sum2; //sum1������ sum2 ������
		
		for(int i=0; i<n;i++)
		{
			sum1 = sum2 =0;
			for(int j=0; j<n ;j++)
			{
				sum1+=arr[i][j]; // �� ���� �� 
				sum2+=arr[j][i]; //�� ���� ��
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
		}
		sum1=sum2=0;
		for(int i=0;i<n;i++)
		{
			sum1+=arr[i][i]; //�밢����
			sum2+=arr[i][n-i-1]; //���밢����
		}
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<n;j++)
			{
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(solution(n, arr));

	}

}
