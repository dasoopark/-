package jinsscoding;

import java.util.Scanner;

public class recursiv_sum {

	public static int calAccSum(int start, int end) {
		
		if(start==end) {
			return end;
		}
		//end 값이 1씩 줄어들면됨
		return end + calAccSum(start, end-1);
		// 
	}
	public static void main(String[] args) {
		// 누적합 재귀 ver
		// 입력된 두 수 까지의 합을 구하시오 (재귀함수를 이용 하시오)
		// 1 4 입력
		// => 1+2+3+4 => 10 
	
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		
		start = scan.nextInt();
		end = scan.nextInt();
		
		int ans = 0;
		ans = calAccSum(start, end);
		System.out.println(ans);
		
		
	}

}
