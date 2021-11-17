package algorithm_Study.arrays_1_2space_sec2;

import java.util.Scanner;

/*
 * 
 3. ���� ���� ��
����

A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.

����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.

���� ��� N=5�̸�

Image1.jpg

�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.

�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.

�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.


���
�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.


���� �Է� 1 

5
2 3 3 1 3
1 1 2 2 3

���� ��� 1
A
B
A
B
D
 */
public class rock_sci_paper_03 {
	static String solution(int n, int[] a, int[] b)
	{
		String answer = "";
		
		for(int i=0; i<n;i++)
		{
			if(a[i]==b[i])
			{
				answer += "D";
			}
			else if(a[i]==1 && b[i]==3)
			{
				answer += "A";
			}
			else if(a[i]==2 && b[i]==1)
			{
				answer += "A";
			}
			else if(a[i]==3 && b[i]==2)
			{
				answer += "A";
			}
			else
			{
				answer += "B";
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[]a = new int[n];
		int[]b = new int[n];
		
		for(int i=0; i<n; i++)
		{
			b[i] = kb.nextInt();
		}
		// TODO Auto-generated method stub
		System.out.println(solution(n,a,b));
	}

}
