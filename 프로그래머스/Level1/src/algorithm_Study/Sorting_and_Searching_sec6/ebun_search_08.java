package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.Arrays;
import java.util.Scanner;

/*
 ����
������ N���� ���ڰ� �Է����� �־����ϴ�. N���� ���� ������������ ������ ���� N���� �� �� �� ���� ���� M�� �־�����
�̺а˻����� M�� ���ĵ� ���¿��� �� ��°�� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���. �� �ߺ����� �������� �ʽ��ϴ�.

�Է�
ù �ٿ� �� �ٿ� �ڿ��� N(3<=N<=1,000,000)�� M�� �־����ϴ�.
�� ��° �ٿ� N���� ���� ������ ���̿� �ΰ� �־����ϴ�.

���
ù �ٿ� ���� �� M�� ���� ��ġ ��ȣ�� ����Ѵ�.

���� �Է� 1 
8 32
23 87 65 12 57 32 99 81

���� ��� 1
3

 */
public class ebun_search_08 {
	
	static int solution(int n, int m, int[] arr)
	{
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt=n-1;//�ǵ� �ε����ϱ� 
		
		while(lt<=rt) //�������� ���� ã������!
		{
			int mid = (lt+rt)/2;
			if(arr[mid]==m)
			{
				answer = mid+1;
				break;
			}
			if(arr[mid]>m)
			{
				rt=mid-1; //��ǥ������ �̺а��� �� Ŭ ��  �������� ���־���
			}
			else
			{
				lt=mid+1; //��ǥ������ �̺а��� �� ���� �� ������ �ٿ��� �� 
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n,m,arr));
	}

}
