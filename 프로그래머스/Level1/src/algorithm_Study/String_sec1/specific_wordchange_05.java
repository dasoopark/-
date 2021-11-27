package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 5. Ư�� ���� ������
����

���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,

Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.


���
ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.


���� �Է� 1 
a#b!GE*T@S

���� ��� 1
S#T!EG*b@a


 */
public class specific_wordchange_05 {
	static public String solution(String str)
	{
		String answer;
		char[] s = str.toCharArray(); //���� �迭
		int lt = 0, rt = str.length()-1; //�ǳ� ���ڿ�, 0�� �ε��� ���� �����ϴϱ�
		  
		while(lt<rt)
		{
			if(!Character.isAlphabetic(s[lt])) //���ĺ��̸� �� ��ȯ 
			{
				lt++;
			}
			else if(!Character.isAlphabetic(s[rt]))
			{
				rt--;
			}
			else 
			{
				char tmp = s[lt]; 
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			
		}
		answer = String.valueOf(s); // answer�� String�����̹Ƿ� char�� �迭 s�� String���� �ٲ������.
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));

	}

}
