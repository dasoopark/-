package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 2. ��ҹ��� ��ȯ
����

�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.


���� �Է� 1 
StuDY
���� ��� 1

sTUdy

 */
public class dae_so_change_02 {
	public static String solution(String str)
	{
		String answer ="";
		for(char x : str.toCharArray())
		{
			if(Character.isLowerCase(x)) //Character �Լ� �� ����Ұ�
			{
				answer+=Character.toUpperCase(x); //�ҹ��ڸ� �빮��
			}
			else
			{
				answer+=Character.toLowerCase(x);
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
