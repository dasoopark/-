package algorithm_Study.two_pointer_slidingwin_sec3;

import java.util.Scanner;

/*
 5. ���ӵ� �ڿ����� ��
����

N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ 
���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.

���� N=15�̸�

7+8=15

4+5+6=15

1+2+3+4+5=15

�� ���� �� 3������ ��찡 �����Ѵ�.

�Է�
ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.

���
ù �ٿ� �� ������ ����մϴ�.


���� �Է� 1 
15

���� ��� 1
3
 */
public class number_sum_05 {
	
	static int solution(int n)
	{
		int answer = 0, sum = 0, lt =0;
		int m = n/2+1;  //Ÿ���� �����̵� ����
		
		int []arr  = new int[m];
		
		for(int i =0; i<m;i++)
		{
			arr[i] = i+1; //���ӵ� �ڿ��� �迭�� ����
		}
		for(int rt=0; rt<m; rt++)
		{
			sum+=arr[rt];
			
			if(sum==n) answer++; //������ ���
			
			while(sum>=n)
			{
				sum-=arr[lt++]; 
				if(sum==n) answer++;
			}
		}
		return answer;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(solution(n));
	}

}
