import java.util.Scanner;

/*
 4. ���� �κм���
����

N���� ���� �̷���� ������ �־����ϴ�.

�� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.

���� N=8, M=6�̰� ������ ������ ���ٸ�

1 2 1 3 1 1 1 2

���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.


�Է�
ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����.

������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.

���
ù° �ٿ� ����� ���� ����Ѵ�.

���� �Է� 1  

8 6
1 2 1 3 1 1 1 2
���� ��� 1

3
 */
public class rrr {
	
	static int solution(int n, int m, int[] arr)
	{
		int answer = 0, sum = 0, lt =0;
		for(int rt =0; rt<n; rt++)
		{
			sum+=arr[rt];
			if(sum==m) //sum �� lt���� rt������ �� 
			{
				answer++;
			}
			while(sum>=m)
			{
				sum-=arr[lt++]; //���� lt���� ����
				if(sum==m) answer++;
			}
			
		}
		
		return answer;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n,m,arr));
		
	}

}
