package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 10. ���� ª�� ���ڰŸ�
����

�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.

���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.


���� �Է� 1 

teachermode e
���� ��� 1

1 0 1 2 1 0 1 2 2 1 0

 */
public class shortest_wordpath_10 {
	static int[] solution(String s, char t)
	{
		int [] answer = new int[s.length()];
		int p = 1000;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==t)
			{
				p=0;
				answer[i] = p; 
			}
			else
			{
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=s.length()-1; i>=0; i--) //�ǵڿ��� ����
		{
			if(s.charAt(i)==t)
			{
				p=0;
			}
			else
			{
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0); //���� �� �� �д� ���!! ����ϱ�
		for(int x : solution(str,c))
		{
			System.out.print(x+" ");
		}

	}

}
