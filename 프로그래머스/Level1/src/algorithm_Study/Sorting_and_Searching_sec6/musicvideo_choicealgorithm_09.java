package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 9. ��������(�����˰���)
����
���Ϸ��ڵ忡���� �Ҽ����� ���� �������� ���̺� �������� DVD�� ����� �Ǹ��Ϸ� �Ѵ�.
DVD���� �� N���� ���� ���µ�, DVD�� ��ȭ�� ������ ���̺꿡���� ������ �״�� �����Ǿ�� �Ѵ�.
������ �ٲ�� ���� �츮�� ���� �����ʾ��� �ſ� �Ⱦ��Ѵ�. ��, 1�� �뷡�� 5�� �뷡�� ���� DVD�� ��ȭ�ϱ� ���ؼ���
1���� 5�� ������ ��� �뷡�� ���� DVD�� ��ȭ�ؾ� �Ѵ�. ���� �� �뷡�� �ɰ��� �� ���� DVD�� ��ȭ�ϸ� �ȵȴ�.
���Ϸ��ڵ� ���忡���� �� DVD�� �ȸ� ������ Ȯ���� �� ���� ������ �� ����� ����Ǵ� DVD�� ������ ���̷��� �Ѵ�.
��� ���� ���Ϸ��ڵ�� M���� DVD�� ��� �������� ��ȭ�ϱ�� �Ͽ���. �� �� DVD�� ũ��(��ȭ ������ ����)�� �ּҷ� �Ϸ��� �Ѵ�.
�׸��� M���� DVD�� ��� ���� ũ�⿩�� ���������� ���� ��� ������ �� ���� ũ��� �ؾ� �Ѵ�.
�Է�

ù° �ٿ� �ڿ��� N(1��N��1,000), M(1��M��N)�� �־�����.
���� �ٿ��� �������� ���̺꿡�� �θ� ������� �θ� ���� ���̰� �� ������(�ڿ���) �־�����.
�θ� ���� ���̴� 10,000���� ���� �ʴ´ٰ� ��������.

���
ù ��° �ٺ��� DVD�� �ּ� �뷮 ũ�⸦ ����ϼ���.
���� �Է� 1 
9 3
1 2 3 4 5 6 7 8 9

���� ��� 1
17

��Ʈ
���� : 3���� DVD�뷮�� 17��¥���̸� (1, 2, 3, 4, 5) (6, 7), (8, 9) �̷��� 3���� DVD�� ������ �� �� �ִ�.

17�� �뷮���� ���� �뷮���δ� 3���� DVD�� ��� ������ ��ȭ�� �� ����.


 */
public class musicvideo_choicealgorithm_09 {
	static int count(int []arr, int capacity)//���� �� �� �ʿ��ϴٰ� ����  
	{	//capacity = m��(lt+rt)/2
		int cnt = 1; //DVD ��� 
		int sum = 0; //dvd�� ��Ƴ��� ����
		
		for(int x : arr)
		{
			if(sum+x>capacity) // ù�� °�� sum�� �ֱ�
			{
				cnt++;  //m�� �ʰ� �ϸ� ���ο� dvd �� �ʿ���!
				sum = x; //sum�� ���� dvd�� �����ǰ� �ִ� �뷮�� �󸶳� ���� �Ǵ°�
			}
			else
			{
				sum+=x; //
			}
			
		}
		return cnt;
	}
	
	static int solution(int n, int m, int[] arr) 
	{
		int answer =0;
		int lt = Arrays.stream(arr).max().getAsInt(); //�ִ밪 �����ϰ� ã���ִ� �޼���
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt)
		{
			int mid = (lt+rt)/2;
			if(count(arr,mid)<=m) //��ǥ�� ���� �۰� �������� EX) 3�� �ʿ��ѵ� 2�� ���� �׷� �翬�� 3�嵵 �����ϴ� ��
			{
				answer=mid;
				rt = mid-1;
			}
			else
			{ // OneNote �����ϼ���!
				lt = mid+1;
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
