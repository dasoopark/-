package algorithm_Study.stack_queue_sec5;

import java.util.Scanner;
import java.util.Stack;

/*
 2. ��ȣ��������
����

�Էµ� ���ڿ����� �Ұ�ȣ ( ) ���̿� �����ϴ� ��� ���ڸ� �����ϰ� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
���� ���ڸ� ����Ѵ�.


���� �Է� 1 

(A(BC)D)EF(G(H)(IJ)K)LM(N)
���� ��� 1

EFLM
 */
public class delete_parenthesis_02 {
	static String solution(String str)
	{
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray())
		{
			if(x==')') //�ݴ� ��ȣ�϶� ��������
			{
				while(stack.pop()!='(')
				{
					
				}
			}
			else 
			{
				stack.push(x); //���ĺ� �ƴϸ� ���� ��ȣ �� ��
			}
		}
		for(int i=0; i<stack.size();i++)
		{
			answer+=stack.get(i);
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
