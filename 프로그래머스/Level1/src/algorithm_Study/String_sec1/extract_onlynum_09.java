package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 9. ���ڸ� ����
����

���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.

���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.

�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


���
ù �ٿ� �ڿ����� ����մϴ�.


���� �Է� 1 

g0en2T0s8eSoft
���� ��� 1

208
 */
public class extract_onlynum_09 {
	
	public static int solution(String s)
	{
		int answer = 0;
		
		for(char x : s.toCharArray())
		{	
			if(x>=48 && x<=57)
			{
				answer=answer*10+(x-48);
				if
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));
	}

}
