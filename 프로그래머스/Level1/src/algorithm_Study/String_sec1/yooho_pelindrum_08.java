package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 8. ��ȿ�� �Ӹ����
����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.

���ĺ� �̿��� ���ڵ��� �����մϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.


���� �Է� 1 

found7, time: study; Yduts; emit, 7Dnuof
���� ��� 1

YES
 */
public class yooho_pelindrum_08 {
	
	public static String solution(String s)
	{
		String answer ="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", ""); //replace���� ���Խ� ������ replaceall���� ���Խ� �� �� ���� 
		// ^=>���� ���� A-Z�� �ƴϸ�,  , ""�� ��ü�ض� => ��ǥ, ���� �� ���ŵ�!!
		String tmp = new StringBuilder(s).reverse().toString();
		
		if(s.equals(tmp))
		{
			answer="YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(solution(str));
	}

}
