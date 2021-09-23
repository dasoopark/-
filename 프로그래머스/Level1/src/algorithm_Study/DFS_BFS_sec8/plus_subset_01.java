package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/* ���� ���� �κ�����
 * 
 1. ���� ���� �κ�����(DFS : �Ƹ��� ���ͺ�)
����

N���� ���ҷ� ������ �ڿ��� ������ �־�����, �� ������ �� ���� �κ��������� �������� ��

�� �κ������� ������ ���� ���� ���� ��찡 �����ϸ� ��YES"�� ����ϰ�, �׷��� ������ ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ѷ� ������ �� �κ������� ���μ� �����̸�, �� �κ������� ���ϸ� �Է����� �־��� ������ ������ �Ǿ� �մϴ�.

���� ��� {1, 3, 5, 6, 7, 10}�� �ԷµǸ� {1, 3, 5, 7} = {6, 10} ���� �� �κ������� ���� 16���� ���� ��찡 �����ϴ� ���� �� �� �ִ�.


�Է�
ù ��° �ٿ� �ڿ��� N(1<=N<=10)�� �־����ϴ�.

�� ��° �ٿ� ������ ���� N���� �־�����. �� ���Ҵ� �ߺ����� �ʴ´�.


���
ù ��° �ٿ� ��YES" �Ǵ� ��NO"�� ����Ѵ�.


���� �Է� 1 

6
1 3 5 6 7 10  

���� ��� 1
YES
 
 */
public class plus_subset_01 {
	 static String answer = "NO";
	 static int n, total =0;
	 static boolean flag = false;
	 
	 static void DFS(int L , int sum, int[] arr)
	 {
		 if(flag)
		 {
			 return; // Ʈ��� �Ѿ���� ��� �� ���� �ϱ�
		 }
		 if(sum>total/2) //�������� ������
		 {
			 return; 
		 }
		 if(L==n)
		 {
			 if((total-sum)==sum)
			 {
				 answer = "YES";
				 flag = true;
			 }
			 
		 }
		 else
		 {
			 DFS(L+1, sum+arr[L], arr); //sum�� arr �κ����� ����
			 DFS(L+1, sum, arr);
		 }
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n ; i++)
		{
			arr[i] = kb.nextInt();
			total+= arr[i];
		}
		DFS(0,0,arr);
		System.out.println(answer);

	}

}
