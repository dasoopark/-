package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 . ���� ã��
����

�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.

��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.

���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� �ش� ������ ������ ����Ѵ�.


���� �Է� 1 

Computercooler
c
���� ��� 1

2
 */
public class find_string_01 {
	static int solution(String str, char t)
	{
		int answer = 0;
		str = str.toUpperCase(); //�빮�ڷ� ����
		t = Character.toUpperCase(t);
		
		for(int i=0; i< str.length(); i++)
		{
			if(str.charAt(i)==t)
			{
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0); //ù��° ����
		System.out.println(solution(str, c));

	}

}
