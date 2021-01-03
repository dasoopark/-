package jinsscoding;

import java.util.Scanner;

public class recursive_factorial {

	
	public static int calFact(int i)
	{
		
		if(i == 1) {
			return 1;
		}
		return i * calFact(i-1); //끝나는 조건 생각 할 것
		
		
	}
	
	
	
	public static void main(String[] args) {
		// 입력된 수의 팩토리얼을 구하시오 반복문 중점이 아닌 재귀적 중점으로 풀 것
		// 5
		// 정답: 120
		
		int input;
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		int ans = 0;
		
		ans = calFact(input);
		
		System.out.println(ans);
	}

}
