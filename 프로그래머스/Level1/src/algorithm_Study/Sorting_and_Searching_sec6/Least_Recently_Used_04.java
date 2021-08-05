package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.Scanner;

/*
 설명

캐시메모리는 CPU와 주기억장치(DRAM) 사이의 고속의 임시 메모리로서 CPU가 처리할 작업을 저장해 놓았다가
필요할 바로 사용해서 처리속도를 높이는 장치이다. 워낙 비싸고 용량이 작아 효율적으로 사용해야 한다.
철수의 컴퓨터는 캐시메모리 사용 규칙이 LRU 알고리즘을 따른다.
LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면 가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.
캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.


Image1.jpg  -==> OneNote 참고  -- 문제!!

캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 캐시의 크기인 S(3<=S<=10)와 작업의 개수 N(5<=N<=1,000)이 입력된다.
두 번째 줄에 N개의 작업번호가 처리순으로 주어진다. 작업번호는 1 ~100 이다.

출력
마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력합니다.


예시 입력 1 

5 9
1 2 3 2 6 2 3 5 7
예시 출력 1

7 5 3 2 6

 */
public class Least_Recently_Used_04 {
	static int[] solution(int size, int n, int[] arr)
	{
		int [] cache = new int[size];
		for(int x : arr)
		{
			//x가 캐시에 있는지 확인 해야함 Hit or Miss 유무
			int pos = -1; //pos== 인덱스 번호 /위치
			
			for(int i=0; i<size;i++)
			{
				if(x==cache[i]) //Hit일때
				{
					pos = i; //Hit 일때는 인덱스 저장 미스일때는 그대로 -1
				}
			}
				if(pos == -1) //Miss 상황
				{
					for(int j=size-1;j>=1;j--)
					{
						cache[j]=cache[j-1]; // 미스일 때는 땡겨줘라!! 
					}
					cache[0]=x;
				}
				else //Hit 처리
				{
					for(int j=pos;j>=1;j--)
					{
						cache[j]=cache[j-1]; // 히트일 때는 해당 인덱스에서 앞에있는 부분만 뒤로 밀어주면됨 ! 
					}
					cache[0]=x;
				}
				
			}
		
		
		return cache;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=kb.nextInt();
		}
		for(int x : solution(s,n,arr))
		{
			System.out.print(x+ " ");
		}

	}

}
