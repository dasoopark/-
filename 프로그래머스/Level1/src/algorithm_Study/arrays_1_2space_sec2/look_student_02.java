package algorithm_Study.arrays_1_2space_sec2;

import java.util.Scanner;

/*
 2. ���̴� �л�
����

�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)


�Է�
ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.


���
�������� �� �� �ִ� �ִ��л����� ����Ѵ�.


���� �Է� 1 

8
130 135 148 140 145 150 150 153
���� ��� 1

5
 */
public class look_student_02 {
	static int solution(int n, int[] arr)
	{
		int answer = 1;//ù��°���
		int max = arr[0]; //ù��° ���
		
		for(int i =1; i<n;i++)
		{
			if(arr[i]>max)
			{
				answer++;
				max=arr[i];
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n,arr));
	}

}
