package jinsscoding;

import java.util.Scanner;

public class recursive_numplus {

	static int cache[] = new int[1000];
	
	public static int doFunc(int n)
	{
		if(cache[n] != 0) {
			return cache[n];
		}
		
		return cache[n] = doFunc(n-1) + doFunc(n-2) + doFunc(n-3);
		// n=5일때    5           4(호출)           3(리턴)        2(리턴)
		// n=4일때    4            3(리턴)          2(리턴)         1(리턴)
		//다시 n=5일 때로 돌아와서 doFunc 5 리턴
	}
	public static void main(String[] args) {
		/*
		  정수 4를 1,2,3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
		 1+1+1+1
		 1+1+2
		 1+2+1
		 2+1+1
		 2+2
		 1+3
		 3+1 
		 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오
		 
		 예제입력:
		 4
		 7
		 10
		 출력
		 7
		 44
		 274
		 
		 [n] = [n-1] + [n-2] + [n-3] 점화식
		 */
		
	int n;
	cache[1] = 1;
	cache[2] = 2;
	cache[3] = 4;  //점화식을 사용하기 위해선 1,2,3항이 필요하므로 직접 하드코딩
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	System.out.println(doFunc(n));
		

	}

}
