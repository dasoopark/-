package jinsscoding;

import java.util.Scanner;

public class recursiv_numcipher {
	
	public static void extract(int N)
	{
		//123 => 12 => 1
		if(N/10==0) {
			System.out.println(N);
			return;
		}
		extract(N/10);
		System.out.println(N%10);
			
	}

	public static void main(String[] args) {
		// 입력된 수를 높은 자릿수 부터 출력하시오
		// 2312    
		// 정답:
		/*
		  2 
		  3
		  1
		  2
		 */
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		extract(input);

	}

}
