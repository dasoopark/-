package jinsscoding;

import java.util.Scanner;

public class recursiv_2jinsoo {
	
	public static void decToBin(int num)
	{
		
		if(num==1) {
			System.out.println(num);
			return;
		}
		/*
		 17 / 2 = 8 - 1   (1)   (10) 종료 - 끝 => 1반환
		 8  / 2 = 4  - 0   (2)  (9) 종료
		 4  / 2 = 2  - 0   (3)  (8) 종료
		 2  / 2 = 1  - 0   (4)  (7) 종료
		 1  / 2 = 0  - 1   (5)리턴  (6) 종료
		 */
		decToBin(num/2);
	    System.out.println(num%2);
		
	}

	public static void main(String[] args) {
		// 2진수 변환(재귀 버전)
		// 입력된 수를 이진수로 변환하세요
		// 입력:17 
		// 정답 10001
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		decToBin(input);
	}

}
