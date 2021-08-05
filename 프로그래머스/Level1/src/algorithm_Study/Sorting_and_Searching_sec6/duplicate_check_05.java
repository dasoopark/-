package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.Arrays;
import java.util.Scanner;

/*
 ����
������ �ݿ��� N���� �л����� �ֽ��ϴ�.
�������� �� �л��鿡�� 1���� 10,000,000������ �ڿ��� �߿��� ���ڰ� �����ϴ� ���� �ϳ� ���� ����� �߽��ϴ�.
���� N���� �л����� ��� ���� �� �ߺ��� ���ڰ� �����ϸ� D(duplication)�� ����ϰ�,
N���� ��� ���� �ٸ� ���ڸ� ����´ٸ� U(unique)�� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� �ڿ��� N(5<=N<=100,000)�� �־�����.
�� ��° �ٿ� �л����� ���� �� N���� �ڿ����� �Էµȴ�.


���
ù ��° �ٿ� D �Ǵ� U�� ����Ѵ�.


���� �Է� 1 
8
20 25 52 30 39 33 43 33

���� ��� 1
D
 */
public class duplicate_check_05 {
	static String solution(int n, int[] arr)
	{
		String answer = "U";
		Arrays.sort(arr); //������������ �⺻ ���� 
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				return "D";
			}	
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n,arr));

	}

}
