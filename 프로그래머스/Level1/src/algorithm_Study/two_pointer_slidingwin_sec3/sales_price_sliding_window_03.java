package algorithm_Study.two_pointer_slidingwin_sec3;

import java.util.Scanner;

/*
 3. �ִ� ����
����

������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.

���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�

12 1511 20 2510 20 19 13 15

���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.

�������� ������ �����ּ���.


�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.


���
ù �ٿ� �ִ� ������� ����մϴ�.


���� �Է� 1 

10 3
12 15 11 20 25 10 20 19 13 15

���� ��� 1
56
 */
public class sales_price_sliding_window_03 {
	
	static int solution(int n, int k, int[] arr)
	{
		int answer =0, sum =0;
		
		for(int i =0; i<k; i++)
		{
			sum+=arr[i];
		}
		answer=sum;
		
		for(int i=k; i<n; i++) //�а��� �κ�
		{
			sum+=(arr[i]-arr[i-k]); //������
			answer=Math.max(answer, sum);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n;i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n,k,arr));

	}

}
