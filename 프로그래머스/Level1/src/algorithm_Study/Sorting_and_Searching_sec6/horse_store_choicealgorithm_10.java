package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 10. ������ ���ϱ�(�����˰���)
����
N���� �������� �������� �ֽ��ϴ�. �� �������� x1, x2, x3, ......, xN�� ��ǥ�� ������, ���������� ��ǥ�� �ߺ��Ǵ� ���� �����ϴ�.
������ C������ ���� ������ �ִµ�, �� ������ ���� ������ �ִ� ���� �������� �ʽ��ϴ�. �� ���������� �� ������ ���� ���� �� �ְ�,
���� ����� �� ���� �Ÿ��� �ִ밡 �ǰ� ���� �������� ��ġ�ϰ� �ͽ��ϴ�.
C������ ���� N���� �������� ��ġ���� �� ���� ����� �� ���� �Ÿ��� �ִ밡 �Ǵ� �� �ִ밪�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù �ٿ� �ڿ��� N(3<=N<=200,000)�� C(2<=C<=N)�� ������ ���̿� �ΰ� �־����ϴ�.
��° �ٿ� �������� ��ǥ xi(0<=xi<=1,000,000,000)�� ���ʷ� �־����ϴ�.

���
ù �ٿ� ���� ����� �� ���� �ִ� �Ÿ��� ����ϼ���.

���� �Է� 1 
5 3
1 2 8 4 9

���� ��� 1
3
 */
public class horse_store_choicealgorithm_10 {
	static int count(int []arr, int capacity)//���� �� �� �ʿ��ϴٰ� ����  
	{	//capacity = m��(lt+rt)/2
		int cnt = 1; //DVD ��� 
		int ep = arr[0]; //���� �� ��ġ
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]-ep>=capacity) //�Ÿ�����
			{
				cnt++;
				ep=arr[i]; 
			}
		}
			
		return cnt;
	}
	
	static int solution(int n, int m, int[] arr) 
	{
		int answer =0;
		
		Arrays.sort(arr); //��ǥ�ϱ� �������� ���� �������
		int lt = 1;
		int rt = arr[n-1];
		
		while(lt<=rt)
		{
			int mid = (lt+rt)/2;
			if(count(arr,mid)>=m)
			{
				answer=mid;
				lt = mid+1;
			}
			else
			{
				rt=mid-1;
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); 
		int m = kb.nextInt();
		int []arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n,m,arr));


	}

}
