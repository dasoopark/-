package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 3. ���� �� �ܾ�
����

�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.

������� �� �ܾ�� �������� ���е˴ϴ�.


�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��

�ܾ ������ �մϴ�.


���� �Է� 1 

it is time to study
���� ��� 1

study
 */
public class moonjang_sok_word_03 {
	
	public static String solution(String str)
	{
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" "); // ���⸦ �������� ���ڿ� ���� s �迭�� ���� ����
		for(String x : s)
		{
			int len = x.length();
			if(len>m)
			{
				m = len;
				answer = x;
			}
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(solution(str));
	}

}
