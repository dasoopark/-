package algorithm_Study.arrays_1_2space_sec2;

import java.util.Scanner;

/*
 5. �Ҽ�(�����佺�׳׽� ü)  
����

�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.

���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.


�Է�
ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.

���
ù �ٿ� �Ҽ��� ������ ����մϴ�.

���� �Է� 1 
20

���� ��� 1
8

 */
//�����佺�׳׽��� �����ϱ�
public class sosoo_05 {
	static int solution(int n)
	{
		int answer = 0;
		int[] ch = new int[n+1]; //n�� �ε��� ���� �ʿ��ϴϱ� n+1����
		
		for(int i=2; i<=n ;i++) //0,1 �Ҽ� ����
		{
			if(ch[i]==0)
			{
				answer++;
				for(int j=i;j<=n;j=j+i) //�����ŭ ���ƾ� �ϴϱ�  j+i ��
				{
					ch[j] = 1; 
				}
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
