package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/*
 5. 동전교환
설명

다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
각 단위의 동전은 무한정 쓸 수 있다.


입력
첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.

출력
첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.

예시 입력 1 

3
1 2 5
15
예시 출력 1

3
힌트

 */


public class coin_exchange_05 {
	static int n, m, answer = Integer.MAX_VALUE;
	static void DFS(int L, int sum, int[] arr)
	{
		if(sum>m)
		{
			return; //무한으로 안돌기 위한 방법
		}
		if(sum == m ) //m => 거슬러 주는  금액이 됐을 때
		{
			answer = Math.min(answer, L); //L은 sum을 만들어내는 동전의개수, 최종값 보다 작으면 바꿔주면 됨 
		}
		else
		{
			for(int i=0; i<n; i++)
			{
				DFS(L+1, sum+arr[i], arr); //L+1 =>동전 개수 하나 사용하는거니까 증가시켜줘야함
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			
			arr[i]=kb.nextInt();
		}
		m = kb.nextInt();
		DFS(0, 0, arr);
		System.out.println(answer);

	}

}
