package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 7. ȸ�� ���ڿ�
����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.


���� �Է� 1 

gooG
���� ��� 1

YES
 */
public class hoimoon_07 {
	public static String solution(String str)
	{
		String answer ="YES";
		str = str.toUpperCase();
		int len = str.length();
		
		for(int i=0; i<len/2 ; i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1)) // good ���� 0 �� 3(�ε���) �� �Ϸ���  len-i-1 ����� ��  4-0-1
			{
				answer = "NO";
			}
		}
		return answer;
	}
	
	public static String solution_builder(String str)
	{
		String answer ="NO";
		String tmp = new StringBuilder(str).reverse().toString(); //���������� ��
		
		if(str.equalsIgnoreCase(tmp)) //equalsIgnoreCase : �빮�� �����ϰ� ���ϴ� ���
		{
			answer="YES";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution_builder(str));
	}

}
