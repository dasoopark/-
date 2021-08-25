package algorithm_Study.dynamic_programming_sec10;

import java.util.Arrays;
import java.util.Scanner;

/*
 5. ������ȯ
����

������ ���� ���� ������ �������� �־��� ������ �Ž������� ���� ���� ���� �������� ��ȯ���ַ��� ��� �ָ� �Ǵ°�?
�� ������ ������ ������ �� �� �ִ�.


�Է�
ù ��° �ٿ��� ������ �������� N(1<=N<=12)�� �־�����. �� ��° �ٿ��� N���� ������ ������ �־�����,
�� �����ٿ� �Ž��� �� �ݾ� M(1<=M<=500)�� �־�����.�� ������ ������ 100���� ���� �ʴ´�.


���
ù ��° �ٿ� �Ž��� �� ������ �ּҰ����� ����Ѵ�.

���� �Է� 1 

3
1 2 5
15
���� ��� 1

3
��Ʈ


 */
public class coin_change_05 {
	static int n, m;
	static int[] dy;
	static int solution(int[] coin)
	{
		Arrays.fill(dy, Integer.MAX_VALUE); //ū���ڷ� �ʱ�ȭ
		dy[0] = 0; //���� �տ��� �ʱ�ȭ
		
		for(int i=0;i<n;i++)
		{
			for(int j =coin[i]; j<=m;j++)
			{
				dy[j] = Math.min(dy[j],dy[j-coin[i]]+1);
			}
		}
		return dy[m];
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = kb.nextInt();
		}
		
		m = kb.nextInt();
		dy = new int[m+1];
		System.out.println(solution(arr));

	}

}
