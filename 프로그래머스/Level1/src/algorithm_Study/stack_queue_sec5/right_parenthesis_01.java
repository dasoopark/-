package algorithm_Study.stack_queue_sec5;

import java.util.Scanner;
import java.util.Stack;

/*
 //스택 사용 대표 문제 (LIFO) => Last in First Out
  * 
 1. 올바른 괄호
설명

괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.


입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.


출력
첫 번째 줄에 YES, NO를 출력한다.


예시 입력 1 

(()(()))(()
예시 출력 1

NO

 */
public class right_parenthesis_01 {
	static String solution(String str)
	{
		String answer = "YES";	
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) //문자배열 하나 생성
		{
			if(x=='(')
			{
				stack.push(x); //이 때 x는 여는 괄호
			}
			else
			{
				if(stack.isEmpty()) //닫는 괄호가 나왔는데 스택이 비어있는 경우? - 짝이 안맞는 다는 뜻이므로 올바르지않은 괄호
					//닫는 괄호가 많은 경우
				{
					return "No";
				}
				stack.pop();
			}
			if(!stack.isEmpty()) //스택에 뭔가 있으면 참이 되는거 //여는 괄호가 많아서 스택에 남아있는 경우를 의미
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
