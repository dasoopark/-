package algorithm_Study.Recursive_Tree_Graph_sec7;

/*
 자연수 N이 주어지면, 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 
 입력설명
 첫 번째 줄에, 자연수 N(1<=N<=10)이 주어집니다.
 
 출력설명
 첫 번 째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다.
 단 공집합은 출력하지 않습니다.
 
 입력예제1
 3
 
 출력예제1
 1 2 3
 1 2
 1 3
 1
 2 3
 2
 3
 
 */

/*
 풀이
  2^n개  => 부분집합의 총 개수
 */
public class dfs_subset_06 {
	static int n;
	static int[] ch; // 체크 용
	
	static void DFS(int L)
	{
		if(L==n+1)
		{
			String tmp="";
			for(int i=1; i<=n;i++)
			{
				if(ch[i]==1)
				{
					tmp+=(i+" ");
				}

			}
			if(tmp.length()>0)
			{
				System.out.println(tmp);
			}
		}
		else
		{
			ch[L]=1; //사용하면 1
			DFS(L+1); //왼 쪽으로 뻗음
			ch[L]=0; //사용 안하면 0
			DFS(L+1); //오른쪽으로 뻗음
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 3;
		ch = new int[n+1]; 
		DFS(1);
	}

}
