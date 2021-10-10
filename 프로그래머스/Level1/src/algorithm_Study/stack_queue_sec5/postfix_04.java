package algorithm_Study.stack_queue_sec5;

import java.util.Scanner;
import java.util.Stack;

/*
 4. ������ ����(postfix)
����

����������� �־����� ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

���� 3*(5+2)-9 �� ������������� ǥ���ϸ� 352+*9- �� ǥ���Ǹ� �� ����� 12�Դϴ�.


�Է�
ù �ٿ� ����������� �־����ϴ�. ������� ���̴� 50�� ���� �ʽ��ϴ�.

���� 1~9�� ���ڿ� +, -, *, / �����ڷθ� �̷������.


���
������ ����� ����մϴ�.


���� �Է� 1 

352+*9-
���� ��� 1

12
 */
public class postfix_04 {
	
	static int solution(String str)
	{
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray())
		{
			if(Character.isDigit(x)) //���� �̳�???
			{
				stack.push(x-48); //x�� ���ڰ�, 48�� �ƽ�Ű�ڵ� 0  �� x-48�� �ؾ� ���ڷ� ��޵Ǽ� �� 
			}
			
			else //������ ������ ��
			{
				int rt = stack.pop(); //ù��° ����
				int lt = stack.pop(); //�ι�° ����
				
				if(x=='+')
				{
					stack.push(lt+rt); //���Ѱ� �ٽ� �־��ָ� �� 
				}
				else if(x=='-')
				{
					stack.push(lt-rt); //�ι�°���� ù��°�� �� ��� ����X
				}
				else if(x=='*')
				{
					stack.push(lt*rt);
				}
				else if(x=='/')
				{
					stack.push(lt/rt);
				}
			}
		}
		answer = stack.get(0); //�������� �ִ°� �� ��갪
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));

	}

}
