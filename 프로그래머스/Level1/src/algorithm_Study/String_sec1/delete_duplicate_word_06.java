package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 6. �ߺ���������
����

�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.


���� �Է� 1 

ksekkset
���� ��� 1

kset
 */
public class delete_duplicate_word_06 {
	public static String solution(String str)
	{
		String answer ="";
		
		for(int i=0; i<str.length();i++)
		{
			if(str.indexOf(str.charAt(i))==i) //indxof => ���ڰ� ó�� ��Ÿ���� �ε��� ��ġ  - onenote ���� ����
			{
				// i�� indexof �� ������ �ߺ��� �ƴ� ����
				answer+=str.charAt(i);
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
