package algorithm_Study.stack_queue_sec5;

import java.util.Scanner;
import java.util.Stack;

/*
 //���� ��� ��ǥ ���� (LIFO) => Last in First Out
  * 
 1. �ùٸ� ��ȣ
����

��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.

(())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.


�Է�
ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.


���
ù ��° �ٿ� YES, NO�� ����Ѵ�.


���� �Է� 1 

(()(()))(()
���� ��� 1

NO

 */
public class right_parenthesis_01 {
	static String solution(String str)
	{
		String answer = "YES";	
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) //���ڹ迭 �ϳ� ����
		{
			if(x=='(')
			{
				stack.push(x); //�� �� x�� ���� ��ȣ
			}
			else
			{
				if(stack.isEmpty()) //�ݴ� ��ȣ�� ���Դµ� ������ ����ִ� ���? - ¦�� �ȸ´� �ٴ� ���̹Ƿ� �ùٸ������� ��ȣ
					//�ݴ� ��ȣ�� ���� ���
				{
					return "No";
				}
				stack.pop();
			}
			if(!stack.isEmpty()) //���ÿ� ���� ������ ���� �Ǵ°� //���� ��ȣ�� ���Ƽ� ���ÿ� �����ִ� ��츦 �ǹ�
 			{
				return "No";
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
