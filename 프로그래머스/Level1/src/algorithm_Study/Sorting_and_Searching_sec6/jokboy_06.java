package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 ����

�� �бⰡ ���۵Ǿ����ϴ�. ö���� �� ¦���� ���� �ʹ� ���� �����ϴ�.
ö���� �ݿ��� N���� �л����� �ֽ��ϴ�.
�������� �� �л��鿡�� �� ��ȣ�� ���� �ֱ� ���� ��忡 �� �л����� Ű�� ���� ���� �л����� �Ϸķ� Ű������ �������ϴ�.

���� �տ� ���� ���� �л����� �� ��ȣ�� 1������ N������ �ο��մϴ�. ö���� ¦�Ẹ�� Ű�� Ů�ϴ�.
�׷��� ö���� �� ��ȣ�� �ް� �;� ¦��� �ڸ��� �ٲ���ϴ�.
�������� �� ����� �𸣰� �л��鿡�� ���ִ� ������� ��ȣ�� �ο��߽��ϴ�.

ö���� ¦���� �ڸ��� �ٲ� �� �л����� �Ϸķ� ���ִ� Ű ������ �־��� �� ö���� ���� ��ȣ�� ö�� ¦���� ���� ��ȣ��
���ʷ� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� �ڿ��� N(5<=N<=100)�� �־�����.
�� ��° �ٿ� ���� �տ����� �Ϸķ� ���ִ� �л����� Ű�� �־�����.
Ű(����) �� H�� (120<=H<=180)�� �ڿ��� �Դϴ�.


���
ù ��° �ٿ� ö���� �� ��ȣ�� ¦���� �� ��ȣ�� ���ʷ� ����մϴ�.


���� �Է� 1 
9
120 125 152 130 135 135 143 127 160

���� ��� 1
3 8

��Ʈ
����ؼ� : Ű ���� 152�� ö���̰�, 127�� ö�� ¦���Դϴ�.
 */

//�峭 �ٷ��� ����
public class jokboy_06 {
	static ArrayList<Integer> solution(int n, int[] arr)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone(); // clone���� ���� ���簡 ��
		Arrays.sort(tmp);	//���� ����� ���ϰ� �� �� ���� - ��������
		
		for(int i =0; i<n;i ++)
		{
			if(arr[i]!=tmp[i]) //���� �迭�̶� �ٸ� �� 
			{
				answer.add(i+1); //index �� 0���� ���� �����Ƿ� ��ȣ �������� +1�� ����� ��.
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
