package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 7. 조합의 경우수(메모이제이션)
설명

Image1.jpg로 계산합니다.

하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.

Image1.jpg
nCr =  n-1Cr-1 + n-1Cr
입력
첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.


출력
첫째 줄에 조합수를 출력합니다.


예시 입력 1 
5 3
예시 출력 1

10
예시 입력 2 

33 19
예시 출력 2
818809200
 */
public class johap_07 {
	static int[][] dy = new int[35][35]; //메모이 제	이션
	static int DFS(int n, int r)
	{
		if(dy[n][r]>0) return dy[n][r];//구해져 있다면 뻗지말아라
		if(n==r || r==0) 
		{
			return 1;
		}
		else
		{
			return dy[n][r] =  DFS(n-1, r-1)+ DFS(n-1,r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(DFS(n,r));
	}

}
