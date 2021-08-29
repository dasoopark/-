package algorithm_Study.dynamic_programming_sec10;

import java.util.Scanner;

/*
 3. �ִ����� ���ϱ�(DFS)
����

�̹� �����ø��ǾƵ��ȸ���� ���� ������ ���� ���Ͽ� ������ �������� �ֽ� N���� ������ Ǯ���� �մϴ�.
�� ������ �װ��� Ǯ���� �� ��� ������ Ǫ�µ� �ɸ��� �ð��� �־����� �˴ϴ�.
���ѽð� M�ȿ� N���� ���� �� �ִ������� ���� �� �ֵ��� �ؾ� �մϴ�.
(�ش繮���� �ش�ð��� �ɸ��� Ǫ�� �ɷ� �����Ѵ�, �� ������ �Ѱ��� Ǯ �� �ֽ��ϴ�.)


�Է�
ù ��° �ٿ� ������ ����N(1<=N<=20)�� ���� �ð� M(10<=M<=300)�� �־����ϴ�.
�� ��° �ٺ��� N�ٿ� ���� ������ Ǯ���� ���� ������ Ǫ�µ� �ɸ��� �ð��� �־����ϴ�.


���
ù ��° �ٿ� ���� �ð��ȿ� ���� �� �ִ� �ִ� ������ ����մϴ�.

���� �Է� 1 
5 20
10 5
25 12
15 8
6 3
7 4

���� ��� 1
41

 */
public class highest_score_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dy = new int[m+1];
		for(int i=0; i<n;i++)
		{
			int ps = kb.nextInt();
			int pt = kb.nextInt();
			for(int j=m; j>=pt;j--) //�ߺ� �����Ϸ��� �ڿ��� ��
			{
				dy[j] = Math.max(dy[j], dy[j-pt]+ps);
			}
		}
		System.out.println(dy[m]);
	}

}
