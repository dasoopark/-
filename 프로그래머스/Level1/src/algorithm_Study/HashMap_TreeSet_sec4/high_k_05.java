package algorithm_Study.HashMap_TreeSet_sec4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
 5. K��° ū ��
����

������ 1���� 100������ �ڿ����� ���� N���� ī�带 ������ �ֽ��ϴ�. ���� ������ ī�尡 ������ ���� �� �ֽ��ϴ�.

������ �� �� 3���� �̾� �� ī�忡 ���� ���� ���� ���� ����Ϸ��� �մϴ�. 3���� ���� �� �ִ� ��� ��츦 ����մϴ�.

����� �� �� K��°�� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

���� ū ������ ������� ���� 25 25 23 23 22 20 19......�̰� K���� 3�̶�� K��° ū ���� 22�Դϴ�.


�Է�
ù �ٿ� �ڿ��� N(3<=N<=100)�� K(1<=K<=50) �Էµǰ�, �� ���� �ٿ� N���� ī�尪�� �Էµȴ�.


���
ù �ٿ� K��° ���� ����մϴ�. K��° ���� �������� ������ -1�� ����մϴ�.


���� �Է� 1 

10 3
13 15 34 23 45 65 33 11 26 42
���� ��� 1

143
 */
public class high_k_05 {
	static int solution(int []arr, int n, int k)
	{
		int answer = 0;
		TreeSet<Integer> Test = new TreeSet<>(Collections.reverseOrder());
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(arr,n,k));
		

	}

}
