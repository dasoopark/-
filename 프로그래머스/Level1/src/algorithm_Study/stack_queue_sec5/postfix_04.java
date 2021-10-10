package algorithm_Study.stack_queue_sec5;

import java.util.Scanner;
import java.util.Stack;

/*
 4. 후위식 연산(postfix)
설명

후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.

만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.


입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.

식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.


출력
연산한 결과를 출력합니다.


예시 입력 1 

352+*9-
예시 출력 1

12
 */
public class postfix_04 {
	
	static int solution(String str)
	{
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray())
		{
			if(Character.isDigit(x)) //숫자 이냐???
			{
				stack.push(x-48); //x는 문자고, 48은 아스키코드 0  즉 x-48을 해야 숫자로 취급되서 들어감 
			}
			
			else //연산자 만났을 때
			{
				int rt = stack.pop(); //첫번째 숫자
				int lt = stack.pop(); //두번째 숫자
				
				if(x=='+')
				{
					stack.push(lt+rt); //더한걸 다시 넣어주면 됨 
				}
				else if(x=='-')
				{
					stack.push(lt-rt); //두번째에서 첫번째를 빼 줘야 문제X
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
		answer = stack.get(0); //마지막에 있는게 총 계산값
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));

	}

}
