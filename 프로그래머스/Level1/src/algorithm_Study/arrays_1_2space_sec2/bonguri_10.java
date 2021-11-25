package algorithm_Study.arrays_1_2space_sec2;

import java.util.Scanner;

/*
 10. ���츮
����

���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.

�� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.

������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.

���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.

Image1.jpg


�Է�
ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)

�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.


���
���츮�� ������ ����ϼ���.


���� �Է� 1 

5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
���� ��� 1

10
 */
public class bonguri_10 {
	static int []dx = {-1,0,1,0};
	static int []dy = {0,1,0,-1};
	static int solution(int n, int[][] arr)
	{
		int answer = 0 ;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n ; j++)
			{
				boolean flag = true;
				
				for( int k = 0 ; k<4 ; k++) // �������� üũ�� �ݺ���
				{
					int nx = i + dx[k];
					int ny = j + dy[k];
					if( nx>=0 && nx < n && ny >=0 && ny < n && arr[nx][ny]>=arr[i][j] )  //ū�� �ϳ��� ������ ���츮�� �ƴ�
					{
						flag = false;
						break;
					}
					
				}
				if(flag)
				{
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(solution(n,arr));

	}

}
