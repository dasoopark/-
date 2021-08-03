package algorithm_Study.Recursive_Tree_Graph_sec7;

import java.util.LinkedList;
import java.util.Queue;

/*
 설명

현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.

현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
송아지는 움직이지 않고 제자리에 있다.
현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.


입력
첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.

출력
점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.

예시 입력 1 
5 14

예시 출력 1
3
 */
public class find_cow_BFS_08 { //BFS 문제!!!!!!!!!!!!!!!
	int answer = 0;
	static int[] dis = {1,-1,5};
	static int[] ch; //한번 Q에 들어간거 (중복 경우 제거)
	static Queue<Integer> Q = new LinkedList<>();
	
	static int BFS(int s, int e)
	{
			ch =  new int[10001]; //좌표가 1부터 10.000 까지니깐
			ch[s] = 1;
			Q.offer(s); //시작지
			
			int L =0;
			while(!Q.isEmpty()) //비어있을때 멈춘다
			{
				int len = Q.size(); //레벨에 있는 원소의 개수 ,0 레벨 은 1개 , 1레벨은 3개 // 원노트 그림 참고
				for(int i=0;i<len;i++)
				{
					int x = Q.poll(); //원소 꺼냄
					
					for(int j=0; j<3;j++)
					{
						int nx = x+dis[j]; //자식노드 
						if(nx==e)
						{
							return L+1;
						}
						if(nx>=1 && nx<=10000 && ch[nx]==0) //ch가 0이면 방문 안한거임
						{
							Q.offer(nx);
						}
					}
				}
				L++;
			}
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 5;
		int e = 14;
		System.out.println(BFS(s,e));
	}

}
